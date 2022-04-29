import de.boizbot.utils.Key;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Main {

    public static JDA shardMan;
    public static JDABuilder builder;

    public static void main(String[] args) {
        builder = JDABuilder.createDefault(Key.token);
    }
}
