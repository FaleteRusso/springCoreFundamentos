package com.corenetworks.springCoreFundamentos.Informe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data@Component
public class Secretario implements IEmpleado {
    private String empresa;
    private String email;
    @Autowired
    private IInforme i;


    @Override
    public String getTarea() {
        return "Lleva el registro de reuniones";
    }

    @Override
    public String getInforme() {
        return i.getInforme();
    }
}
