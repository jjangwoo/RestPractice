package org.rest.interfaces;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.rest.application.commandservices.SampleCommandService;
import org.rest.application.queryservices.SampleQueryService;
import org.rest.interfaces.dto.SampleCommandRequestDto;
import org.rest.interfaces.dto.SampleCommandResponseDto;
import org.rest.interfaces.dto.SampleRequestDto;
import org.rest.interfaces.dto.SampleResponseDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Sample API", description = "Sample")
@RestController
@RequiredArgsConstructor
@RequestMapping("/Sample")
@Slf4j
public class SampleController {
  private final SampleQueryService queryService;

  private final SampleCommandService commandService;

  @PostMapping("/getUserName")
  public SampleResponseDto getUserName(
      @RequestBody SampleRequestDto dto
  ){
    SampleResponseDto responseDto = new SampleResponseDto();
    responseDto.setSample(queryService.execute(dto.getUserId()));

    return responseDto;
  }

  @PostMapping("/createUser")
  public SampleCommandResponseDto insSample(
      @RequestBody SampleCommandRequestDto dto
  ){
    SampleCommandResponseDto responseDto = new SampleCommandResponseDto();
    responseDto.setResult(commandService.execute(dto));

    return responseDto;
  }

}
