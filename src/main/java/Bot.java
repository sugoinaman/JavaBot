import events.helloeventpractice;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;

import javax.security.auth.login.LoginException;

public class Bot {
    public static void main(String[] args) throws LoginException {
        //creating object from class
        JDA jda= JDABuilder.createDefault("ODk3ODk2MTQ5MjcxMzQzMTI1.YWcU9A.16Z50l-TfHhQMXnEs38Jlco9ng0").build();
        jda.getPresence().setStatus(OnlineStatus.DO_NOT_DISTURB);
       // jda.getPresence().setGame(Game.watching("Youtube"));
       // jda.addEventListener(new Helloevent());
        jda.addEventListener((new helloeventpractice()));

    }
}
