package com.nodemules.rhp.config;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import java.io.Serializable;

/**
 * @author brent
 * @since 8/13/17.
 */
public class RefreshableJpaRepositoryImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID> implements RefreshableJpaRepository<T, ID> {

  private final EntityManager entityManager;

  public RefreshableJpaRepositoryImpl(Class<T> domainClass, EntityManager entityManager) {
    super(domainClass, entityManager);
    this.entityManager = entityManager;
  }

  public void refresh(T one) {
    entityManager.refresh(one);
  }
}
