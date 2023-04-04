package ru.tinkoff.edu.java.bot.bot;

import junit.framework.TestCase;
import org.junit.Assert;

public class TinkoffBotTest extends TestCase {

    @Test
    public void ListExistsResponseTest(){
        tgBotMethods.setHasList(true);
        Assert.assertEquals("������",getResponse("/list"));
    }
    @Test
    public void ListNotExistsResponseTest(){
        tgBotMethods.setHasList(false);
        Assert.assertEquals("��� ������",tgBotMethods.getResponse("/list"));
    }
}