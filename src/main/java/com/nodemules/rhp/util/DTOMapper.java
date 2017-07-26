package com.nodemules.rhp.util;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author brent
 * @since 7/26/17.
 */
@Component
public final class DTOMapper {

  private static final Logger LOG = LoggerFactory.getLogger(DTOMapper.class);

  private static final ModelMapper mapper = new ModelMapper();

  public static <T, V> List<T> mapAll(List<V> vList, Class<T> clazz) throws ParseException {
    List<T> list = new ArrayList<>();
    for (V v : vList) {
      list.add(map(v, clazz));
    }
    return list;
  }

  public static <T, V> T map(V v, Class<T> clazz) throws ParseException {
    LOG.info("Converting {} to {}", v.getClass().getName(), clazz.getName());
    return mapper.map(v, clazz);
  }
}
