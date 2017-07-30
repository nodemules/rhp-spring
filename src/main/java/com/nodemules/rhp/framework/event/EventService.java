package com.nodemules.rhp.framework.event;

import com.nodemules.rhp.framework.event.bean.Event;
import com.nodemules.rhp.mapper.event.EventMapper;
import com.nodemules.rhp.repository.EventRepository;
import fr.xebia.extras.selma.Selma;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author brent
 * @since 7/26/17.
 */
@Service
public class EventService implements EventOperations {

  private static final Logger LOG = LoggerFactory.getLogger(EventService.class);

  private static EventMapper mapper = Selma.builder(EventMapper.class).build();

  @Autowired
  private EventRepository eventRepo;

  @Override
  public List<Event> getEvents() {
    return mapper.toEvents(eventRepo.findAll());
  }

  @Override
  public Event getEvent(Integer id) {
    return mapper.toEvent(eventRepo.findOne(id));
  }

  @Override
  public Event persistEvent(Event event) {
    return mapper.toEvent(eventRepo.save(mapper.toEvent(event)));
  }
}
