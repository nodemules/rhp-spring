package com.nodemules.rhp.framework.event;

import com.nodemules.rhp.framework.event.bean.Event;
import com.nodemules.rhp.framework.specifications.event.EventSpecification;
import com.nodemules.rhp.mapper.event.EventMapper;
import com.nodemules.rhp.repository.EventRepository;
import fr.xebia.extras.selma.Selma;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author brent
 * @since 7/26/17.
 */
@Service
@Transactional
public class EventService implements EventOperations {

  private static final Logger LOG = LoggerFactory.getLogger(EventService.class);

  private static EventMapper mapper = Selma.builder(EventMapper.class).build();

  @Autowired
  private static EventSpecification eventSpec;

  @Autowired
  private EventRepository eventRepo;

  @Override
  public List<Event> getEventsByVenueName(String name) {
    return mapper.toEvents(eventRepo.findAll(eventSpec.byVenueName(name)));
  }

  @Override
  public List<Event> getEvents() {
    return mapper.toEvents(eventRepo.findAll(eventSpec.isActive()));
  }

  @Override
  public Event getEvent(Long id) {
    return mapper.toEvent(eventRepo.findOne(eventSpec.byId(id)));
  }

  @Override
  public Event persistEvent(Event event) {
    return mapper.toEvent(eventRepo.saveAndFlush(mapper.toEvent(event)));
  }
}
