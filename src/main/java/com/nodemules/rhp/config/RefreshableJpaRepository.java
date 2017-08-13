package com.nodemules.rhp.config;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * @author brent
 * @since 8/13/17.
 */
@NoRepositoryBean
public interface RefreshableJpaRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {

  void refresh(T one);
}
