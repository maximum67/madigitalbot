package ru.springmadigital.madigitalbot.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class BotSetting {
    private String name;
    private String botkey;
    private String localDate;



}
