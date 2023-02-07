package org.rest.infrastructure.ext.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "NaverFeignClient", url = "${}")
public interface NaverFeignClient {

}
