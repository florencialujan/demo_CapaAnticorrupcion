package com.example.capaanticorrupcion;

import com.example.capaanticorrupcion.clases.CapaAnticorrupcion;
import com.example.capaanticorrupcion.clases.MicroServicioA;
import com.example.capaanticorrupcion.clases.MicroServicioB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CapaAnticorrupcionApplication {

    public static void main(String[] args) {
        SpringApplication.run(CapaAnticorrupcionApplication.class, args);
        MicroServicioA A= new MicroServicioA();
        MicroServicioB B= new MicroServicioB();

        A.agregarTemperaturas(68.0);
        A.agregarTemperaturas(75.0);
        A.agregarTemperaturas(82.3);

        CapaAnticorrupcion capaAntiCorrupcion = new CapaAnticorrupcion(A,B);
        capaAntiCorrupcion.procesarTemperaturas();

    }

}
