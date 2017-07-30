package com.nodemules.rhp.framework.player;

import com.nodemules.rhp.framework.player.bean.Player;

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
  List<Player> getPlayers();

  /**
   * Get a Player by id
   * @param id
   *
   * @return
   */
  Player getPlayer(Long id);

  /**
   * Create or update a player
   *
   * @param player
   * @return
   */
  Player persistPlayer(Player player);
}
