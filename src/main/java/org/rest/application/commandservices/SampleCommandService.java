package org.rest.application.commandservices;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.rest.domain.model.aggregate.Users;
import org.rest.domain.repository.UserRepository;
import org.rest.interfaces.dto.SampleCommandRequestDto;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class SampleCommandService {

  private final UserRepository repository;

  public String execute(SampleCommandRequestDto dto){
    Users users = Users.builder()
        .userId(dto.getUserId())
        .userName(dto.getUserName())
        .userPwd(dto.getUserPwd())
        .userBirth(dto.getUserBirth())
        .userPhoneNumber(dto.getUserPhoneNumber())
        .build();
    try {
      repository.save(users);
    } catch(Exception e){
      log.info("error : {}", e.getMessage().toString());
      return "Fail";
    }
    return "Sucess";
  }

}
