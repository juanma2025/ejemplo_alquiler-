package com.alquiler.modelos;

import com.alquiler.interfaces.Rentable;
import com.alquiler.interfaces.Asegurable;
import com.alquiler.interfaces.EstrategiaPrecio;

public abstract class Vehiculo implements Rentable, Asegurable {
    protected String placa;
    protected String marca;
    protected String modelo;
    protected double km;
    protected EstrategiaPrecio estrategiaPrecio;

    public Vehiculo(String placa, String marca, String modelo, double km) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
    }

    public void setEstrategiaPrecio(EstrategiaPrecio estrategiaPrecio) {
        this.estrategiaPrecio = estrategiaPrecio;
    }

    public abstract double costoBaseDia();

    @Override
    public double calcularCosto(int dias) {
        return estrategiaPrecio.calcular(costoBaseDia(), dias);
    }

    @Override
    public double calcularSeguro() {
        return 0.1 * costoBaseDia();
    }

    @Override
    public String toString() {
        return String.format("%s %s (%s) - km: %.2f", marca, modelo, placa, km);
    }
}