package com.nodemules.rhp.repository;

import com.nodemules.rhp.orm.venue.Venue;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author brent
 * @since 7/29/17.
 */
public interface VenueRepository extends JpaRepository<Venue, Integer> {
}
