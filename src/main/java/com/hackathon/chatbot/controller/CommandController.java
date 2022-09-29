package com.hackathon.chatbot.controller;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/command")
public class CommandController {
	Logger logger = LogManager.getLogger(CommandController.class);
	@PostMapping("/service")
    public String commandProcessor(@RequestParam("commandInput") String commandInput) {
        System.out.println("commandInput:"+commandInput);
        logger.info("logcommandInput:"+commandInput);
		return "Hello, World!";
    }

}
