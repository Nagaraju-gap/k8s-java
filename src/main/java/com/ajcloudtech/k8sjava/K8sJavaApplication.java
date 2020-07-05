package com.ajcloudtech.k8sjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class K8sJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(K8sJavaApplication.class, args);
	}

	@RequestMapping("/")
    public String index() {
        return "Hello to you from springBootExample";
    }

    

}
