package org.rest.application.queryservices;


import lombok.RequiredArgsConstructor;
import org.rest.domain.model.entities.UserId;
import org.rest.domain.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class SampleQueryService {

  private final UserRepository repository;

  @Transactional(readOnly = true)
  public String execute(String userId){
    UserId id = new UserId(userId);
    String userName = repository.findById(id).get().getUserName();
    return userName;
  }
}
