package com.alquiler.modelos;

import com.alquiler.interfaces.Electrico;

public class CamionetaElectrica extends Camioneta implements Electrico {
    private int bateria = 100;

    public CamionetaElectrica(String placa, String marca, String modelo, double km) {
        super(placa, marca, modelo, km);
    }

    @Override
    public void recargarBateria() {
        bateria = 100;
        System.out.println("Camioneta eléctrica recargada al 100%.");
    }

    @Override
    public int nivelBateria() {
        return bateria;
    }

    @Override
    public double costoBaseDia() {
        return 90.0;
    }
}