package de.boizbot.events;

import net.dv8tion.jda.api.events.channel.ChannelCreateEvent;
import net.dv8tion.jda.api.events.channel.update.ChannelUpdateNameEvent;
import net.dv8tion.jda.api.events.guild.voice.GuildVoiceJoinEvent;
import net.dv8tion.jda.api.events.guild.voice.GuildVoiceLeaveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ChatEvent extends ListenerAdapter {

    public void onGuildVoiceJoin(GuildVoiceJoinEvent event) {
        event.getGuild().getTextChannelsByName("bot-log", true)
                .get(0).sendMessage("\n \n Nutzer " + event.getVoiceState().getMember().getAsMention() + " ist " +
                        "dem Channel " + event.getChannelJoined().getAsMention() + " beigetreten").queue();
    }

    public void onGuildVoiceLeave(GuildVoiceLeaveEvent event) {
        event.getGuild().getTextChannelsByName("bot-log", true)
                .get(0).sendMessage("\n \n Nutzer " + event.getVoiceState().getMember().getAsMention() + " hat " +
                        "den Channel " + event.getChannelLeft().getAsMention() + " verlassen. \n \n").queue();
    }

  /*  public void onGuildMemberUpdateNickname(GuildMemberUpdateNicknameEvent event) {
        event.getGuild().getTextChannelsByName("bot-log", true)
                .get(0).sendMessage("Nutzer" + event.getOldNickname() + " hat " +
                        "den Namen zu " + event.getNewNickname() + " geändert").queue();
    }*/

   /* public void onGuildMemberUpdate(GuildMemberUpdateEvent event) {
        event.getGuild().getTextChannelsByName("bot-log" ,true)
                .get(0).sendMessage("Nutzer" + event.getMember().getAsMention() + " hat die Rolle ").queue();
    }*/

    public void onChannelCreate(ChannelCreateEvent event) {
        event.getGuild().getTextChannelsByName("bot-log", true)
                .get(0).sendMessage("Der Channel " + event.getChannel().getAsMention() + " wurde erstellt").queue();
    }
    public void onChannelUpdateName(ChannelUpdateNameEvent event) {
        event.getGuild().getTextChannelsByName("bot-log", true)
                .get(0).sendMessage("Der Channel " + event.getOldValue() +
                        " wurde in " + event.getChannel().getAsMention() + " geändert").queue();
    }
}
