package com.corenetworks.springCoreFundamentos.Informe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data@Component
public class Director implements IEmpleado {
    @Autowired
    private IInforme i;
    public void Jefe (IInforme informe){

    }

    @Override
    public String getTarea() {
        return "El director marca el rumbo de la empresa";
    }

    @Override
    public String getInforme() {
        return i.getInforme();
    }
}
