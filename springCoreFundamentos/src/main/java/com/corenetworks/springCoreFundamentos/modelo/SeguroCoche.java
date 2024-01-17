package com.corenetworks.springCoreFundamentos.modelo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component@Data
public class SeguroCoche {
    @Autowired
    @Qualifier("tm")
    private ITaller taller;//Acoplamiento
    private String aseguradora;


//metodo
    public String reparar(Coche c){
         return  taller.reparar(c);
     }
     public SeguroCoche() {
    }

    public SeguroCoche(ITaller taller, String aseguradora) {
        this.taller = taller;
        this.aseguradora = aseguradora;
    }

}
