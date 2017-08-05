package com.nodemules.rhp.mapper.game;

import com.nodemules.rhp.framework.game.bean.Game;
import com.nodemules.rhp.orm.game.Attendee;
import fr.xebia.extras.selma.Mapper;
import fr.xebia.extras.selma.Maps;

import java.util.Set;

/**
 * @author brent
 * @since 7/26/17.
 */
@Mapper(withIgnoreFields = {"Game.attendees", "Game.players", "Attendee.player", "Venue.time", "Player.games"})
public interface GameMapper {

  Game toGame(com.nodemules.rhp.orm.game.Game game);

  com.nodemules.rhp.orm.game.Game toGame(Game game);

  @Maps(withCustom = AttendeeMapper.class)
  Set<Attendee> asAttendees(Game game);
}
