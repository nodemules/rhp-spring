package com.nodemules.rhp.mapper.game;

import com.nodemules.rhp.framework.game.bean.PlayedGame;
import com.nodemules.rhp.orm.game.Attendee;
import fr.xebia.extras.selma.Mapper;
import fr.xebia.extras.selma.Selma;

/**
 * @author brent
 * @since 8/5/17.
 */
@Mapper
public abstract class PlayedGameMapper {

  private static GameMapper gameMapper = Selma.builder(GameMapper.class).build();

  public PlayedGame asPlayedGame(Attendee attendence){
    PlayedGame game = null;
    if (attendence != null){
      game = new PlayedGame();
      game.setGame(gameMapper.toGame(attendence.getGame()));
      game.setCashedOutTime(attendence.getCashedOutTime());
      game.setRank(attendence.getRank());
      game.setScore(attendence.getScore());
    }
    return game;
  }
}
