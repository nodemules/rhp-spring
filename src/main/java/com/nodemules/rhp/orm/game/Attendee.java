package com.nodemules.rhp.orm.game;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * @author brent
 * @since 7/26/17.
 */

@Data
@AllArgsConstructor
public class Attendee {

  @Field
  private ObjectId player;

  @Field
  private Integer score;

  @Field
  private Integer rank;

  @Field
  private Date cashedOutTime;

}
