package nl.eindopdracht.reyyan.service;

import nl.eindopdracht.reyyan.model.Customer;
import nl.eindopdracht.reyyan.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository repository;

    public CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Customer> findAllCustomers() {
        return repository.findAll();
    }

    @Override
    public Customer findCustomerById(int theId) {
        Optional<Customer> result = repository.findById(theId);

        Customer theCustomer = null;
        if (result.isPresent()) {
            theCustomer = result.get();
        } else {
            throw new RuntimeException("Klant niet gevonden! ID - " + theId);
        }
        return theCustomer;
    }

    @Override
    public void saveCustomer(Customer theCustomer){
        repository.save(theCustomer);
    }

    @Override
    public void deleteCustomerById(int theId) {
        repository.deleteById(theId);
    }

    @Override
    public Long numberOfCustomers(){
        return repository.count();
    }

    @Override
    public Customer updateCustomer(final Customer customer) {
        return repository.save(customer);
    }
}
