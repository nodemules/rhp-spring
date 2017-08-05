package com.nodemules.rhp.framework.game;

import com.nodemules.rhp.framework.game.bean.Game;
import com.nodemules.rhp.mapper.game.GameMapper;
import com.nodemules.rhp.repository.GameRepository;
import fr.xebia.extras.selma.Selma;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

  private static final Logger LOG = LoggerFactory.getLogger(GameService.class);

  private static GameMapper mapper = Selma.builder(GameMapper.class).build();

  @Autowired
  private GameRepository gameRepo;

  @Override
  public List<Game> getGames() throws ParseException {
    /* TODO */
    return null;
  }

  @Override
  public Game getGame(Long id) throws ParseException {
    return mapper.toGame(gameRepo.findOne(id));
  }

  @Override
  public Game persistGame(Game game) {

    LOG.info("Game Bean: {}", game.toString());

    com.nodemules.rhp.orm.game.Game g = mapper.toGame(game);

    LOG.info("Game ORM: {}", g.toString());

    return null;
//    return mapper.toGame(gameRepo.save(mapper.toGame(game)));
  }
}
