package lannisi.sample.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AppServiceSample {

	public static void main(String[] args) throws Exception {
        SpringApplication.run(AppServiceSample.class, args);
    }
	
}
