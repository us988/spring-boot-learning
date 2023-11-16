package com.example.demo.customer;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping(path = "api/v1/customer")
@RestController
public class CustomerController  {
    private final CustomerService customerService;
    @Autowired
    public CustomerController(CustomerService customerService)
    {
        this.customerService=customerService;
    }
    @GetMapping(value = "all")
   List <Customer> getCustomer()
    {
        return customerService.getCustomer();
    }

    @PostMapping
     void createNewCustomer(@Valid @RequestBody Customer customer){
        System.out.println("Post Request send by");
        System.out.println(customer);
    }
    @PutMapping
    void updateCustomer(@Valid @RequestBody Customer customer){
        System.out.println("update Request send by");
        System.out.println(customer);
    }

    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(@PathVariable("customerid") Long id){
        System.out.println("Delete request for customer id" + id);

    }

}
