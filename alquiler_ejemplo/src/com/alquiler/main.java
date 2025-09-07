package com.alquiler;

import java.util.*;
import com.alquiler.modelos.*;
import com.alquiler.estrategias.*;
import com.alquiler.gestor.Alquiler;
import com.alquiler.interfaces.Electrico;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Auto("ABC123", "Toyota", "Corolla", 20000));
        vehiculos.add(new Moto("XYZ987", "Yamaha", "FZ", 12000));
        vehiculos.add(new Camioneta("JKL456", "Ford", "Ranger", 50000));
        vehiculos.add(new AutoElectrico("ELE111", "Tesla", "Model 3", 10000));
        vehiculos.add(new CamionetaElectrica("ELE222", "BYD", "Tang", 8000));

        System.out.println("=== VEHÍCULOS DISPONIBLES ===");
        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println((i + 1) + ". " + vehiculos.get(i));
        }

        System.out.print("Seleccione vehículo: ");
        int opcion = sc.nextInt();
        Vehiculo seleccionado = vehiculos.get(opcion - 1);

        System.out.print("Días de alquiler: ");
        int dias = sc.nextInt();

        System.out.println("Elija estrategia de precio:");
        System.out.println("1. Estándar");
        System.out.println("2. Fin de semana");
        System.out.println("3. Largo plazo");
        int tipo = sc.nextInt();

        switch (tipo) {
            case 1:
                seleccionado.setEstrategiaPrecio(new PrecioEstandar());
                break;
            case 2:
                seleccionado.setEstrategiaPrecio(new PrecioFinde());
                break;
            case 3:
                seleccionado.setEstrategiaPrecio(new PrecioLargoPlazo());
                break;
            default:
                seleccionado.setEstrategiaPrecio(new PrecioEstandar());
        }

        Alquiler alquiler = new Alquiler(seleccionado, dias);
        System.out.println(alquiler);

        if (seleccionado instanceof Electrico electrico) {
            System.out.println("Nivel batería inicial: " + electrico.nivelBateria() + "%");
            electrico.recargarBateria();
            System.out.println("Nivel batería tras recarga: " + electrico.nivelBateria() + "%");
        }

        sc.close();
    }
}