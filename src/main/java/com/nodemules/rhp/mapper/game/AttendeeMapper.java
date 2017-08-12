package com.nodemules.rhp.mapper.game;

import fr.xebia.extras.selma.IoC;
import fr.xebia.extras.selma.Mapper;

/**
 * @author brent
 * @since 8/5/17.
 */
@Mapper(withIgnoreFields = { "Venue.time", "Player.games" }, withIoC = IoC.SPRING)
public interface AttendeeMapper {

//  Attendee asAttendee(final com.nodemules.rhp.framework.game.bean.Attendee attendee, Game game);

}
