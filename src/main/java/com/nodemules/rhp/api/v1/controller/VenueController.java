package com.nodemules.rhp.api.v1.controller;

import com.nodemules.rhp.framework.venue.VenueOperations;
import com.nodemules.rhp.framework.venue.bean.Venue;
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
@RequestMapping("/venue")
public class VenueController {

  private static final Logger LOG = LoggerFactory.getLogger(VenueController.class);

  @Autowired
  private VenueOperations venueService;

  @RequestMapping
  @ResponseBody
  public List<Venue> getVenues() {
    return venueService.getVenues();
  }

  @RequestMapping(method = RequestMethod.GET, value = "/{id}")
  @ResponseBody
  public Venue getVenue(@PathVariable Long id) {
    return venueService.getVenue(id);
  }

  @RequestMapping(method = RequestMethod.POST)
  @ResponseBody
  public Venue persistVenue(@RequestBody Venue venue) {
    return venueService.persistVenue(venue);
  }
}
