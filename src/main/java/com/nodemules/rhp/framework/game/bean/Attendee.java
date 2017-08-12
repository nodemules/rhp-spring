package com.nodemules.rhp.framework.game.bean;

import com.nodemules.rhp.framework.player.bean.Player;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author brent
 * @since 7/26/17.
 */

@Data
@NoArgsConstructor
public class Attendee {

  private Player player;
  private int score;
  private int rank;
  private Date cashedOutTime;

}
