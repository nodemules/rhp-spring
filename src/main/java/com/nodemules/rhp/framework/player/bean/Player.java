package com.nodemules.rhp.framework.player.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * @author brent
 * @since 7/26/17.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {

  private Long id = -1L;
  @NonNull
  private String name;
  private int status;
  private boolean tournamentDirector;
  private int shoutOuts;


}
