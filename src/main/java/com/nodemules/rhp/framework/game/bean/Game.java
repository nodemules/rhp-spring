package com.nodemules.rhp.framework.game.bean;

import com.nodemules.rhp.framework.event.bean.Event;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

/**
 * @author brent
 * @since 7/26/17.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = { "attendees" })
@ToString(exclude = { "attendees" })
public class Game {

  @Id
  private Long id;

  @NonNull
  private Event event;

  private int status;
  private Date startTime;
  private Date endTime;
  private boolean finalTable;
  private boolean completed;
  private boolean inProgress;

  private List<Attendee> attendees;

}
