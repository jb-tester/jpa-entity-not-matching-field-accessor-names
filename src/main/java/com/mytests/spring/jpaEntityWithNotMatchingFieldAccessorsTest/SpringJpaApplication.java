package com.mytests.spring.jpaEntityWithNotMatchingFieldAccessorsTest;

import com.mytests.spring.jpaEntityWithNotMatchingFieldAccessorsTest.data.PersonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaApplication.class, args);
    }
    @Bean
        public CommandLineRunner commandLineRunner(PersonService personService) {
            return args -> {
                System.out.println("--------------------------------------");
                System.out.println("====== Persons =====");
                personService.addAll().forEach(System.out::println);
                System.out.println("========= by name: ==========");
                personService.customQuery("Ivan").forEach(System.out::println);
                System.out.println("--------------------------------------");
            };
        }
}
