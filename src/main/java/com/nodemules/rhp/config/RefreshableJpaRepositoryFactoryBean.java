package com.nodemules.rhp.config;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;
import org.springframework.data.repository.core.RepositoryInformation;
import org.springframework.data.repository.core.RepositoryMetadata;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;

import javax.persistence.EntityManager;
import java.io.Serializable;

/**
 * @author brent
 * @since 8/13/17.
 */
public class RefreshableJpaRepositoryFactoryBean<R extends JpaRepository<T, I>, T,
    I extends Serializable> extends JpaRepositoryFactoryBean<R, T, I> {

  public RefreshableJpaRepositoryFactoryBean(Class<? extends R> repositoryInterface) {
    super(repositoryInterface);
  }

  @Override
  protected RepositoryFactorySupport createRepositoryFactory(EntityManager em) {
    return new RefreshableJpaRepositoryFactory(em);
  }

  private static class RefreshableJpaRepositoryFactory<T, I extends Serializable>
      extends JpaRepositoryFactory {

    private final EntityManager em;

    public RefreshableJpaRepositoryFactory(EntityManager em) {
      super(em);
      this.em = em;
    }

    @Override
    protected Object getTargetRepository(RepositoryInformation metadata) {
      return new RefreshableJpaRepositoryImpl<T, I>((Class<T>) metadata.getDomainType(), em);
    }

    @Override
    protected Class<?> getRepositoryBaseClass(RepositoryMetadata metadata) {
      return RefreshableJpaRepositoryImpl.class;
    }
  }
}
