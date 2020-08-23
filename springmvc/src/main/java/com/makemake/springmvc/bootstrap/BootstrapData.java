package com.makemake.springmvc.bootstrap;

import com.makemake.springmvc.domain.Customer;
import com.makemake.springmvc.repositories.CustomerRepository;
import com.makemake.springmvc.services.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final CustomerRepository customerRepository;

    public BootstrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception{
        System.out.println("loading customer data");

        Customer c1 = new Customer();c1.setFirstName("c1");c1.setLastName("c1");customerRepository.save(c1);
        Customer c2 = new Customer();c2.setFirstName("c2");c2.setLastName("c2");customerRepository.save(c2);
        Customer c3 = new Customer();c3.setFirstName("c3");c3.setLastName("c3");customerRepository.save(c3);

        System.out.println("Customer Saved: "+ customerRepository.count());

    }
}
