package com.corenetworks.springCoreFundamentos.Informe;

import org.springframework.stereotype.Component;

@Component
public class InformeTrimestre1 implements IInforme {
    @Override
    public String getInforme() {
        return "Informe del primer trimestre";
    }
}
