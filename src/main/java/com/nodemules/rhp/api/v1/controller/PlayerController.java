package com.nodemules.rhp.api.v1.controller;

import com.nodemules.rhp.framework.player.PlayerOperations;
import com.nodemules.rhp.framework.player.bean.Player;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author brent
 * @since 7/26/17.
 */
@Controller
@RequestMapping("/player")
public class PlayerController {

  private static final Logger LOG = LoggerFactory.getLogger(PlayerController.class);

  @Autowired
  private PlayerOperations playerService;

  @RequestMapping
  @ResponseBody
  public List<Player> getPlayers() {
    return playerService.getPlayers();
  }

  @RequestMapping(method = RequestMethod.GET, value = "/{id}")
  @ResponseBody
  public Player getPlayer(@PathVariable Integer id) {
    return playerService.getPlayer(id);
  }

  @RequestMapping(method = RequestMethod.POST)
  @ResponseBody
  public Player persistPlayer(@RequestBody Player player) {
    LOG.info("Persisting player: ", player.toString());
    return playerService.persistPlayer(player);
  }

}
