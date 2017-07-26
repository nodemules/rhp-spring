package com.nodemules.rhp.repository;

import com.nodemules.rhp.orm.player.Player;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author brent
 * @since 7/26/17.
 */
public interface PlayerRepository extends MongoRepository<Player, ObjectId> {
}
