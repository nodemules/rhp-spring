package com.nodemules.rhp.helpers;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Component;

import java.text.ParseException;

/**
 * @author brent
 * @since 7/26/17.
 */
@Component
public final class DTOMapper {

  private static final ModelMapper mapper = new ModelMapper();

  public static <T, V> T map(V v) throws ParseException {
    TypeToken<T> type = new TypeToken<T>(){};
    return mapper.map(v, type.getType());
  }
}
