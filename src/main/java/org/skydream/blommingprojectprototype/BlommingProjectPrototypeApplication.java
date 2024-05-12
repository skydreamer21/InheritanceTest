package org.skydream.blommingprojectprototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BlommingProjectPrototypeApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlommingProjectPrototypeApplication.class, args);
    }

}
