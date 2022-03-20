package events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Helloevent extends ListenerAdapter {


    //a more advanced example
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String[] args = event.getMessage().getContentRaw().split(" ");
        String name = event.getMember().getUser().getName();

    if(args[0].equalsIgnoreCase("hi")){
           if(!event.getMember().getUser().isBot()){
                event.getChannel().sendMessage("Hello "+name ).queue();
            }
        }
    }
}