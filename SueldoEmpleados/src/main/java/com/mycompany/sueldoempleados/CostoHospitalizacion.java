package com.mycompany.sueldoempleados;
import java.util.HashMap;
import java.util.Map;

public class CostoHospitalizacion {
    public static void main(String[] args) {
        HashMap<String, Double> pacientes = new HashMap<>();
        int numPacientes = 0;

     
        String[] nombres = {"Ana", "Luis", "Carla"};
        double[] costosTratamiento = {200000, 300000, 150000};
        int[] diasHospitalizacion = {2, 3, 1};
        double[] costosMedicamentos = {50000, 100000, 20000};

        for (int i = 0; i < nombres.length; i++) {
            String nombre = nombres[i];
            double costoTratamiento = costosTratamiento[i];
            int dias = diasHospitalizacion[i];
            double costoMedicamentos = costosMedicamentos[i];

            if (costoTratamiento < 0 || dias < 0 || costoMedicamentos < 0) {
                System.out.println("Los valores no pueden ser negativos. Datos ignorados para el paciente: " + nombre);
                continue;
            }

            double costoHospitalizacion = dias * 100000;
            double costoTotal = costoTratamiento + costoHospitalizacion + costoMedicamentos;

            pacientes.put(nombre, costoTotal);
            numPacientes++;
        }

        System.out.println("\nCantidad de pacientes procesados: " + numPacientes);
        System.out.println("Lista de pacientes y sus costos de tratamiento:");
        for (Map.Entry<String, Double> entry : pacientes.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", Costo Total: " + entry.getValue());
        }
    }
}



