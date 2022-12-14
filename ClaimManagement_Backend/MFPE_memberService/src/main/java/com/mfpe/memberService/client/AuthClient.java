package com.mfpe.memberService.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.mfpe.memberService.dto.ValidatingDTO;



//@FeignClient(name = "auth-client", url = "${Authorization.URL}")
@FeignClient(name ="AUTHORIZATION-SERVICE/authorization")
public interface AuthClient {
	
	 @GetMapping(value = "/validate")
     public ValidatingDTO getsValidity(@RequestHeader(name = "Authorization", required = true) String token);

}
