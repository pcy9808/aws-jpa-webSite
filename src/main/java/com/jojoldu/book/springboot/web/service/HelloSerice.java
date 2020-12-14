package com.jojoldu.book.springboot.web.service;

import org.springframework.stereotype.Service;

@Service
public class HelloSerice {

    public String getTodo() {
        return "service.todolist.springBoot";
    }

}
