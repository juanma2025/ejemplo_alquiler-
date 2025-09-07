package com.alquiler.gestor;

import com.alquiler.modelos.Vehiculo;

public class Alquiler {
    private Vehiculo vehiculo;
    private int dias;

    public Alquiler(Vehiculo vehiculo, int dias) {
        this.vehiculo = vehiculo;
        this.dias = dias;
    }

    public double calcularTotal() {
        return vehiculo.calcularCosto(dias) + vehiculo.calcularSeguro();
    }

    @Override
    public String toString() {
        return String.format("Alquiler de %s por %d días - Total: $%.2f",
                vehiculo, dias, calcularTotal());
    }
}
