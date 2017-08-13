package com.nodemules.rhp.repository;

import com.nodemules.rhp.config.RefreshableJpaRepository;
import com.nodemules.rhp.orm.game.Game;
import org.springframework.stereotype.Repository;

/**
 * @author brent
 * @since 7/26/17.
 */
@Repository
public interface GameRepository extends RefreshableJpaRepository<Game, Long> {

  void refresh(Game game);

}
