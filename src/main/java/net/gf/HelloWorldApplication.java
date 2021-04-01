package net.gf;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}
	
	@RequestMapping("/echo")
	public String echo() {
		LocalDateTime now = LocalDateTime.now();
		return "Hello World at " + now.toString();
	}
	
	@RequestMapping("/echo/{name}")
	public String echo(@PathVariable("name") String name) {
		LocalDateTime now = LocalDateTime.now();
		return "Hello " + name + " at " + now.toString();
	}
}
