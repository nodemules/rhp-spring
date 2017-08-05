//package com.nodemules.rhp.orm.game;
//
//import com.nodemules.rhp.orm.event.Event;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//import javax.persistence.*;
//import java.util.Date;
//import java.util.List;
//
///**
// * @author brent
// * @since 7/26/17.
// */
//@AllArgsConstructor
//@NoArgsContructor
//@Getter
//@Setter
//@Entity
//@Table(name = "game")
//public class Game {
//
//  @Id
//  @GeneratedValue(strategy = GenerationType.AUTO)
//  @Column(name = "game_id")
//  private Long id;
//
//  private int status;
//
//  @ManyToOne
//  private Event event;
//
//  private Date startTime;
//  private Date endTime;
//  private Boolean finalTable;
//  private Boolean completed;
//
//  @OneToMany(targetEntity=Attendee.class, mappedBy="game_attendee", fetch=FetchType.EAGER)
//  private List<Attendee> players;
//
//}
