package com.nodemules.rhp.mapper.event;

import com.nodemules.rhp.framework.event.bean.Event;
import fr.xebia.extras.selma.Mapper;

import java.util.List;

/**
 * @author brent
 * @since 7/26/17.
 */
@Mapper(
    withIgnoreFields = {"time", "com.nodemules.rhp.orm.venue.Venue.events"}
)
public interface EventMapper {

  Event toEvent(com.nodemules.rhp.orm.event.Event event);

  List<Event> toEvents(List<com.nodemules.rhp.orm.event.Event> events);

  com.nodemules.rhp.orm.event.Event toEvent(Event event);

  List<com.nodemules.rhp.orm.event.Event> toEventList(List<Event> events);
}
