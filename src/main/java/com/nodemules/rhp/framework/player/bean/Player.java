package com.nodemules.rhp.framework.player.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.nodemules.rhp.framework.game.bean.PlayedGame;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.validation.constraints.Min;
import java.util.List;

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

//  @NonNull - TODO fix persisting game to return populated entities and enable this for validation purposes
  private String name;

  private int status;
  private boolean tournamentDirector;
  private int shoutOuts;

  private List<PlayedGame> games;

}
