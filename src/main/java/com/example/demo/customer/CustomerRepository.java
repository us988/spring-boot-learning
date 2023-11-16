package com.example.demo.customer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CustomerRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        // TODO Connect to real datbase
        return Arrays.asList(
                new Customer(1, "Usman shafqat", "Password123", "email@gmail.com"),
                new Customer(2, "Ali Hassan", "password1234", "ali@gmail.com"),
                new Customer(3, "Usama Mir", "password456", "usama@gmail.com"),
                new Customer(4, "Usama zahid", "password4567", "zahid@gmail.com")
        );
    }
}
