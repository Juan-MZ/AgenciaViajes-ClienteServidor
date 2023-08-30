package co.unicauca.travelagency.client.access;

import co.unicauca.travelagency.commons.domain.Customer;

/**
 * Interface que define los servicios de persistencia de Clientes de la agencia
 *
 * @author Libardo Pantoja, Julio Hurtado
 */
public interface ICustomerAccess {

    /**
     * Buscar un cliente utilizando un socket
     *
     * @param id cedula del cliente
     * @return objeto cliente
     * @throws Exception error al buscar un cliente
     */
    public Customer findCustomer(String id) throws Exception;

    /**
     * Crea un Customer
     *
     * @param customer cliente de la agencia de viajes
     * @return devuelve la cedula del cliente creado
     * @throws Exception error crear el cliente
     */

    public String createCustomer(Customer customer) throws Exception;
}
