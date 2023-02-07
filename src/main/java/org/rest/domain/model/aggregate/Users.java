package org.rest.domain.model.aggregate;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.rest.domain.model.entities.UserId;
import org.springframework.data.domain.Persistable;

@Getter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
public class Users implements Persistable<String>{

  @EmbeddedId
  private UserId userId;

  @Column(name = "user_name", nullable = false, length = 10)
  private String userName;

  @Column(name = "user_pwd", nullable = false, length = 20)
  private String userPwd;

  @Column(name = "user_birth", nullable = false, length = 8)
  private String userBirth;

  @Column(name = "user_phone_number", length = 11)
  private String userPhoneNumber;

  @Override
  public boolean isNew(){
    return true;
  }

  @Override
  public String getId(){
    return this.userId.toString();
  }

}
