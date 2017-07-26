package com.nodemules.rhp.api.game;

import com.nodemules.rhp.api.game.bean.Game;
import com.nodemules.rhp.util.DTOMapper;
import com.nodemules.rhp.repository.GameRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

/**
 * @author brent
 * @since 7/26/17.
 */
@Service
public class GameService implements GameOperations {

  @Autowired
  private GameRepository gameRepo;

  @Override
  public List<Game> getGames() throws ParseException {
    return DTOMapper.mapAll(gameRepo.findAll(), Game.class);
  }

  @Override
  public Game getGame(ObjectId id) throws ParseException {
    return DTOMapper.map(gameRepo.findOne(id), Game.class);
  }
}
