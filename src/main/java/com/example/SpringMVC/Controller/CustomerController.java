package com.example.SpringMVC.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.SpringMVC.Model.Customer;
import org.springframework.http.HttpStatus;
import com.example.SpringMVC.Services.CustomerService;

@RestController
@RequestMapping(CustomerController.BASE_URL)
public class CustomerController
{
    public static final String BASE_URL = "/api/v1/customers";
    
    @Autowired
    private CustomerService customerService;
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer createCustomer(@RequestBody Customer customer)
    {
        return customerService.createCustomer(customer);
    }
    
    @GetMapping
    public List<Customer> findAllCustomers()
    {
        return customerService.findAllCustomers();
    }
    
    @GetMapping("/{id}")
    public Customer findCustomerById(@PathVariable long id)
    {
        return customerService.findCustomerById(id);
    }
    
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Customer updateCustomer(@RequestBody Customer customer)
    {
        return customerService.updateCustomer(customer);
    }
    
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<Customer> deleteCustomerById(@PathVariable Long id)
    {
        return customerService.deleteCustomerById(id);
    }
    
    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Customer> deleteCustomer(@RequestBody Customer customer)
    {
        return customerService.deleteCustomer(customer);
    }
}