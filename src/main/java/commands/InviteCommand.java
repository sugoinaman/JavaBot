package commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class InviteCommand extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent event) {
        super.onGuildMessageReceived(event);
        String []message=event.getMessage().getContentRaw().split(" ");
        if(message[0].equalsIgnoreCase("!invite")){
            event.getChannel().sendMessage("The invite link for "+event.getAuthor().getName()+" is").queue();
            event.getChannel().sendMessage(event.getChannel().createInvite().setMaxAge(3600).complete().getUrl()).queue();
        }
    }
}
