package com.comohogar.ClientesBack.web.controller;

import com.comohogar.ClientesBack.domain.SkFormato;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.util.List;
@RestController
@RequestMapping("/sk")
@CrossOrigin("*")
public class DSkFormatoController {
    @GetMapping("/all")
    public List<SkFormato> getAll(){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<SkFormato> beneficios =  objectMapper.readValue(new File("src/Referencias/sk_formato.json"),
                    new TypeReference<List<SkFormato>>() {});
            return beneficios;
        }catch (IOException ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @PostMapping("/save")
    public SkFormato grabar(@RequestBody SkFormato skFormato) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<SkFormato> beneficios =  objectMapper.readValue(new File("src/Referencias/sk_formato.json"),
                    new TypeReference<List<SkFormato>>() {});
            beneficios.add(skFormato);
            objectMapper.writeValue(new File("src/Referencias/sk_formato.json"), beneficios);
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
        return skFormato;
    }

}
