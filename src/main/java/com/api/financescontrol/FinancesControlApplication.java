package com.api.financescontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FinancesControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancesControlApplication.class, args);
	}

	@GetMapping("/teste")
	public String index(){
		return "Hello, world!";
	}

}
