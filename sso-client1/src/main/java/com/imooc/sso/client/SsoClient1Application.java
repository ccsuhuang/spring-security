package com.imooc.sso.client;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * ClassName: SsoCient1Application 
 * @Description: TODO
 * @author lihaoyang
 * @date 2018年3月16日
 */
@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class SsoClient1Application {

	@GetMapping("/user")
	public Authentication  user(Authentication  user){
		return user;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SsoClient1Application.class, args);
	}
}