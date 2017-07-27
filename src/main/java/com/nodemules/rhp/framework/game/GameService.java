package com.nodemules.rhp.framework.game;

import com.nodemules.rhp.framework.game.bean.Game;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

/**
 * @author brent
 * @since 7/26/17.
 */
@Service
public class GameService implements GameOperations {

//  @Autowired
//  private GameRepository gameRepo;

  @Override
  public List<Game> getGames() throws ParseException {
    /* TODO */
    return null;
  }

  @Override
  public Game getGame(Long id) throws ParseException {
    /* TODO */
    return null;
  }
}
