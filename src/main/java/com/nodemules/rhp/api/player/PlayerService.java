package com.nodemules.rhp.api.player;

import com.nodemules.rhp.api.player.bean.Player;
import com.nodemules.rhp.helpers.DTOMapper;
import com.nodemules.rhp.repository.PlayerRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;

/**
 * @author brent
 * @since 7/26/17.
 */
@Service
public class PlayerService implements PlayerOperations {

  @Autowired
  private PlayerRepository playerRepo;

  @Override
  public Player getPlayer(ObjectId id) throws ParseException {
    Player p = DTOMapper.map(playerRepo.findOne(id));
    return p;
  }
}
