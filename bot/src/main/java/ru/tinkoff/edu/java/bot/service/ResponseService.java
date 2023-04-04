package ru.tinkoff.edu.java.bot.service;

import org.springframework.stereotype.Component;
import org.telegram.abilitybots.api.objects.MessageContext;
import ru.tinkoff.edu.java.bot.dto.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class ResponseService {

    public String startResponse(User user, Long ctx){
        user = new User(ctx.intValue(),null,"newer",new int[5]);
        user.links=new ArrayList<>();
        return "Dont start again\uD83D\uDE24";
    }

    public String trackResponse(User user, String secondArg){
        if(user!=null&&user.links!=null)
            user.links.add(secondArg);
        else return "press command start to begin";
        return "Link succefully added";
    }

    public String untrackResponse(User user, Long ctx){
        if(user!=null&&user.links!=null)
            return "Untracked";
        return "Link succefully added";
    }

    public String listResponse(User user, Long ctx){
        if(user!=null&&user.links!=null)
            if (!user.links.isEmpty()) return "The command 'list' was used. Links: " + user.links.toString();
        return "The command 'list' was used. There is no links ";
    }
}
