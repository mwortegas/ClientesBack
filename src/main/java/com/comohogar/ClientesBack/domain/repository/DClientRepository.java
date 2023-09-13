package com.comohogar.ClientesBack.domain.repository;

import com.comohogar.ClientesBack.domain.DClient;

import java.util.List;
import java.util.Optional;
    public interface DClientRepository {
        List<DClient> getAll();
        Optional<DClient> getClientById(String email);
        Optional<DClient> grabar(DClient client);
        Boolean borrar(String email);
}
