package com.nodemules.rhp.framework.player;

import com.nodemules.rhp.framework.player.bean.Player;

import java.text.ParseException;
import java.util.List;

/**
 * @author brent
 * @since 7/26/17.
 */
public interface PlayerOperations {

  /**
   * Gets all the Players
   *
   * @return
   */
  List<Player> getPlayers() throws ParseException;

  /**
   * Get a Player by id
   * @param id
   *
   * @return
   */
  Player getPlayer(Integer id) throws ParseException;

  /**
   * Create or update a player
   *
   * @param player
   * @return
   */
  Player persistPlayer(Player player);
}
