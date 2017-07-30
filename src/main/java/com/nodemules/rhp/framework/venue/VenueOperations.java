package com.nodemules.rhp.framework.venue;

import com.nodemules.rhp.framework.venue.bean.Venue;

import java.util.List;

/**
 * @author brent
 * @since 7/26/17.
 */
public interface VenueOperations {

  /**
   * Gets all the Venues
   *
   * @return
   */
  List<Venue> getVenues();

  /**
   * Get a venue
   *
   * @param id
   * @return
   */
  Venue getVenue(Integer id);

  /**
   * Create or update a venue
   *
   * @param Venue
   * @return
   */
  Venue persistVenue(Venue Venue);

}
