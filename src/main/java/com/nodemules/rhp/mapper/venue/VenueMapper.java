package com.nodemules.rhp.mapper.venue;

import com.nodemules.rhp.framework.venue.bean.Venue;
import fr.xebia.extras.selma.Mapper;
import fr.xebia.extras.selma.Maps;

import java.util.List;

/**
 * @author brent
 * @since 7/29/17.
 */
@Mapper(
    withIgnoreFields = {"time", "com.nodemules.rhp.orm.venue.Venue.events", "com.nodemules.rhp.orm.event.Event.venue"}
)
public interface VenueMapper {

  Venue toVenue(com.nodemules.rhp.orm.venue.Venue venue);

  List<Venue> toVenues(List<com.nodemules.rhp.orm.venue.Venue> venues);

  @Maps(withIgnoreFields = "time")
  com.nodemules.rhp.orm.venue.Venue toVenue(Venue venue);

  List<com.nodemules.rhp.orm.venue.Venue> toVenuesList(List<Venue> venues);

}
