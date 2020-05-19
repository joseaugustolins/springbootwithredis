package joseaugusto.springbootwithredis;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/hello")
	@Cacheable("hello")
	public String hello() {
		System.out.println("cache");
		return "hello world";
	}
	
	@CacheEvict("hello")
	@GetMapping("/cancel")
	public String cancel() {
		System.out.println("cancela");
		return "Hello";
	}
	
}
