package com.nodemules.rhp.framework.player.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * @author brent
 * @since 7/26/17.
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Player {

  @Id
  @Min(1)
  private Long id = -1L;

  @NonNull
  private String name;

  private int status;
  private boolean tournamentDirector;
  private int shoutOuts;

}
