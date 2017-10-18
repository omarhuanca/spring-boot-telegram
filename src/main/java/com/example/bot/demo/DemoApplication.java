package com.example.bot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		// Initialize Api Context
		ApiContextInitializer.init();

		// Instantiate Telegram Bots API
		TelegramBotsApi botsApi = new TelegramBotsApi();

		// Register our bot
		try {
			botsApi.registerBot(new MyAssistant());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}
}
