package org.rest.interfaces.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SampleRequestDto {
  @Schema(
      example = "MONGDANG13"
  )
  private String userId;

}
