package com.nodemules.rhp.framework.venue;

import com.nodemules.rhp.framework.venue.bean.Venue;
import com.nodemules.rhp.mapper.venue.VenueMapper;
import com.nodemules.rhp.repository.VenueRepository;
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
public class VenueService implements VenueOperations {

  private static final Logger LOG = LoggerFactory.getLogger(VenueService.class);

  private static VenueMapper mapper = Selma.builder(VenueMapper.class).build();

  @Autowired
  private VenueRepository venueRepo;

  @Override
  public List<Venue> getVenues() {
    return mapper.toVenues(venueRepo.findAll());
  }

  @Override
  public Venue getVenue(Integer id) {
    return mapper.toVenue(venueRepo.findOne(id));
  }

  @Override
  public Venue persistVenue(Venue Venue) {
    return mapper.toVenue(venueRepo.save(mapper.toVenue(Venue)));
  }
}
