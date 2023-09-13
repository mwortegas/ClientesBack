package com.comohogar.ClientesBack.web.controller;

import com.comohogar.ClientesBack.domain.SkFormato;
import com.comohogar.ClientesBack.domain.ThFormato;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/th")
@CrossOrigin("*")
public class DThFormatoController {
    @GetMapping("/all")
    public List<ThFormato> getAll(){
        XmlMapper xmlMapper = new XmlMapper();
        try {
            List<ThFormato> beneficios = xmlMapper.readValue(new File("src/Referencias/th_formato.xml"), ArrayList.class);
            return beneficios;
        }catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    @PostMapping("/save")
    public ThFormato grabar(@RequestBody ThFormato th){
        XmlMapper xmlMapper = new XmlMapper();
        try{
            List<ThFormato> beneficios = xmlMapper.readValue(new File("src/Referencias/th_formato.xml"), ArrayList.class);
            beneficios.add(th);
            xmlMapper.writeValue(new File("src/Referencias/th_formato.xml"), beneficios);
            return th;
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
