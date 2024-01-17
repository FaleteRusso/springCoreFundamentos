package com.corenetworks.springCoreFundamentos.modelo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component("tp")
public class TallerPintura implements ITaller{

    @Override
    public String reparar(Coche c) {
        return "El coche está en chapa y pintura" + c.getMatricula() +"Modelo: "+ c.getModelo();
    }
}
