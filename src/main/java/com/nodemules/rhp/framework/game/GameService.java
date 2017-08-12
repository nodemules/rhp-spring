package com.nodemules.rhp.framework.game;

import com.nodemules.rhp.framework.game.bean.Game;
import com.nodemules.rhp.mapper.game.CustomGameMapper;
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
  private CustomGameMapper customGameMapper;

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

    com.nodemules.rhp.orm.game.Game g = customGameMapper.toGame(game);

    LOG.info("Game ORM: {}", g.toString());
    LOG.info("Game ORM Attendees: {}", g.getAttendees().toString());

    return mapper.toGame(gameRepo.save(g));
  }
}
