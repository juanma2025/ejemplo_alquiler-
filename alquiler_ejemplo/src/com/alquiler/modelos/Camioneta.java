package com.alquiler.modelos;

public class Camioneta extends Vehiculo {
    public Camioneta(String placa, String marca, String modelo, double km) {
        super(placa, marca, modelo, km);
    }

    @Override
    public double costoBaseDia() {
        return 80.0;
    }
}