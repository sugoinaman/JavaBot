package events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class helloeventpractice extends ListenerAdapter {


    //a more advanced example
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String[] args = event.getMessage().getContentRaw().split(" ");
        String name = event.getMember().getUser().getName();
//event.getMember().getUser().getAsTag();
        if(args[0].equalsIgnoreCase("hi")){
            if(!event.getMember().getUser().isBot()){
                event.getChannel().sendMessage("hi "+ name+", your ID is \n"+event.getMember().getUser().getAsTag()+"\nHave a great day").queue();
            }
        }
    }
}