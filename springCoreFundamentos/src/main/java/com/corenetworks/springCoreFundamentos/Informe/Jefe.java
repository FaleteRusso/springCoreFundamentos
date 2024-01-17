package com.corenetworks.springCoreFundamentos.Informe;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Data
public class Jefe implements IEmpleado {
    @Autowired
    private IInforme i;

    @Override
    public String getTarea() {
        return "El Jefe Distribuye el trabajo";
    }

    @Override
    public String getInforme() {
        return i.getInforme();
    }
}

