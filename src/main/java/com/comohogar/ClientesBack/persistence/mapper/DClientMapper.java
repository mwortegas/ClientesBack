package com.comohogar.ClientesBack.persistence.mapper;

import com.comohogar.ClientesBack.domain.DClient;
import com.comohogar.ClientesBack.persistence.entity.Cliente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface DClientMapper {
    @Mappings({
            @Mapping(source = "nombre", target = "name") ,
            @Mapping(source = "eMail", target = "eMail") ,
            @Mapping(source = "telefono", target = "phone") ,
            @Mapping(source = "tienda", target = "store") ,
            @Mapping(source = "grupo", target = "group") ,
            @Mapping(source = "editar", target = "edit") ,
            @Mapping(source = "eliminar", target = "delete") ,
    })
    DClient toDClient(Cliente cliente);
    @InheritInverseConfiguration
    Cliente toCliente(DClient dclient);
}

