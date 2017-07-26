package com.nodemules.rhp.orm.game;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

/**
 * @author brent
 * @since 7/26/17.
 */
@Data
@AllArgsConstructor
@Document(collection = "games")
public class Game {

  @NonNull
  @Id
  private ObjectId id;

  @Field("statusId")
  @NonNull
  private int status;

  @Field
  private String event;

  @Field
  private Date startTime;

  @Field
  private Date endTime;

  @Field
  private Boolean finalTable;

  @Field
  private Boolean completed;

  private List<Attendee> players;

}
