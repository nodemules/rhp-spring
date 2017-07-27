package com.nodemules.rhp.repository;

import com.nodemules.rhp.orm.player.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author brent
 * @since 7/26/17.
 */
@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
