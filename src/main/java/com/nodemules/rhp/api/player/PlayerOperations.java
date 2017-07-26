package com.nodemules.rhp.api.player;

import com.nodemules.rhp.api.player.bean.Player;
import org.bson.types.ObjectId;

import java.text.ParseException;

/**
 * @author brent
 * @since 7/26/17.
 */
public interface PlayerOperations {

  /**
   * Get a Player by id
   * @Param
   *
   * @return
   */
  Player getPlayer(ObjectId id) throws ParseException;

}
