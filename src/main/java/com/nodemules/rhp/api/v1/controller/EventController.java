package com.nodemules.rhp.api.v1.controller;

import com.nodemules.rhp.framework.event.EventOperations;
import com.nodemules.rhp.framework.event.bean.Event;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author brent
 * @since 7/29/17.
 */
@Controller
@RequestMapping("event")
public class EventController {

  private static final Logger LOG = LoggerFactory.getLogger(EventController.class);

  @Autowired
  private EventOperations eventService;

  @RequestMapping
  @ResponseBody
  public List<Event> getEvents() {
    return eventService.getEvents();
  }

  @RequestMapping(method = RequestMethod.GET, value = "/{id}")
  @ResponseBody
  public Event getEvent(@PathVariable Long id) {
    return eventService.getEvent(id);
  }

  @RequestMapping(method = RequestMethod.POST)
  @ResponseBody
  public Event persistEvent(@RequestBody Event event) {
    return eventService.persistEvent(event);
  }
}
