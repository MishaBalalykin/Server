package com.study.rest.services.Impl;

import com.study.rest.entity.Remind;
import com.study.rest.repository.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.study.rest.services.API.ReminderService;

import java.util.List;

@Service
public class ReminderSeviceImpl implements ReminderService {

    @Autowired
    RemindRepository remindRepository;

    public List<Remind> getAllReminders() {
        return remindRepository.findAll();
    }

    public Remind getReminder(long id) {
        return remindRepository.findOne(id);
    }

    public Remind save(Remind remind) {
        return remindRepository.saveAndFlush(remind);
    }

    public void remove(long id) {
        remindRepository.delete(id);
    }
}
