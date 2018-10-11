package com.study.rest.services.API;

import com.study.rest.entity.Remind;

import java.util.List;

public interface ReminderService {
    List<Remind> getAllReminders();
    Remind getReminder(long id);
    Remind save(Remind remind);
    void remove(long id);
}
