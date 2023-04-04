package ru.tinkoff.edu.java.bot.service;

import org.springframework.stereotype.Component;
import org.telegram.abilitybots.api.objects.MessageContext;
import ru.tinkoff.edu.java.bot.dto.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class ResponseService {

    public String startResponse(User user, Long ctx){

        return "Welcome\uD83D\uDE24";
    }

    public String trackResponse(User user, String secondArg){
        if(user!=null)
            if (user.links!=null) {
                user.links.add(secondArg);
                return "Link succefully added";
        }
        return "Press /start";

    }

    public String untrackResponse(User user, Long ctx){
        if(user!=null&&user.links!=null)
            return "Untracked";
        return "Link succefully added";
    }

    public String listResponse(User user, Long ctx){
        if(user!=null)
            return "The command 'list' was used. Links: " + user.links.toString();
        return "The command 'list' was used. There is no links";
    }
}
