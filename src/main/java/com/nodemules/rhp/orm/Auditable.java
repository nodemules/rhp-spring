package com.nodemules.rhp.orm;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * @author brent
 * @since 8/13/17.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class Auditable {

  @Column(name = "created_date", nullable = false, updatable = false)
  @CreatedDate
  private Date createdDate;

  @Column(name = "modified_date")
  @LastModifiedDate
  private Date modifiedDate;

}
