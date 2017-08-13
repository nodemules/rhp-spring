package com.nodemules.rhp.framework.specifications;

import org.springframework.stereotype.Component;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import java.util.List;

/**
 * @author brent
 * @since 8/13/17.
 */
@Component
public abstract class BaseSpecification {

  protected static Predicate or(CriteriaBuilder cb, List<Predicate> predicates) {
    return cb.or(predicates.toArray(new Predicate[predicates.size()]));
  }

  protected static Predicate and(CriteriaBuilder cb, List<Predicate> predicates) {
    return cb.and(predicates.toArray(new Predicate[predicates.size()]));
  }
}
