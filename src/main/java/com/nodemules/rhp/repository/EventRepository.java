package com.nodemules.rhp.repository;

import com.nodemules.rhp.config.RefreshableJpaRepository;
import com.nodemules.rhp.orm.event.Event;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author brent
 * @since 7/26/17.
 */
@Repository
public interface EventRepository extends RefreshableJpaRepository<Event, Long>, JpaSpecificationExecutor<Event> {
}
