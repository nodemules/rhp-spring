package com.nodemules.rhp.mapper.game;

import com.nodemules.rhp.framework.player.bean.Player;
import com.nodemules.rhp.orm.game.Attendee;
import fr.xebia.extras.selma.IoC;
import fr.xebia.extras.selma.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author brent
 * @since 8/10/17.
 */
@Service
@Component
@Mapper(withIoC = IoC.SPRING, withIgnoreFields = {"player.games"})
public abstract class AbstractAttendeeMapper {

  public AbstractAttendeeMapper() {
    /* empty constructor */
  }

  public abstract com.nodemules.rhp.orm.player.Player toPlayer(Player p);

  public final Attendee asAttendee(final com.nodemules.rhp.framework.game.bean.Attendee attendee) {
      Attendee a = null;
      if (attendee != null){
        a = new Attendee();
//        a.setGame(gameMapper.toGame(game));
        a.setPlayer(toPlayer(attendee.getPlayer()));
        a.setCashedOutTime(attendee.getCashedOutTime());
        a.setRank(attendee.getRank());
        a.setScore(attendee.getScore());
      }

    return a;
  }
}
