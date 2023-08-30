
package co.unicauca.travelagency.server.domain;

import co.unicauca.travelagency.server.domain.services.CustomerService;
import co.unicauca.travelagency.commons.domain.Customer;
import co.unicauca.travelagency.server.access.Factory;
import co.unicauca.travelagency.server.access.ICustomerRepository;
import java.util.Date;
import java.util.Random;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Libardo, Julio
 */
public class CustomerServiceTest {


    @Test
    public void testFindCustomer() {
        System.out.println("findCustomer");
        String id = "98000001";
        ICustomerRepository repo = Factory.getInstance().getRepository();
        CustomerService instance = new CustomerService(repo);
        String expResult = "98000001";
        Customer result = instance.findCustomer(id);
        assertEquals(expResult, result.getId());
        
        // Customer que no existe
        result = instance.findCustomer("12345678");
        assertEquals(null, result);

    }
    
    @Test
    public void testCreateCustomer() {
        Customer customer = new Customer();
        String id = String.valueOf(new Random().nextInt(1000-10) + 10);
        customer.setId(id);
        customer.setFirstName("Juan");
        customer.setLastName("Perez");
        customer.setAddress("Calle 12 no. 12-12 Popayan");
        customer.setEmail("juanperez" + id + "@gmail.com");
        customer.setGender("M");
        customer.setMobile("31234234");
        
        ICustomerRepository repo = Factory.getInstance().getRepository();
        CustomerService instance = new CustomerService(repo);
        String expResult = id;
        String result = instance.createCustomer(customer);
        assertEquals(expResult, result);
        
        // Validar un dato erroneo
        customer.setFirstName("");
        result = instance.createCustomer(customer);
        assertTrue(result.contains("BAD_REQUEST"));
        
                
    }    
    
}
