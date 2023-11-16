package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfigration {
    @Value("${app.useFakeCustomerRepo:false}")
    private Boolean useFakeCustomerRepo;
   @Bean
    CommandLineRunner commandLineRunner() {
       return args -> {
           System.out.println("Application started");
       };

   }
   @Bean 
       CustomerRepo customerRepo () {
           System.out.println("UsefakeRepositary : " + useFakeCustomerRepo);
            return useFakeCustomerRepo ?
                    new CustomerFakeRepository():
                    new CustomerRepository();
       }

}
