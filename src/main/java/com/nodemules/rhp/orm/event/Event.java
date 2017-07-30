//package com.nodemules.rhp.orm.event;
//
//import com.nodemules.rhp.orm.venue.Venue;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//import javax.persistence.*;
//import java.util.Date;
//
///**
// * @author brent
// * @since 7/26/17.
// */
//@Data
//@AllArgsConstructor
//@Entity
//@Table(name = "event")
//public class Event {
//
//  @Id
//  @GeneratedValue(strategy = GenerationType.AUTO)
//  @Column(name = "event_id")
//  private Long id;
//
//  private int status;
//  private boolean completed;
//  private Date date;
//
//  @JoinColumn(table = "venue_id")
//  private Venue venue;
//
////  @OneToMany(targetEntity=Player.class, mappedBy="events", fetch=FetchType.EAGER)
////  List<TournamentDirecto> tournamentDirectors;
////
////  @OneToMany(targetEntity=Game.class, mappedBy="event", fetch=FetchType.EAGER)
////  List<Game> games;
//
//}
