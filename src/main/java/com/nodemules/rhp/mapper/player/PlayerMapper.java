package com.nodemules.rhp.mapper.player;

import com.nodemules.rhp.framework.game.bean.PlayedGame;
import com.nodemules.rhp.framework.player.bean.Player;
import com.nodemules.rhp.mapper.game.PlayedGameMapper;
import com.nodemules.rhp.orm.game.Attendee;
import fr.xebia.extras.selma.Mapper;
import fr.xebia.extras.selma.Maps;

import java.util.List;

/**
 * @author brent
 * @since 7/26/17.
 */
@Mapper(withIgnoreFields = {"Attendee.player", "Game.players", "Game.attendees", "Venue.time"})
public interface PlayerMapper {

  /**
   * Converts ORM DAO to Bean
   *
   * @param player
   * @return
   */
  Player toPlayer(com.nodemules.rhp.orm.player.Player player);

  /**
   * Converts a List of ORM DAOs to a List of Beans
   *
   * @param player
   * @return
   */
  List<Player> toPlayers(List<com.nodemules.rhp.orm.player.Player> player);

  /**
   * Converts Bean to ORM DAO
   *
   * @param player
   * @return
   */
  com.nodemules.rhp.orm.player.Player toPlayer(Player player);

  /**
   * Converts a List of Beans to a List of ORM DAOs
   *
   * @param player
   * @return
   */
  List<com.nodemules.rhp.orm.player.Player> toPlayersList(List<Player> player);

  @Maps(withCustom = PlayedGameMapper.class)
  PlayedGame asPlayedGame(Attendee attendance);

}
