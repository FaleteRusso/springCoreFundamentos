package com.corenetworks.springCoreFundamentos;

import com.corenetworks.springCoreFundamentos.Informe.Director;
import com.corenetworks.springCoreFundamentos.Informe.Jefe;
import com.corenetworks.springCoreFundamentos.Informe.Secretario;
import com.corenetworks.springCoreFundamentos.modelo.Coche;
import com.corenetworks.springCoreFundamentos.modelo.SeguroCoche;
import com.corenetworks.springCoreFundamentos.modelo.TallerMecanico;
import com.corenetworks.springCoreFundamentos.modelo.TallerPintura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreFundamentosApplication implements CommandLineRunner {
	@Autowired
SeguroCoche sC1;
	@Autowired
	Director d1;
	@Autowired
	Jefe j1;
	@Autowired
	Secretario s1;
	public static void main(String[] args) {
		SpringApplication.run(SpringCoreFundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Istanciar un taller, un coche y un seguro coche.
		//TallerPintura tP = new TallerPintura();

		//Coche c1 = new Coche("2143JYS","Peugeot 206");

		//SeguroCoche sC1=new SeguroCoche(tP,"Mutua Madrileña");
		//sC1.setAseguradora("Mutua Madrileña");
		//System.out.println(sC1.toString());
		System.out.println(d1.getInforme());
		System.out.println(s1.getInforme());
		System.out.println(j1.getInforme());
	}
}
