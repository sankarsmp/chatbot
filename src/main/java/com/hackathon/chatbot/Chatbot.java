package com.hackathon.chatbot;

import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;
import org.springframework.stereotype.Component;
@Component
public class Chatbot {
	Bot bot;
	Chat chatSession;
	public Chatbot() {
		String classpathStr = Chatbot.class.getClassLoader().getResource("").getPath();
		System.out.print("test:"+classpathStr);
		bot = new Bot("super", classpathStr);
		chatSession = new Chat(bot);
		bot.brain.nodeStats();
	}

	static String botName = "super";
	
	public String processRequest(String request) {
		String response = chatSession.multisentenceRespond(request);
		return response;
	}
}
