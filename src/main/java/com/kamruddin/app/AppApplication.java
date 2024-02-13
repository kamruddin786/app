package com.kamruddin.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;

@SpringBootApplication
public class AppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }


}

@RestController
class AppController {

	@GetMapping("/")
	ResponseEntity<?> getData() throws UnknownHostException {
		InetAddress inet4Address = Inet4Address.getLocalHost();
		return ResponseEntity.ok(Map.of("message", "Welcome from - " + inet4Address.getHostAddress() + " - " + inet4Address.getHostName()));
	}

}
