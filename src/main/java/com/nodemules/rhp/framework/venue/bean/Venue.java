package com.nodemules.rhp.framework.venue.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.nodemules.rhp.framework.event.bean.Event;
import com.nodemules.rhp.util.TimeUtil;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.DayOfWeek;
import java.util.List;

/**
 * @author brent
 * @since 7/26/17.
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Venue {

  @Id
  @Min(1)
  private Long id = -1L;

  private int status;
  private String name;
  private DayOfWeek day;

  private int numberOfGames;

  private List<Event> events;

  @Min(0)
  @Max(23)
  @JsonProperty(access = Access.WRITE_ONLY)
  private int hour;

  @Min(0)
  @Max(59)
  @JsonProperty(access = Access.WRITE_ONLY)
  private int minute;

  @JsonProperty("time")
  public String getTime() {
    return TimeUtil.getTime(this.hour, this.minute);
  }

}
