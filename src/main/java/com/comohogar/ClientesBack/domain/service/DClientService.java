package com.comohogar.ClientesBack.domain.service;

import com.comohogar.ClientesBack.domain.DClient;
import com.comohogar.ClientesBack.persistence.ClienteRepository;
import com.comohogar.ClientesBack.persistence.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DClientService {
    @Autowired
    private ClienteRepository rp;

    public List<DClient> getAll() {
        return rp.getAll();
    }

    public Optional<DClient> getClientById(String email) {
        return rp.getClientById(email);
    }

    public Optional<DClient> grabar(DClient client) {
        return rp.grabar(client);
    }

    public Boolean borrar(String email) {
        return rp.borrar(email);
    }
}
