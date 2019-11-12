package profile_demo.springprofiles.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import profile_demo.springprofiles.domain.Customer;
import profile_demo.springprofiles.repo.CustomerRepo;

import java.util.List;

@RestController
public class CustomerController {
    private CustomerRepo repo;

    public CustomerController(CustomerRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/customer")
    public List<Customer> getAll(){
        return repo.findAll();

    }
}
