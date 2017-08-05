package com.nodemules.rhp.mapper.game;

import com.nodemules.rhp.framework.game.bean.Game;
import com.nodemules.rhp.mapper.player.PlayerMapper;
import com.nodemules.rhp.orm.game.Attendee;
import fr.xebia.extras.selma.Mapper;
import fr.xebia.extras.selma.Selma;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author brent
 * @since 8/5/17.
 */
@Mapper
public abstract class AttendeeMapper {

  private static GameMapper gameMapper = Selma.builder(GameMapper.class).build();

  private static PlayerMapper playerMapper = Selma.builder(PlayerMapper.class).build();

  public Set<Attendee> asAttendees(Game game) {
    List<com.nodemules.rhp.framework.game.bean.Attendee> attendees = game.getPlayers();
    Set<Attendee> set = new HashSet<>();
    for (com.nodemules.rhp.framework.game.bean.Attendee attendee : attendees) {
      Attendee a = null;
      if (attendee != null){
        a = new Attendee();
        a.setPlayer(playerMapper.toPlayer(attendee.getPlayer()));
        a.setGame(gameMapper.toGame(game));
        a.setCashedOutTime(attendee.getCashedOutTime());
        a.setRank(attendee.getRank());
        a.setScore(attendee.getScore());
        set.add(a);
      }

    }
    return set;
  }
}
