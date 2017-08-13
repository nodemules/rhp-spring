package com.nodemules.rhp.framework.audit;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author brent
 * @since 8/13/17.
 */
@Data
@NoArgsConstructor
public class Auditable implements Serializable {

  @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
  @JsonProperty(access = JsonProperty.Access.READ_ONLY)
  private Date createdDate;

  @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
  @JsonProperty(access = JsonProperty.Access.READ_ONLY)
  private Date modifiedDate;
}
