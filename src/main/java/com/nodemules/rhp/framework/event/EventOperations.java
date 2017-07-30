package com.nodemules.rhp.framework.event;

import com.nodemules.rhp.framework.event.bean.Event;

import java.util.List;

/**
 * @author brent
 * @since 7/26/17.
 */
public interface EventOperations {
  List<Event> getEvents();

  Event getEvent(Long id);

  Event persistEvent(Event event);
}
