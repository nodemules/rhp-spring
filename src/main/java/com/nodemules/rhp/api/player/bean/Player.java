package com.nodemules.rhp.api.player.bean;

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

  @NonNull
  private String id;
  @NonNull
  private String name;
  private boolean isTournamentDirector;
  private int shoutOuts;


}
