package com.study.rest;

import com.study.rest.config.WebConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * onStartup выполняется перед или в момент разворачивания сервлет контекста
 */
public class ApplicationInitializer implements WebApplicationInitializer {
    private final static String DISPATCHER = "dispatcher";

    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext(); // Создаем контекст

        context.register(WebConfig.class);
        servletContext.addListener((new ContextLoaderListener(context)));

        ServletRegistration.Dynamic servlet = servletContext.addServlet(DISPATCHER, new DispatcherServlet(context));
        servlet.addMapping("/"); // то что полсе localhost:8080, то же должно быть и в конфиге томката
        servlet.setLoadOnStartup(1); // порядок инициализации, нужно если несколько сервлетов
    }
}
