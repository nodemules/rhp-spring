package com.nodemules.rhp.api.game;

import com.nodemules.rhp.api.game.bean.Game;
import org.bson.types.ObjectId;

import java.text.ParseException;
import java.util.List;

/**
 * @author brent
 * @since 7/26/17.
 */
public interface GameOperations {

  /**
   * Get all games
   *
   * @return
   * @throws ParseException
   */
  List<Game> getGames() throws ParseException;

  Game getGame(ObjectId id) throws ParseException;
}
