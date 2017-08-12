package com.nodemules.rhp.orm.game;

import com.nodemules.rhp.orm.event.Event;
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
@EqualsAndHashCode(exclude = {"attendees"})
@ToString(exclude = {"attendees"})
@Entity
@Table(name = "game")
public class Game implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "game_id")
  private Long id;

  private int status;
  private Date startTime;
  private Date endTime;
  private Boolean finalTable;
  private Boolean completed;
  private Boolean inProgress;

  @ManyToOne
  private Event event;

  @OneToMany(mappedBy = "game", cascade = CascadeType.ALL)
  private Set<Attendee> attendees;

}
