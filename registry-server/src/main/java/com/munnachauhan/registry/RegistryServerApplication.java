package com.munnachauhan.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Spring Cloud Netflix Eureka Registry server.
 *
 * @author Munna Chauhan
 */

@SpringBootApplication
@EnableEurekaServer
public class RegistryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistryServerApplication.class, args);
    }

}
