package com.example.taskmanagement.controller;


import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@AllArgsConstructor(onConstructor = @__(@Autowired))
@Log4j2

public class Controller {
    @PostMapping("/test")
    void test(){
        log.info("test");
    }
}
