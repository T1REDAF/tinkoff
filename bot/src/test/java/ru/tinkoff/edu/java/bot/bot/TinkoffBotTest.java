package ru.tinkoff.edu.java.bot.bot;

import junit.framework.TestCase;
import org.junit.Assert;

public class TinkoffBotTest extends TestCase {

    @Test
    public void ListExistsResponseTest(){
        tgBotMethods.setHasList(true);
        Assert.assertEquals("Список",getResponse("/list"));
    }
    @Test
    public void ListNotExistsResponseTest(){
        tgBotMethods.setHasList(false);
        Assert.assertEquals("Нет списка",tgBotMethods.getResponse("/list"));
    }
}