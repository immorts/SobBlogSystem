package com.example.sobblogsystem;

import com.example.sobblogsystem.utils.RedisUtils;
import com.example.sobblogsystem.utils.SnowflakeIdWorker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Random;

@SpringBootApplication
@EnableSwagger2
public class SobBlogSystemApplication {

	public static final Logger log = LoggerFactory.getLogger(SobBlogSystemApplication.class);

	public static void main(String[] args) {
		log.info("SobBlogSystemApplication is running......");
		SpringApplication.run(SobBlogSystemApplication.class, args);
	}

	@Bean
	public SnowflakeIdWorker createIdWorker(){
		return new SnowflakeIdWorker(0,0);
	}

	@Bean
	public BCryptPasswordEncoder createPasswordEncoder(){
		return new BCryptPasswordEncoder();
	}

	@Bean
	public RedisUtils createRedisUtils(){
		return new RedisUtils();
	}

	@Bean
	public Random createRandom(){
		return new Random();
	}

}
