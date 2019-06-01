package core.dev;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Hello world!
 */
public class App extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Hello World!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Goodbye World!");
    }
}
