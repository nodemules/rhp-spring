package com.nodemules.rhp.mapper.player;

import com.nodemules.rhp.framework.game.bean.PlayedGame;
import com.nodemules.rhp.framework.player.bean.Player;
import com.nodemules.rhp.orm.game.Attendee;
import fr.xebia.extras.selma.Mapper;

import java.util.List;

/**
 * @author brent
 * @since 7/26/17.
 */
@Mapper(withIgnoreFields = {"Attendee.player", "Game.players", "Game.attendees", "Venue.time", "Event.games", "Venue.events"})
public interface PlayerMapper {

  Player toPlayer(com.nodemules.rhp.orm.player.Player player);

  List<Player> toPlayers(List<com.nodemules.rhp.orm.player.Player> player);

  com.nodemules.rhp.orm.player.Player toPlayer(Player player);

  List<com.nodemules.rhp.orm.player.Player> toPlayersList(List<Player> player);

//  @Maps(withCustom = PlayedGameMapper.class)
  PlayedGame asPlayedGame(Attendee attendance);

}
