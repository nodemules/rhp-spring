package com.nodemules.rhp.api.v1.controller;

import com.nodemules.rhp.api.player.PlayerOperations;
import com.nodemules.rhp.api.player.bean.Player;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;

/**
 * @author brent
 * @since 7/26/17.
 */
@Controller
@RequestMapping("/player")
public class PlayerController {

  @Autowired
  private PlayerOperations playerService;

  @RequestMapping(method = RequestMethod.GET, value = "/{id}")
  public Player getPlayer(@RequestParam ObjectId id) throws ParseException {
    return playerService.getPlayer(id);
  }

}
