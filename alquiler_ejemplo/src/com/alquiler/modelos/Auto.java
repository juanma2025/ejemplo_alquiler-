package com.alquiler.modelos;

public class Auto extends Vehiculo {
    public Auto(String placa, String marca, String modelo, double km) {
        super(placa, marca, modelo, km);
    }

    @Override
    public double costoBaseDia() {
        return 50.0;
    }
}
