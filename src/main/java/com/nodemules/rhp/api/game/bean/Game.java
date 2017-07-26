package com.nodemules.rhp.api.game.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;
import java.util.List;

/**
 * @author brent
 * @since 7/26/17.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game {

  @NonNull
  private String id;

  @NonNull
  private int status;

  @NonNull
  private String event;
  private Date startTime;
  private Date endTime;
  private boolean finalTable;
  private boolean completed;
  private List<Attendee> players;
}
