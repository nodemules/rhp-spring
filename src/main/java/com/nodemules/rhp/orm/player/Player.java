package com.nodemules.rhp.orm.player;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author brent
 * @since 7/26/17.
 */
@Getter
@AllArgsConstructor
@Document(collection = "players")
public class Player {

  @NonNull
  @Id
  private ObjectId id;

  @NonNull
  @Field
  private String name;

  @Field("statusId")
  private int status;

  @Field("isTd")
  private boolean isTournamentDirector;

  @Field
  private int shoutOuts;

  private Stats stats;

  @AllArgsConstructor
  private final class Stats {
    private int totalWins;
    private int seasonWins;
    private int seasonPoints;
    private int totalPoints;
  }
}
