package com.nodemules.rhp.orm.player;

import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author brent
 * @since 7/26/17.
 */
@Document
public class Player {

  @NonNull
  @Id
  private ObjectId id;
  @NonNull
  private String name;
  private boolean isTournamentDirector;
  private int shoutOuts;
}
