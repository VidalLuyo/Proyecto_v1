package pe.edu.utp.proyect.repository;

import pe.edu.utp.proyect.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}