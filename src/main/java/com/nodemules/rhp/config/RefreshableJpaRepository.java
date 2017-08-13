package com.nodemules.rhp.config;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * @author brent
 * @since 8/13/17.
 */
@NoRepositoryBean
public interface RefreshableJpaRepository<T, ID extends Serializable> extends JpaRepository<T, ID>, JpaSpecificationExecutor<T> {

  void refresh(T one);
}
