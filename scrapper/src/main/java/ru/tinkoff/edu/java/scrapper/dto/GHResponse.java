package ru.tinkoff.edu.java.scrapper.dto;

import java.time.OffsetDateTime;

public record GHResponse(String name, OffsetDateTime updatedAt) {
}