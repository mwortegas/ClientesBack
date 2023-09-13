package com.comohogar.ClientesBack.persistence.crud;

import com.comohogar.ClientesBack.persistence.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteCrudRepository extends CrudRepository<Cliente, String> {


}
