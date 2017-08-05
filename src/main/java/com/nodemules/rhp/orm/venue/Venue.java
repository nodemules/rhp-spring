package com.nodemules.rhp.orm.venue;

import com.nodemules.rhp.orm.event.Event;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.DayOfWeek;
import java.util.Set;

/**
 * @author brent
 * @since 7/26/17.
 */
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "venue")
@Data
@EqualsAndHashCode(exclude="events")
@ToString(exclude="events")
public class Venue {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "venue_id")
  private Long id;

  private int status;
  private String name;
  private DayOfWeek day;

  @Min(0)
  @Max(23)
  private int hour;

  @Min(0)
  @Max(59)
  private int minute;

  private int numberOfGames;

  @OneToMany(mappedBy = "venue")
  private Set<Event> events;

}
