package com.nodemules.rhp.framework.event.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.nodemules.rhp.framework.venue.bean.Venue;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.Min;
import java.util.Date;

/**
 * @author brent
 * @since 7/26/17.
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Event {

  @Id
  @Min(1)
  private Long id = -1L;
  private int status;
  private boolean completed;

  @NonNull
  private Date date;

  @NonNull
  private Venue venue;

}
