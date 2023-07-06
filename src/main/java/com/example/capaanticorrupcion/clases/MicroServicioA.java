package com.example.capaanticorrupcion.clases;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
@Data
public class MicroServicioA {


    private ArrayList<Double> temperaturas;
    public MicroServicioA() {
        temperaturas = new ArrayList<>();
    }
    public void agregarTemperaturas(double temperatura){
        temperaturas.add(temperatura);
    }

    public ArrayList<Double> obtenerTemperaturas(){
        return temperaturas;
    }
}
