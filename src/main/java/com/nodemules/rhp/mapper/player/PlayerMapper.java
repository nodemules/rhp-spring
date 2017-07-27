package com.nodemules.rhp.mapper.player;

import com.nodemules.rhp.framework.player.bean.Player;
import fr.xebia.extras.selma.Mapper;

import java.util.List;

/**
 * @author brent
 * @since 7/26/17.
 */
@Mapper
public interface PlayerMapper {

  /**
   * Converts ORM DAO to Bean
   *
   * @param player
   * @return
   */
  Player toPlayer(com.nodemules.rhp.orm.player.Player player);

  /**
   * Converts a List of ORM DAOs to a List of Beans
   *
   * @param player
   * @return
   */
  List<Player> toPlayers(List<com.nodemules.rhp.orm.player.Player> player);

  /**
   * Converts Bean to ORM DAO
   *
   * @param player
   * @return
   */
  com.nodemules.rhp.orm.player.Player toPlayer(Player player);

  /**
   * Converts a List of Beans to a List of ORM DAOs
   *
   * @param player
   * @return
   */
  List<com.nodemules.rhp.orm.player.Player> toPlayer(List<Player> player);

}
