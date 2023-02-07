package org.rest.interfaces.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.rest.domain.model.entities.UserId;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SampleCommandRequestDto {

  @Schema(
      example = "MONGDANG13",
      required = true
  )
  private UserId userId;

  @Schema(
      example = "장현우",
      required = true
  )
  private String userName;

  @Schema(
      example = "1234qwer",
      required = true
  )
  private String userPwd;

  @Schema(
      example = "19881029",
      required = true
  )
  private String userBirth;

  @Schema(
      example = "01064295350"
  )
  private String userPhoneNumber;
}
