package de.boizbot.main;

import de.boizbot.utils.Config;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Main {

    public static JDA shardMan;
    public static JDABuilder builder;

    public static void main(String[] args) throws LoginException {
    	if (args.length != 1) {
    		System.err.println("Invalid number of arguments!");
    		System.err.println("usage:");
    		System.err.println("    boizbot <config.json>");
    		return;
    	}
    	
    	Config config = Config.loadConfigFile(args[0]);
    	
        builder = JDABuilder.createDefault(config.getToken());
        builder.setActivity(Activity.listening("Spotify"));
        builder.build();
    }
}
