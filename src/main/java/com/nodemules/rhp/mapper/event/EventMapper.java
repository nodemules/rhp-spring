package com.nodemules.rhp.mapper.event;

import com.nodemules.rhp.framework.event.bean.Event;
import com.nodemules.rhp.framework.venue.bean.Venue;
import fr.xebia.extras.selma.Mapper;
import fr.xebia.extras.selma.Maps;

import java.util.List;

/**
 * @author brent
 * @since 7/26/17.
 */
@Mapper(
    withIgnoreFields = {
        "time", "Attendee.game", "PlayedGame.player", "Player.games", "Game.event"
    }
)
public interface EventMapper {

  Event toEvent(com.nodemules.rhp.orm.event.Event event);

  List<Event> toEvents(List<com.nodemules.rhp.orm.event.Event> events);

  com.nodemules.rhp.orm.event.Event toEvent(Event event);

  List<com.nodemules.rhp.orm.event.Event> toEventList(List<Event> events);

  @Maps(withIgnoreFields = {"events"})
  Venue asVenue(com.nodemules.rhp.orm.venue.Venue inVenue);

  @Maps(withIgnoreFields = {"events"})
  com.nodemules.rhp.orm.venue.Venue asVenue(Venue inVenue);

}
