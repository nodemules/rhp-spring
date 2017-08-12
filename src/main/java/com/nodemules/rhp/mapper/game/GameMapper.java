package com.nodemules.rhp.mapper.game;

import com.nodemules.rhp.framework.game.bean.Game;
import com.nodemules.rhp.framework.venue.bean.Venue;
import fr.xebia.extras.selma.Mapper;
import fr.xebia.extras.selma.Maps;

import java.util.List;

/**
 * @author brent
 * @since 7/26/17.
 */
@Mapper(withIgnoreFields = { "Venue.time", "Player.games", "Event.games" })
public interface GameMapper {

  Game toGame(com.nodemules.rhp.orm.game.Game game);

  List<Game> toGames(List<com.nodemules.rhp.orm.game.Game> games);

  @Maps(withIgnoreFields = {"game"})
  com.nodemules.rhp.orm.game.Game toGame(Game game);

  @Maps(withIgnoreFields = {"game"})
  com.nodemules.rhp.framework.game.bean.Attendee asAttendee(com.nodemules.rhp.orm.game.Attendee inAttendee);

//  @Maps(withCustom = AbstractAttendeeMapper.class)
//  com.nodemules.rhp.orm.game.Attendee asAttendee(Attendee attendee);

  @Maps(withIgnoreFields = {"events"})
  Venue asVenue(com.nodemules.rhp.orm.venue.Venue inVenue);

  @Maps(withIgnoreFields = {"events"})
  com.nodemules.rhp.orm.venue.Venue asVenue(Venue inVenue);

}
