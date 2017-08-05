package com.nodemules.rhp.orm.game;

import com.nodemules.rhp.orm.player.Player;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author brent
 * @since 7/26/17.
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(exclude = {"game", "player"})
@ToString(exclude = {"game", "player"})
@Entity
@Table(name = "attendee")
public class Attendee implements Serializable {

  @Id
  @ManyToOne
  @JoinColumn(name = "game_id")
  private Game game;

  @Id
  @ManyToOne
  @JoinColumn(name = "player_id")
  private Player player;

  private Integer score;
  private Integer rank;
  private Date cashedOutTime;

}
