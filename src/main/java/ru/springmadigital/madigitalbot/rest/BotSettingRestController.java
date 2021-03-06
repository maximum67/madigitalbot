package ru.springmadigital.madigitalbot.rest;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import ru.springmadigital.madigitalbot.model.BotSetting;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/v1/botsetting")
public class BotSettingRestController {
    private List<BotSetting> botSettings = Stream.of(
            new BotSetting("telegabot1", "HHHHHHHH", "2021,12,11"),
            new BotSetting("telegabot2", "MMMMMMMM", "2021,12,12"),
            new BotSetting("telegabot3", "PPPPPPPP", "2021,12,13")
    ).collect(Collectors.toList());

    @GetMapping
    public List<BotSetting> getAll(){
        return botSettings;
    }

    @GetMapping("/{name}")
    @PreAuthorize("hasAuthority('setting:read')")
    public BotSetting getById(@PathVariable String name){
        return botSettings.stream().filter(botSetting -> botSetting.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
    @PostMapping
    @PreAuthorize("hasAuthority('setting:write')")
    public BotSetting create(@RequestBody BotSetting botSetting){
        this.botSettings.add(botSetting);
        return botSetting;
    }
    @DeleteMapping("/{name}")
    @PreAuthorize("hasAuthority('setting:write')")
    public void deleteById(@PathVariable String name){
        this.botSettings.removeIf(developer -> developer.getName().equals(name));
    }

}
