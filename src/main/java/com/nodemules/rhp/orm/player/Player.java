package com.nodemules.rhp.orm.player;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author brent
 * @since 7/26/17.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "player")
public class Player {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "player_id")
  private Long id;
  private String name;
  private int status;
  private boolean tournamentDirector;
  private int shoutOuts;

}
