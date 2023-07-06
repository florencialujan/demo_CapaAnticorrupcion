package com.example.capaanticorrupcion.clases;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
@RequiredArgsConstructor
public class CapaAnticorrupcion {

    private MicroServicioA A;
    private MicroServicioB B;

    public CapaAnticorrupcion(MicroServicioA a, MicroServicioB b) {
        this.A = a;
        this.B = b;
    }


    public void procesarTemperaturas() {
        ArrayList<Double> tempFarenhit = A.obtenerTemperaturas();
        ArrayList<Double> tempCelcius = new ArrayList<>();

        for(double temp : tempFarenhit){
            double tempC = convertirACelcius(temp);
            tempCelcius.add(tempC);
        }
        B.mostrarTemperaturas(tempCelcius);
    }

    public double convertirACelcius(double temperatura){
        return (temperatura-32)*5/9;
    }
}
