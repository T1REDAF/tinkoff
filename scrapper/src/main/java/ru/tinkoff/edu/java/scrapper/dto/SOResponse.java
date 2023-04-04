package ru.tinkoff.edu.java.scrapper.dto;

import java.time.OffsetDateTime;

public record SOResponse(String title, OffsetDateTime updatedAt) {
}