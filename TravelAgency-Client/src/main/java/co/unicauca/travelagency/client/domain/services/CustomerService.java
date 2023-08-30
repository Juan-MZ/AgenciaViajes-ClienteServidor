package co.unicauca.travelagency.client.domain.services;

import co.unicauca.travelagency.commons.domain.Customer;
import co.unicauca.travelagency.client.access.ICustomerAccess;

/**
 * Es una fachada para comunicar la presentación con el
 * dominio
 *
 * @author Libardo Pantoja, Julio Hurtado
 */
public class CustomerService {

    private final ICustomerAccess service;

    /**
     * Constructor privado que evita que otros objetos instancien
     * @param service implementacion de tipo ICustomerService
     */
    public CustomerService(ICustomerAccess service) {
        this.service = service;
    }

    /**
     * Busca un cliente en el servidor remoto
     *
     * @param id identificador del cliente
     * @return Objeto tipo Cliente, null si no lo encuentra
     * @throws java.lang.Exception la excepcio se lanza cuando no logra conexión
     * con el servidor
     */
    public Customer findCustomer(String id) throws Exception {
        return service.findCustomer(id);

    }
    
    public String createCustomer(Customer customer) throws Exception {
        return service.createCustomer(customer);

    }    

}
