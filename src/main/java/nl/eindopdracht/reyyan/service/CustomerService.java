package nl.eindopdracht.reyyan.service;

import nl.eindopdracht.reyyan.model.Customer;
import java.util.List;

public interface CustomerService {

    List<Customer> findAllCustomers();

    Customer findCustomerById(int theId);

    void saveCustomer(Customer theCustomer);

    void deleteCustomerById(int theId);

    Long numberOfCustomers();

    Customer updateCustomer(Customer customer);
}
