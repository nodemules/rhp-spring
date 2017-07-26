package com.nodemules.rhp.repository;

import com.nodemules.rhp.orm.game.Game;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author brent
 * @since 7/26/17.
 */
public interface GameRepository extends MongoRepository<Game, ObjectId> {
}
