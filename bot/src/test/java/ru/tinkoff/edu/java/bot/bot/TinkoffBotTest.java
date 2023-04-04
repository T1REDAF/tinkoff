package ru.tinkoff.edu.java.bot.bot;

import jakarta.ws.rs.core.Application;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import ru.tinkoff.edu.java.bot.dto.User;
import ru.tinkoff.edu.java.bot.service.ResponseService;

import java.util.ArrayList;
@SpringBootTest
public class TinkoffBotTest {
    private ResponseService responseService;

    @Before
    public void setBot(){
        responseService = new ResponseService();
    }

    @Test
    public void ListExistsResponseTest(){
        User newUser = new User(1,null,"newer",new int[5]);
        newUser.links=new ArrayList<>();
        newUser.links.add("fwe");
        newUser.links.add("mge");
        responseService.startResponse(newUser,1l);
        String check = responseService.listResponse(newUser,123l);

        Assert.assertEquals("The command 'list' was used. Links: [fwe, mge]",check);
    }
    @Test
    public void ListNotExistsResponseTest(){
        User newUser = new User(1,"123","33",null);
        String check = responseService.listResponse(newUser,123l);

        Assert.assertEquals("The command 'list' was used. There is no links ",check);
    }
}