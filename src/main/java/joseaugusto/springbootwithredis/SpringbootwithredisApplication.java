package joseaugusto.springbootwithredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootwithredisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootwithredisApplication.class, args);
	}

}
