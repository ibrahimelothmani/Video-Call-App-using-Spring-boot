package com.ibrahim.videocall;

import com.ibrahim.videocall.user.User;
import com.ibrahim.videocall.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {

	private static final Logger logger = LoggerFactory.getLogger(VideocallApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(VideocallApplication.class, args);

		logger.info("VIDEO CALL STARTED");
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			UserService service
	){
		return args -> {
			service.register(
					User.builder()
							.username("Ibrahim")
							.email("ibrahim@email.com")
							.password("2025")
							.build()
			);
			service.register(
					User.builder()
							.username("Oussama")
							.email("oussama@email.com")
							.password("1234")
							.build()
			);
			service.register(
					User.builder()
							.username("yassine")
							.email("yassine@email.com")
							.password("4321")
							.build()
			);
		};
	}
}
