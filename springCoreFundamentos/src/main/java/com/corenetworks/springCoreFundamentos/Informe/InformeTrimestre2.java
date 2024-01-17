package com.corenetworks.springCoreFundamentos.Informe;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class InformeTrimestre2 implements IInforme {
    @Override
    public String getInforme() {
        return "Informe segundo trimestre";
    }
}
