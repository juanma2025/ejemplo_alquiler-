package com.alquiler.modelos;

public class Moto extends Vehiculo {
    public Moto(String placa, String marca, String modelo, double km) {
        super(placa, marca, modelo, km);
    }

    @Override
    public double costoBaseDia() {
        return 30.0;
    }
}