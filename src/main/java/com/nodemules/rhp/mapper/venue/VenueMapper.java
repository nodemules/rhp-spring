package com.nodemules.rhp.mapper.venue;

import com.nodemules.rhp.framework.venue.bean.Venue;
import fr.xebia.extras.selma.Mapper;

import java.util.List;

/**
 * @author brent
 * @since 7/29/17.
 */
@Mapper
public interface VenueMapper {

  Venue toVenue(com.nodemules.rhp.orm.venue.Venue venue);

  List<Venue> toVenues(List<com.nodemules.rhp.orm.venue.Venue> venues);

  com.nodemules.rhp.orm.venue.Venue toVenue(Venue venue);

  List<com.nodemules.rhp.orm.venue.Venue> toVenue(List<Venue> venues);

}
