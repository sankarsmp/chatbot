package com.hackathon.chatbot.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.chatbot.Chatbot;

@RestController
@RequestMapping("/command")
public class CommandController {
	Logger logger = LogManager.getLogger(CommandController.class);
	@Autowired
	Chatbot chatbot;
	@PostMapping("/service")
    public String commandProcessor(@RequestParam("commandInput") String commandInput) {
        logger.info("logcommandInput:"+commandInput);
        String response = chatbot.processRequest(commandInput);
        logger.info("response:"+response);
		return response;
    }

}
