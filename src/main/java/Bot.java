import commands.Calculate;
import commands.InviteCommand;
import events.Helloevent;
import events.helloeventpractice;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;

import javax.security.auth.login.LoginException;

public class Bot {
    public static void main(String[] args) throws LoginException {
        //creating object from class
        JDA jda= JDABuilder.createDefault("ODk3MTU5MTA0MTczMzMwNDky.YWRmhg.IoBNhQu-_Jt1r2WRX0gSLZlPjlM").build();
       // jda.getPresence().setStatus(OnlineStatus.IDLE);

        //jda.getPresence().setGame(Game.watching("Youtube"));
       // jda.addEventListener(new Helloevent());
        jda.getPresence().setPresence(OnlineStatus.DO_NOT_DISTURB,true);

       // jda.addEventListener((new helloeventpractice()));
        Helloevent helloevent=new Helloevent();
        jda.addEventListener((new Helloevent()));
        jda.addEventListener(new Calculate());
        jda.addEventListener(new InviteCommand());

    }
}
