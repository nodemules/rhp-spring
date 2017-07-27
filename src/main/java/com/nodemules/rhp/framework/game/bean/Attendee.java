package com.nodemules.rhp.framework.game.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author brent
 * @since 7/26/17.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Attendee {

  private String player;
  private int score;
  private int rank;
  private Date cashedOutTime;

}
