package nl.eindopdracht.reyyan.controller;

import nl.eindopdracht.reyyan.model.Customer;
import nl.eindopdracht.reyyan.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/addCustomer")
    public Customer addCustomer (@RequestBody Customer customer) {
        if (customer == null) return null;
        customerService.saveCustomer(customer);
        return customer;
    }

    @GetMapping("/")
    public List<Customer> getAllCustomers() {
        return customerService.findAllCustomers();
    }

    @GetMapping("/{customerId}")
    public Customer getCustomerById(@PathVariable("customerId") Integer theId) {
        return customerService.findCustomerById(theId);
    }

    @DeleteMapping("/deleteCustomer/{customerId}")
    public boolean deleteCustomer(@PathVariable("customerId") Integer theId) {
        customerService.deleteCustomerById(theId);
        return true;
    }

}
