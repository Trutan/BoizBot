package de.boizbot.main;

import de.boizbot.utils.Key;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Main {

    public static JDA shardMan;
    public static JDABuilder builder;

    public static void main(String[] args) throws LoginException {
        builder = JDABuilder.createDefault(Key.token);
        builder.setActivity(Activity.listening("Spotify"));
        builder.build();
    }
}
