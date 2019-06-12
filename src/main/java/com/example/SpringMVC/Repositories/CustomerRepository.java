package com.example.SpringMVC.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.SpringMVC.Model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>
{
    
}