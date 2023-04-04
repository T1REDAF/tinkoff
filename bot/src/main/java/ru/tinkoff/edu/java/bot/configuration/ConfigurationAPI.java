package ru.tinkoff.edu.java.bot.configuration;

import org.springframework.context.annotation.Bean;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import ru.tinkoff.edu.java.bot.bot.TinkoffBot;

@org.springframework.context.annotation.Configuration
public class ConfigurationAPI {
    private final TinkoffBot tinkoffBot;

    public ConfigurationAPI(TinkoffBot tinkoffBot) {
        this.tinkoffBot = tinkoffBot;
    }

    @Bean
    public TelegramBotsApi api(){
        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(tinkoffBot);
            return telegramBotsApi;
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
        return null;
    }
}
