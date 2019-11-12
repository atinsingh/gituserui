package profile_demo.springprofiles.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import profile_demo.springprofiles.domain.Customer;
@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long> {
}
