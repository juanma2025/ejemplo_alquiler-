package com.alquiler.estrategias;

import com.alquiler.interfaces.EstrategiaPrecio;

public class PrecioFinde implements EstrategiaPrecio {
    @Override
    public double calcular(double costoBase, int dias) {
        return (costoBase * dias) * 1.2; // 20% más caro en finde
    }
}