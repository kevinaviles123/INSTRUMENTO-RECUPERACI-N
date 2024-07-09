package com.mycompany.sueldoempleados;
import java.util.HashMap;
import java.util.Map;

public class SueldoEmpleados {
    public static void main(String[] args) {
        HashMap<String, Double> empleados = new HashMap<>();


        String[] nombres = {"Juan", "María", "Pedro"};
        double[] sueldosActuales = {600000, 400000, 500000};

        for (int i = 0; i < nombres.length; i++) {
            String nombre = nombres[i];
            double sueldoActual = sueldosActuales[i];

            double incremento = sueldoActual >= 500000 ? sueldoActual * 0.08 : sueldoActual * 0.10;
            double nuevoSueldo = sueldoActual + incremento;

            empleados.put(nombre, nuevoSueldo);

            System.out.println("Nombre del empleado: " + nombre);
            System.out.println("Sueldo Actual: " + sueldoActual);
            System.out.println("Sueldo Nuevo: " + nuevoSueldo);
            System.out.println("Valor aumentado: " + incremento);
        }

        System.out.println("\nLista de empleados y sus nuevos sueldos:");
        for (Map.Entry<String, Double> entry : empleados.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", Nuevo Sueldo: " + entry.getValue());
        }
    }
}
