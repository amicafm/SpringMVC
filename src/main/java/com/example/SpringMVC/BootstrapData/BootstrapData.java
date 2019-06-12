package com.example.SpringMVC.BootstrapData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.SpringMVC.Model.Customer;
import com.example.SpringMVC.Repositories.CustomerRepository;

@Component
public class BootstrapData implements CommandLineRunner
{
    @Autowired
    private CustomerRepository costumerRepository;

    @Override
    public void run(String... args) throws Exception
    {
        System.out.println("Carregando dados...");

        Customer c1 = new Customer();
        c1.setNome("Ana");
        c1.setSobrenome("Silva");
        costumerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setNome("Paulo");
        c2.setSobrenome("Reis");
        costumerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setNome("Bethania");
        c3.setSobrenome("Severina");
        costumerRepository.save(c3);

        System.out.println("Clientes salvos:" + costumerRepository.count());
    }
}
