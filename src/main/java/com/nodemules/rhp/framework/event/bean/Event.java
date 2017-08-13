package com.nodemules.rhp.framework.event.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.nodemules.rhp.framework.audit.Auditable;
import com.nodemules.rhp.framework.game.bean.Game;
import com.nodemules.rhp.framework.venue.bean.Venue;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.Min;
import java.util.Date;
import java.util.List;

/**
 * @author brent
 * @since 7/26/17.
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Event extends Auditable {

  @Id
  @Min(1)
  private Long id = -1L;
  private int status;
  private boolean completed;

//  @NonNull - TODO fix persisting game to return populated entities and enable this for validation purposes
  @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
  private Date date;

//  @NonNull - TODO fix persisting game to return populated entities and enable this for validation purposes
  private Venue venue;

  private List<Game> games;

}
