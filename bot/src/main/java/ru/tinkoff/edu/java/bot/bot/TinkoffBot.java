package ru.tinkoff.edu.java.bot.bot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.abilitybots.api.bot.AbilityBot;
import org.telegram.abilitybots.api.objects.Ability;

import static org.telegram.abilitybots.api.objects.Locality.ALL;
import static org.telegram.abilitybots.api.objects.Privacy.PUBLIC;
@Component
public class TinkoffBot extends AbilityBot {

    public Ability startCommand() {
        return Ability
                .builder()
                .name("start")
                .locality(ALL)
                .privacy(PUBLIC)
                .action(ctx -> silent.send("Dont start again😤", ctx.chatId()))
                .build();
    }
    public Ability helpCommand() {
        return Ability
                .builder()
                .name("help")
                .locality(ALL)
                .privacy(PUBLIC)
                .action(ctx -> silent.send("God will help you😇", ctx.chatId()))
                .build();
    }
    public Ability trackCommand() {
        return Ability
                .builder()
                .name("track")
                .locality(ALL)
                .privacy(PUBLIC)
                .action(ctx -> silent.send("The command 'track' was used. My man..", ctx.chatId()))
                .build();
    }
    public Ability untrackCommand() {
        return Ability
                .builder()
                .name("untrack")
                .locality(ALL)
                .privacy(PUBLIC)
                .action(ctx -> silent.send("Ohhh... no... The command 'untrack' was used!", ctx.chatId()))
                .build();
    }
    public Ability listCommand() {
        return Ability
                .builder()
                .name("list")
                .locality(ALL)
                .privacy(PUBLIC)
                .action(ctx -> silent.send("The command 'list' was used. That's real sh*t", ctx.chatId()))
                .build();
    }




    @Override
    public long creatorId() {
        return 0;
    }

    protected TinkoffBot(@Value("${bot.token}") String botToken,
                      @Value("${bot.name}") String botName)
    {
        super(botToken, botName);
    }
}
