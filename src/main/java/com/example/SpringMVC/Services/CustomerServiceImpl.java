package com.example.SpringMVC.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.SpringMVC.Model.Customer;
import com.example.SpringMVC.Repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService
{
    @Autowired
    private CustomerRepository CustomerRepository;

    @Override
    public Customer createCustomer(Customer customer)
    {
        return CustomerRepository.save(customer);
    }
    
    @Override
    public Customer findCustomerById(Long id)
    {
        return CustomerRepository.findById(id).get();
    }

    @Override
    public List<Customer> findAllCustomers()
    {
        return CustomerRepository.findAll();
    }

    @Override
    public Customer updateCustomer(Customer customer)
    {  
        customer.setId(customer.getId());
        customer.setNome(customer.getNome());
        customer.setSobrenome(customer.getSobrenome());
        
        CustomerRepository.save(customer);
        
        return CustomerRepository.findById(customer.getId()).get();
    }
    
    @Override
    public List<Customer> deleteCustomerById(Long id)
    {
        CustomerRepository.deleteById(id);
        
        return CustomerRepository.findAll();
    }

    @Override
    public List<Customer> deleteCustomer(Customer customer)
    {
        CustomerRepository.delete(customer);
        
        return CustomerRepository.findAll();
    }
}
