# cancelChatEvent
 
A very simple spigot plugin that cancel the chat event

## Requirements 
* Spigot 1.16.4 (others version not tested but should works on all versions)

## Configuration 
```yaml
# see https://hub.spigotmc.org/javadocs/spigot/org/bukkit/event/EventPriority.html
# LOWEST is executed before HIGHEST
# LOWEST -> LOW -> NORMAL -> HIGH -> HIGHEST -> MONITOR
# If you want to cancel the chat event without impacting other plugin you should you HIGHEST 
EventPriority: HIGHEST
```

## Download
https://over2craft-mc.github.io/cancelChatEvent/target/cancelChatEvent.jar
