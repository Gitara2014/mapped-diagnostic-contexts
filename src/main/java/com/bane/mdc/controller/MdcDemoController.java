package com.bane.mdc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MdcDemoController {

    @GetMapping("/hello")
    public String greetings() {
        log.info("Hello from MDC Controller");
        return "Hello!";
    }

}
