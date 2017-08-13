package com.nodemules.rhp.framework.specifications.event;

import com.nodemules.rhp.framework.specifications.BaseSpecification;
import com.nodemules.rhp.orm.event.Event;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author brent
 * @since 8/13/17.
 */
@Component
public final class EventSpecification extends BaseSpecification {

  private static final Logger LOG = LoggerFactory.getLogger(EventSpecification.class);

  public static Specification<Event> isActive() {
    return (root, cq, cb) -> {
      List<Predicate> preds = new ArrayList<>();
      preds.add(cb.equal(root.get("status"), 1));
      preds.add(cb.equal(root.get("venue").get("status"), 1)); // TODO - Find a way to access this via VenueSpecification
      return and(cb, preds);
    };
  }

  public static Specification<Event> byId(Long id) {
    return (root, cq, cb) -> {
      List<Predicate> preds = new ArrayList<>();
      preds.add(cb.equal(root.get("id"), id));
      preds.add(isActive().toPredicate(root, cq, cb));
      return and(cb, preds);
    };
  }

  public static Specification<Event> byVenueName(String name) {
    return (root, cq, cb) -> {
      StringBuilder sb = new StringBuilder();
      sb.append('%').append(name).append('%'); // TODO - Escape name search to prevent SQL injection

      List<Predicate> preds = new ArrayList<>();
      preds.add(cb.like(root.get("venue").get("name"), sb.toString()));
      preds.add(isActive().toPredicate(root, cq, cb));
      return and(cb, preds);
    };
  }

}
