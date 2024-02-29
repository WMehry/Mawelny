package tn.esprit.infinipi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "tn.esprit.infinipi.entities")

public class InfiniPiApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfiniPiApplication.class, args);
    }
}
