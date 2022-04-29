package de.boizbot.events;

import net.dv8tion.jda.api.events.guild.GuildJoinEvent;
import net.dv8tion.jda.api.events.guild.voice.GuildVoiceJoinEvent;
import net.dv8tion.jda.api.events.guild.voice.GuildVoiceLeaveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ChatEvent extends ListenerAdapter {

    public void onGuildVoiceJoin(GuildVoiceJoinEvent event) {
        event.getGuild().getTextChannelsByName("bot-log", true).get(0).sendMessage("\n \n Nutzer " + event.getVoiceState().getMember().getAsMention() + " ist dem Channel " + event.getChannelJoined().getAsMention() + " beigetreten").queue();
    }

    public void onGuildVoiceLeave(GuildVoiceLeaveEvent event) {
        event.getGuild().getTextChannelsByName("bot-log", true).get(0).sendMessage("\n \n Nutzer " + event.getVoiceState().getMember().getAsMention() + " hat den Channel " + event.getChannelLeft().getAsMention() + " verlassen. \n \n").queue();
    }
}
