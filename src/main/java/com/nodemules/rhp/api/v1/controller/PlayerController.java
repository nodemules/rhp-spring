package com.nodemules.rhp.api.v1.controller;

import com.nodemules.rhp.api.player.PlayerOperations;
import com.nodemules.rhp.api.player.bean.Player;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.util.List;

/**
 * @author brent
 * @since 7/26/17.
 */
@Controller
@RequestMapping("/player")
public class PlayerController {

  @Autowired
  private PlayerOperations playerService;

  @RequestMapping
  @ResponseBody
  public List<Player> getPlayers() throws ParseException {
    return playerService.getPlayers();
  }

  @RequestMapping(method = RequestMethod.GET, value = "/{id}")
  @ResponseBody
  public Player getPlayer(@PathVariable String id) throws ParseException {
    return playerService.getPlayer(new ObjectId(id));
  }

}
