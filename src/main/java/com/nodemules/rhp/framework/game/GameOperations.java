package com.nodemules.rhp.framework.game;

import com.nodemules.rhp.framework.game.bean.Game;

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

  /**
   * Get a game by id
   *
   * @param id
   * @return
   * @throws ParseException
   */
  Game getGame(Long id) throws ParseException;
}
