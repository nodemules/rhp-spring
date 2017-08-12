package com.nodemules.rhp.orm.event;

import com.nodemules.rhp.orm.game.Game;
import com.nodemules.rhp.orm.venue.Venue;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @author brent
 * @since 7/26/17.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude="venue")
@ToString(exclude="venue")
@Entity
@Table(name = "event")
public class Event implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "event_id")
  private Long id;

  private int status;
  private boolean completed;
  private Date date;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "venue_id")
  private Venue venue;

//  @OneToMany(targetEntity=TournamentDirector.class, mappedBy="events", fetch=FetchType.EAGER)
//  List<TournamentDirector> tournamentDirectors;

  @OneToMany(mappedBy="event", fetch=FetchType.EAGER)
  private Set<Game> games;

}
