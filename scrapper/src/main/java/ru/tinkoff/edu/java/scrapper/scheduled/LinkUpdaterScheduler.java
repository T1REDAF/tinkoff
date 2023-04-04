package ru.tinkoff.edu.java.scrapper.scheduled;

import org.apache.logging.log4j.LogManager;
import org.springframework.scheduling.annotation.Scheduled;

public class LinkUpdaterScheduler {

    @Scheduled(fixedDelayString = "#{app.scheduler.interval}")
    public void update(){
        LogManager.getLogger().info("Sheduled");
    }
}