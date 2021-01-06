package com.over2craft.cancelChatEvent;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class Main extends JavaPlugin {

    static Main plugin;

    @Override
    public void onEnable() {

        plugin = this;

        saveDefaultConfig();

        System.out.println("[cancelChatEvent] Enabling cancelChatEvent");

        switch (Objects.requireNonNull(this.getConfig().getString("EventPriority"))) {
            case "MONITOR":
                getServer().getPluginManager().registerEvents(new Listener() {
                    @EventHandler(priority = EventPriority.MONITOR)
                    public void onChat(AsyncPlayerChatEvent event) {
                        event.setCancelled(true);
                    }
                }, this);
            case "HIGHEST":
                getServer().getPluginManager().registerEvents(new Listener() {
                    @EventHandler(priority = EventPriority.HIGHEST)
                    public void onChat(AsyncPlayerChatEvent event) {
                        event.setCancelled(true);
                    }
                }, this);
            case "HIGH":
                getServer().getPluginManager().registerEvents(new Listener() {
                    @EventHandler(priority = EventPriority.HIGH)
                    public void onChat(AsyncPlayerChatEvent event) {
                        event.setCancelled(true);
                    }
                }, this);
            case "NORMAL":
                getServer().getPluginManager().registerEvents(new Listener() {
                    @EventHandler(priority = EventPriority.NORMAL)
                    public void onChat(AsyncPlayerChatEvent event) {
                        event.setCancelled(true);
                    }
                }, this);
            case "LOW":
                getServer().getPluginManager().registerEvents(new Listener() {
                    @EventHandler(priority = EventPriority.LOW)
                    public void onChat(AsyncPlayerChatEvent event) {
                        event.setCancelled(true);
                    }
                }, this);
            case "LOWEST":
                getServer().getPluginManager().registerEvents(new Listener() {
                    @EventHandler(priority = EventPriority.LOWEST)
                    public void onChat(AsyncPlayerChatEvent event) {
                        event.setCancelled(true);
                    }
                }, this);
        }
    }

}
