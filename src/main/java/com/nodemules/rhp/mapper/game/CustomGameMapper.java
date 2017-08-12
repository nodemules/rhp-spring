package com.nodemules.rhp.mapper.game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author brent
 * @since 8/10/17.
 */
@Service
public final class CustomGameMapper {

  public static final Logger LOG = LoggerFactory.getLogger(CustomGameMapper.class);
  
  public final com.nodemules.rhp.framework.game.bean.Game toGame(com.nodemules.rhp.orm.game.Game inGame) {
    com.nodemules.rhp.framework.game.bean.Game out = null;
    if (inGame != null) {
      out = new com.nodemules.rhp.framework.game.bean.Game();
      if (inGame.getAttendees() != null) {
        java.util.ArrayList<com.nodemules.rhp.framework.game.bean.Attendee> aattendeesTmpCollection = new java.util.ArrayList<com.nodemules.rhp.framework.game.bean.Attendee>(inGame.getAttendees().size());
        for (com.nodemules.rhp.orm.game.Attendee aattendeesItem : inGame.getAttendees()) {
          aattendeesTmpCollection.add(asAttendee(aattendeesItem));
        }
        out.setAttendees(aattendeesTmpCollection);
      }
      else {
        out.setAttendees(null);
      }
      out.setCompleted(inGame.getCompleted());
      if (inGame.getEndTime() != null) {
        out.setEndTime(new java.util.Date(inGame.getEndTime().getTime()));
      }
      else {
        out.setEndTime(null);
      }
      out.setEvent(asEvent(inGame.getEvent()));
      out.setFinalTable(inGame.getFinalTable());
      out.setId(inGame.getId());
      out.setInProgress(inGame.getInProgress());
      if (inGame.getStartTime() != null) {
        out.setStartTime(new java.util.Date(inGame.getStartTime().getTime()));
      }
      else {
        out.setStartTime(null);
      }
      out.setStatus(inGame.getStatus());
    }
    return out;
  }

  public final com.nodemules.rhp.framework.event.bean.Event asEvent(com.nodemules.rhp.orm.event.Event inEvent) {
    com.nodemules.rhp.framework.event.bean.Event out = null;
    if (inEvent != null) {
      out = new com.nodemules.rhp.framework.event.bean.Event();
      out.setCompleted(inEvent.isCompleted());
      if (inEvent.getDate() != null) {
        out.setDate(new java.util.Date(inEvent.getDate().getTime()));
      }
      else {
        out.setDate(null);
      }
      out.setId(inEvent.getId());
      out.setStatus(inEvent.getStatus());
      out.setVenue(asVenue(inEvent.getVenue()));
    }
    return out;
  }

  public final com.nodemules.rhp.framework.game.bean.Attendee asAttendee(com.nodemules.rhp.orm.game.Attendee inAttendee) {
    com.nodemules.rhp.framework.game.bean.Attendee out = null;
    if (inAttendee != null) {
      out = new com.nodemules.rhp.framework.game.bean.Attendee();
      if (inAttendee.getCashedOutTime() != null) {
        out.setCashedOutTime(new java.util.Date(inAttendee.getCashedOutTime().getTime()));
      }
      else {
        out.setCashedOutTime(null);
      }
      out.setPlayer(asPlayer(inAttendee.getPlayer()));
      out.setRank(inAttendee.getRank());
      out.setScore(inAttendee.getScore());
    }
    return out;
  }

  public final com.nodemules.rhp.framework.player.bean.Player asPlayer(com.nodemules.rhp.orm.player.Player inPlayer) {
    com.nodemules.rhp.framework.player.bean.Player out = null;
    if (inPlayer != null) {
      out = new com.nodemules.rhp.framework.player.bean.Player();
      out.setId(inPlayer.getId());
      out.setName(inPlayer.getName());
      out.setShoutOuts(inPlayer.getShoutOuts());
      out.setStatus(inPlayer.getStatus());
      out.setTournamentDirector(inPlayer.isTournamentDirector());
    }
    return out;
  }

  public final com.nodemules.rhp.orm.game.Game toGame(com.nodemules.rhp.framework.game.bean.Game inGame) {
    com.nodemules.rhp.orm.game.Game out = null;
    if (inGame != null) {
      out = new com.nodemules.rhp.orm.game.Game();
      out.setId(inGame.getId());
      if (inGame.getAttendees() != null) {
        java.util.HashSet<com.nodemules.rhp.orm.game.Attendee> aattendeesTmpCollection = new java.util.HashSet<com.nodemules.rhp.orm.game.Attendee>(inGame.getAttendees().size());
        for (com.nodemules.rhp.framework.game.bean.Attendee aattendeesItem : inGame.getAttendees()) {
          aattendeesTmpCollection.add(asAttendee(aattendeesItem, out));
        }
        out.setAttendees(aattendeesTmpCollection);
      }
      else {
        out.setAttendees(null);
      }
      out.setCompleted(inGame.isCompleted());
      if (inGame.getEndTime() != null) {
        out.setEndTime(new java.util.Date(inGame.getEndTime().getTime()));
      }
      else {
        out.setEndTime(null);
      }
      out.setEvent(asEvent(inGame.getEvent()));
      out.setFinalTable(inGame.isFinalTable());
      out.setInProgress(inGame.isInProgress());
      if (inGame.getStartTime() != null) {
        out.setStartTime(new java.util.Date(inGame.getStartTime().getTime()));
      }
      else {
        out.setStartTime(null);
      }
      out.setStatus(inGame.getStatus());
    }
    return out;
  }

  public final com.nodemules.rhp.orm.game.Game toGameWithoutAttendees(com.nodemules.rhp.framework.game.bean.Game inGame) {
    com.nodemules.rhp.orm.game.Game out = null;
    if (inGame != null) {
      out = new com.nodemules.rhp.orm.game.Game();
      out.setCompleted(inGame.isCompleted());
      if (inGame.getEndTime() != null) {
        out.setEndTime(new java.util.Date(inGame.getEndTime().getTime()));
      }
      else {
        out.setEndTime(null);
      }
      out.setEvent(asEvent(inGame.getEvent()));
      out.setFinalTable(inGame.isFinalTable());
      out.setId(inGame.getId());
      out.setInProgress(inGame.isInProgress());
      if (inGame.getStartTime() != null) {
        out.setStartTime(new java.util.Date(inGame.getStartTime().getTime()));
      }
      else {
        out.setStartTime(null);
      }
      out.setStatus(inGame.getStatus());
    }
    return out;
  }

  public final com.nodemules.rhp.orm.event.Event asEvent(com.nodemules.rhp.framework.event.bean.Event inEvent) {
    com.nodemules.rhp.orm.event.Event out = null;
    if (inEvent != null) {
      out = new com.nodemules.rhp.orm.event.Event();
      out.setCompleted(inEvent.isCompleted());
      if (inEvent.getDate() != null) {
        out.setDate(new java.util.Date(inEvent.getDate().getTime()));
      }
      else {
        out.setDate(null);
      }
      out.setId(inEvent.getId());
      out.setStatus(inEvent.getStatus());
      out.setVenue(asVenue(inEvent.getVenue()));
    }
    return out;
  }

  public final com.nodemules.rhp.orm.game.Attendee asAttendee(final com.nodemules.rhp.framework.game.bean.Attendee attendee, final com.nodemules.rhp.orm.game.Game game) {
    com.nodemules.rhp.orm.game.Attendee a = null;
    if (attendee != null){
      a = new com.nodemules.rhp.orm.game.Attendee();
      a.setGame(game);
      a.setPlayer(asPlayer(attendee.getPlayer()));
      a.setCashedOutTime(attendee.getCashedOutTime());
      a.setRank(attendee.getRank());
      a.setScore(attendee.getScore());
    }

    return a;
  }

  public final com.nodemules.rhp.orm.player.Player asPlayer(com.nodemules.rhp.framework.player.bean.Player inPlayer) {
    com.nodemules.rhp.orm.player.Player out = null;
    if (inPlayer != null) {
      out = new com.nodemules.rhp.orm.player.Player();
      out.setId(inPlayer.getId());
      out.setName(inPlayer.getName());
      out.setShoutOuts(inPlayer.getShoutOuts());
      out.setStatus(inPlayer.getStatus());
      out.setTournamentDirector(inPlayer.isTournamentDirector());
    }
    return out;
  }

  public final com.nodemules.rhp.framework.venue.bean.Venue asVenue(com.nodemules.rhp.orm.venue.Venue inVenue) {
    com.nodemules.rhp.framework.venue.bean.Venue out = null;
    if (inVenue != null) {
      out = new com.nodemules.rhp.framework.venue.bean.Venue();
      out.setDay(inVenue.getDay());
      out.setHour(inVenue.getHour());
      out.setId(inVenue.getId());
      out.setMinute(inVenue.getMinute());
      out.setName(inVenue.getName());
      out.setNumberOfGames(inVenue.getNumberOfGames());
      out.setStatus(inVenue.getStatus());
    }
    return out;
  }


  
  public final com.nodemules.rhp.orm.venue.Venue asVenue(com.nodemules.rhp.framework.venue.bean.Venue inVenue) {
    com.nodemules.rhp.orm.venue.Venue out = null;
    if (inVenue != null) {
      out = new com.nodemules.rhp.orm.venue.Venue();
      out.setDay(inVenue.getDay());
      out.setHour(inVenue.getHour());
      out.setId(inVenue.getId());
      out.setMinute(inVenue.getMinute());
      out.setName(inVenue.getName());
      out.setNumberOfGames(inVenue.getNumberOfGames());
      out.setStatus(inVenue.getStatus());
    }
    return out;
  }
}
