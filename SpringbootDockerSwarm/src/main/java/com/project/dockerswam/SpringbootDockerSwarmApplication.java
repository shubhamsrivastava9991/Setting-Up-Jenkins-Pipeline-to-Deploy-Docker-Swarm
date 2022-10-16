package com.project.dockerswam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerSwarmApplication {

	@GetMapping
	public String message() {
		return "Succefully Setuped the Jenkins Piple to Docker Swarm";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerSwarmApplication.class, args);
	}

}
