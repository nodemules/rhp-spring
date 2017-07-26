package com.nodemules.rhp.repository;

import com.nodemules.rhp.orm.event.Event;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author brent
 * @since 7/26/17.
 */
public interface EventRepository extends MongoRepository<Event, ObjectId> {
}
