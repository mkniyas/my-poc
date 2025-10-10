package com.patientpoint.ecc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
public class AppMain {
  public static void main(String[] args) { SpringApplication.run(AppMain.class, args); }
}
@RestController
class HelloController {
  @GetMapping("/")
  String hello() { return "ecc is alive!"; }
}
