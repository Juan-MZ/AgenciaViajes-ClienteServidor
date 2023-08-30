package co.unicauca.travelagency.server.access;

import co.unicauca.travelagency.commons.domain.Customer;

/**
 * Interface del respositorio de clientes
 * @author Libardo Pantoja
 */
public interface ICustomerRepository {
    /**
     * Busca un Customer por su ceduka
     * @param id cedula del cliente
     * @return  objeto de tipo Customer
     */
    public Customer findCustomer(String id);
    
    public String createCustomer(Customer customer);

}
