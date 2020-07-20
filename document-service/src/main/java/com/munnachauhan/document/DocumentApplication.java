package com.munnachauhan.document;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Spring Mongo Reactive FireStore Sample.
 *
 * @author Munna Chauhan
 */

@SpringBootApplication
@EnableDiscoveryClient
public class DocumentApplication {

    public static void main(String[] args) {
        SpringApplication.run(DocumentApplication.class, args);
    }

}
