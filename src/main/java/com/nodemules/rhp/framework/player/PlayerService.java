package com.nodemules.rhp.framework.player;

import com.nodemules.rhp.framework.player.bean.Player;
import com.nodemules.rhp.mapper.player.PlayerMapper;
import com.nodemules.rhp.repository.PlayerRepository;
import fr.xebia.extras.selma.Selma;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author brent
 * @since 7/26/17.
 */
@Service
public class PlayerService implements PlayerOperations {

  private static final Logger LOG = LoggerFactory.getLogger(PlayerService.class);

  private static final PlayerMapper mapper = Selma.builder(PlayerMapper.class).build();

  @Autowired
  private PlayerRepository playerRepo;

  @Override
  public List<Player> getPlayers() {
    return mapper.toPlayers(playerRepo.findAll());
  }

  @Override
  public Player getPlayer(Integer id) {
    return mapper.toPlayer(playerRepo.findOne(id));
  }

  @Override
  public Player persistPlayer(Player player) {
    return mapper.toPlayer(playerRepo.save(mapper.toPlayer(player)));
  }
}
