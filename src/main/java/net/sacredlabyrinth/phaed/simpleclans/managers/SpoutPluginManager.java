package net.sacredlabyrinth.phaed.simpleclans.managers;

import net.sacredlabyrinth.phaed.simpleclans.Clan;
import net.sacredlabyrinth.phaed.simpleclans.ClanPlayer;
import net.sacredlabyrinth.phaed.simpleclans.Helper;
import net.sacredlabyrinth.phaed.simpleclans.SimpleClans;
import net.sacredlabyrinth.phaed.simpleclans.uuid.UUIDMigration;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.util.Collection;
import java.util.UUID;

/**
 * @author phaed
 */
public final class SpoutPluginManager
{
    private SimpleClans plugin;
    private boolean hasSpout;

    /**
     *
     */
    public SpoutPluginManager()
    {
        plugin = SimpleClans.getInstance();
        hasSpout = checkSpout();
    }

    /**
     * Process all players
     */
    public void processAllPlayers()
    {
        if (isHasSpout())
        {
        }
    }

    /**
     * Adds cape and title to a player
     *
     * @param playerName
     */
    @Deprecated
    public void processPlayer(String playerName)
    {
        if (isHasSpout())
        {
        }
    }

    /**
     * Adds cape and title to a player
     *
     * @param playerUniqueId
     */
    public void processPlayer(UUID playerUniqueId)
    {
        if (isHasSpout())
        {
        }
    }

    /**
     * Adds cape and title to a player
     *
     * @param player the player
     */
    public void processPlayer(Player player)
    {
        if (isHasSpout())
        {
        }
    }

    /**
     * Clear a player's cape
     *
     * @param player
     */
    public void clearCape(Player player)
    {
        if (isHasSpout())
        {
        }
    }

    /**
     * Plays alert to player
     *
     * @param player
     */
    public void playAlert(Player player)
    {
        if (isHasSpout())
        {
        }
    }

    private boolean checkSpout()
    {
        return false;
    }

    /**
     * @return the hasSpout
     */
    public boolean isHasSpout()
    {
        return hasSpout;
    }
}
