package com.nodemules.rhp.orm.player;

import com.nodemules.rhp.orm.game.Attendee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * @author brent
 * @since 7/26/17.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "player")
public class Player implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "player_id")
  private Long id;

  private String name;
  private int status;
  private boolean tournamentDirector;
  private int shoutOuts;

  @OneToMany(mappedBy = "player")
  private Set<Attendee> games;

}


