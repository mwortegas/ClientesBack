package com.comohogar.ClientesBack.web.controller;

import com.comohogar.ClientesBack.domain.DClient;
import com.comohogar.ClientesBack.domain.service.DClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cli")
@CrossOrigin("*")
public class DClientController {
    @Autowired
    private DClientService sv;
    @GetMapping("/all")
    public List<DClient> getAll() {
        return sv.getAll();
    }

    @GetMapping("/{correo}")
    public Optional<DClient> getClientById(@PathVariable("correo") String email) {
        return sv.getClientById(email);
    }

    @PostMapping("/save")
    public Optional<DClient> grabar(@RequestBody DClient client) {
        return sv.grabar(client);
    }

    @DeleteMapping("/delete/{correo}")
    public Boolean borrar(String email) {
        return sv.borrar(email);
    }
}
