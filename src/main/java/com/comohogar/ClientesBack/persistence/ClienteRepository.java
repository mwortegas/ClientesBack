package com.comohogar.ClientesBack.persistence;

import com.comohogar.ClientesBack.domain.DClient;
import com.comohogar.ClientesBack.domain.repository.DClientRepository;
import com.comohogar.ClientesBack.persistence.crud.ClienteCrudRepository;
import com.comohogar.ClientesBack.persistence.entity.Cliente;
import com.comohogar.ClientesBack.persistence.mapper.DClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepository implements DClientRepository {
    @Autowired
    private ClienteCrudRepository db;
    @Autowired
    private DClientMapper mpp;

    @Override
    public List<DClient> getAll() {
        List<DClient> lista = new ArrayList<DClient>();
        db.findAll().forEach(c -> lista.add(mpp.toDClient(c)));
        return lista;
    }

    @Override
    public Optional<DClient> getClientById(String email) {
        DClient cli = mpp.toDClient(db.findById(email).get());
        return Optional.of(cli);
    }

    @Override
    public Optional<DClient> grabar(DClient client) {
        Cliente cli = new Cliente();
        cli = mpp.toCliente(client);
        if (!db.existsById(client.geteMail())){
            db.save(cli);
            return Optional.of(client);
        }
        return null;
    }

    @Override
    public Boolean borrar(String email) {
        if(db.existsById(email)){
           ; db.deleteById(email);
            return true;
        }
        return false;
    }
}
