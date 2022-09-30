package com.hackathon.chatbot;

import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;
import org.springframework.stereotype.Component;
@Component
public class Chatbot {
	Bot bot;
	Chat chatSession;
	public Chatbot() {
		bot = new Bot("super", "./src/main/resources/");
		chatSession = new Chat(bot);
		bot.brain.nodeStats();
	}

	static String botName = "super";
	
	public String processRequest(String request) {
		String response = chatSession.multisentenceRespond(request);
		return response;
	}
}
