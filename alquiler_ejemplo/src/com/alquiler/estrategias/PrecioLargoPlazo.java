package com.alquiler.estrategias;

import com.alquiler.interfaces.EstrategiaPrecio;

public class PrecioLargoPlazo implements EstrategiaPrecio {
    @Override
    public double calcular(double costoBase, int dias) {
        if (dias > 10) {
            return (costoBase * dias) * 0.8; // 20% de descuento
        }
        return costoBase * dias;
    }
}
