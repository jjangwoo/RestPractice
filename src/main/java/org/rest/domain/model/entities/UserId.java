package org.rest.domain.model.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class UserId implements Serializable {

  @Id
  @Column(name = "user_id", unique = true, nullable = false, length = 12)
  private String userId;
}
