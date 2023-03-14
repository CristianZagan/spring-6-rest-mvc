package guru.springframework.spring6restmvc.repositories;

import guru.springframework.spring6restmvc.entitites.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}
