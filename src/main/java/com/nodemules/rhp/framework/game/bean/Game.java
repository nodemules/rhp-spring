package com.nodemules.rhp.framework.game.bean;

import com.nodemules.rhp.framework.event.bean.Event;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;

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

  @Id
  @NonNull
  private Long id;
  @NonNull
  private Event event;
  private int status;
  private Date startTime;
  private Date endTime;
  private boolean finalTable;
  private boolean completed;
  private List<Attendee> players;
}
