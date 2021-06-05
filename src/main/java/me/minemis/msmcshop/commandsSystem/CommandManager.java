package me.minemis.msmcshop.commandsSystem;

import me.minemis.msmcshop.commandsSystem.commands.CommandExecutor;
import me.minemis.msmcshop.commandsSystem.commands.ShopCommand;
import me.minemis.msmcshop.commandsSystem.commands.TestCommand;
import me.minemis.msmcshop.gui.GuiManager;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandMap;
import org.bukkit.command.CommandSender;

import java.util.*;

public class CommandManager {

    private final Map<CommandID, CommandData> commandDataMap = new HashMap<>();
    private final CommandMap commandMap = Bukkit.getCommandMap();
    private final Map<String, Command> knownCommands = commandMap.getKnownCommands();

    public CommandManager(GuiManager guiManager) {
        add(CommandID.SHOP, new ShopCommand(guiManager), "shop", "sklep", "dajtamiderta");
        add(CommandID.TEST, new TestCommand(), "test");
    }

    public void registerCommands() {
        for (CommandData commandData : commandDataMap.values()) {
            String name = commandData.getName();

            CommandInstance commandInstance = new CommandInstance(commandData.getId(), name, commandData.getAliases(), this);

            if (knownCommands.containsKey(name)) {
                knownCommands.replace(name, commandInstance);
                continue;
            }

            knownCommands.put(name, commandInstance);
        }
    }

    public void unregisterCommands() {
        for (CommandData commandData : commandDataMap.values()) {
            knownCommands.remove(commandData.getName());

            List<String> aliases = commandData.getAliases();

            for (String alias : aliases) {
                knownCommands.remove(alias);
            }
        }
    }

    public void runCommand(CommandID id, CommandSender sender, String label, String[] args) {
        commandDataMap.get(id).getCommand().execute(sender, label, args);
    }

    private void add(CommandID id, CommandExecutor ce, String name, String... aliases) {
        commandDataMap.put(id, new CommandData(ce, id, name, Arrays.asList(aliases)));
    }

    private void add(CommandID id, CommandExecutor ce, String name) {
        commandDataMap.put(id, new CommandData(ce, id, name, Collections.emptyList()));
    }
}
