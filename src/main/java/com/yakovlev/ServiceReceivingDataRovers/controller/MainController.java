package com.yakovlev.ServiceReceivingDataRovers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Map<String, Object> model) {
        return "main";
    }
    @GetMapping("/rover")
    public String dataRover(Map<String, Object> model) {
        return "rover";
    }
}
