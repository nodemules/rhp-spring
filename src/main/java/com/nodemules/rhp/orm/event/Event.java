package com.nodemules.rhp.orm.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author brent
 * @since 7/26/17.
 */
@Data
@AllArgsConstructor
@Document(collection = "events")
public class Event {

  @NonNull
  @Id
  private ObjectId id;

  @Field("statusId")
  @NonNull
  private int status;


}
