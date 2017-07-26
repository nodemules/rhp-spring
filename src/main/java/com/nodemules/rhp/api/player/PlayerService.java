package com.nodemules.rhp.api.player;

import com.nodemules.rhp.api.player.bean.Player;
import com.nodemules.rhp.util.DTOMapper;
import com.nodemules.rhp.repository.PlayerRepository;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

/**
 * @author brent
 * @since 7/26/17.
 */
@Service
public class PlayerService implements PlayerOperations {

  private static final Logger LOG = LoggerFactory.getLogger(PlayerService.class);

  @Autowired
  private PlayerRepository playerRepo;

  @Override
  public List<Player> getPlayers() throws ParseException {
    return DTOMapper.mapAll(playerRepo.findAll(), Player.class);
  }

  @Override
  public Player getPlayer(ObjectId id) throws ParseException {
    com.nodemules.rhp.orm.player.Player player = playerRepo.findOne(id);
    LOG.info("Player info for {} : {}", id, player.toString());
    Player p = DTOMapper.map(player, Player.class);
    return p;
  }
}
