package com.study.rest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Configuration - конфигурация, которую нужно выполнить перед тем как разворачивать контекст спринга
 * @EnableWebMvc - включает режим WebMVC, позволяет использовать контроллеры
 * @ComponentScan("com.study.rest") - где поискать

 */

@Configuration
@EnableWebMvc
@ComponentScan("com.study.rest")
public class WebConfig extends WebMvcConfigurerAdapter {

}
