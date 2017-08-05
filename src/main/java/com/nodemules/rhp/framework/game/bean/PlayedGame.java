package com.nodemules.rhp.framework.game.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author brent
 * @since 8/5/17.
 */
@Data
@NoArgsConstructor
public class PlayedGame {

  private Game game;
  private int score;
  private int rank;
  private Date cashedOutTime;

}
