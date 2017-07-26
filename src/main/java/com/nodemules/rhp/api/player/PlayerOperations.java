package com.nodemules.rhp.api.player;

import com.nodemules.rhp.api.player.bean.Player;
import org.bson.types.ObjectId;

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
  Player getPlayer(ObjectId id) throws ParseException;

}
