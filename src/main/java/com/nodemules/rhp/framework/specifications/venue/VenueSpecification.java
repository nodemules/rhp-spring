package com.nodemules.rhp.framework.specifications.venue;

import com.nodemules.rhp.framework.specifications.BaseSpecification;
import com.nodemules.rhp.orm.venue.Venue;
import org.springframework.data.jpa.domain.Specification;

/**
 * @author brent
 * @since 8/13/17.
 */
public class VenueSpecification extends BaseSpecification {

  public static Specification<Venue> isActive() {
    return (root, cq, cb) -> cb.equal(root.get("status"), 1);
  }
}
