package com.nodemules.rhp.api.v1.controller;

import com.nodemules.rhp.framework.game.GameOperations;
import com.nodemules.rhp.framework.game.bean.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.util.List;

/**
 * @author brent
 * @since 7/26/17.
 */
@Controller
@RequestMapping("/game")
public class GameController {

  @Autowired
  private GameOperations gameService;

  @RequestMapping
  @ResponseBody
  public List<Game> getGames() throws ParseException {
    return gameService.getGames();
  }

  @RequestMapping("/{id}")
  @ResponseBody
  public Game getGame(@PathVariable Long id) throws ParseException {
    return gameService.getGame(id);
  }
}
