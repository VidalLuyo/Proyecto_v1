package pe.edu.utp.proyect.services;

import pe.edu.utp.proyect.model.Customer;
import java.util.List;
import java.util.Optional;

public interface CustomerService {

    List<Customer> findAll();

    Optional<Customer> findById(Long id);

    Customer save(Customer customer);

    Customer update(Customer customer);
    
}