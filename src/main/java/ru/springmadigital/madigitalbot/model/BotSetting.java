package ru.springmadigital.madigitalbot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.springmadigital.madigitalbot.botwork.StartMainBot;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class BotSetting {
    private String name;
    private String botkey;
    private String localDate;



}
