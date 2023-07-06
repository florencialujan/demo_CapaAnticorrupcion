package com.example.capaanticorrupcion.clases;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class MicroServicioB {

    public void mostrarTemperaturas(ArrayList<Double> temperaturas){
        for(double temperatura : temperaturas){
            System.out.println("Temperatura en Celcius: "+ temperatura);
        }
    }

}
