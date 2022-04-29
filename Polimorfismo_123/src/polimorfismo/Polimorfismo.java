/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import POL.*;

/**
 *
 * @author Juana García
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Daira", "Rodrigues", "111", 800.00);
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Jorge", "Rodrigues", "511", 800.00, .95, 400);
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Pepe", "Octaz", "231", 800, 600.00);
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Daiel", "Jaquez", "1234", 16.75, 40);
        System.out.println("Empleados por separado;");
        System.out.printf("$s\n%s: $%,.2f\n\n", empleadoAsalariado, "Ingersos ", empleadoAsalariado.ingresos());
        System.out.printf("$s\n%s: $%,.2f\n\n", empleadoBaseMasComision, "Ingresos", empleadoBaseMasComision.ingresos());
        System.out.printf("$s\n%s: $%,.2f\n\n", empleadoBaseMasComision, "Ingresos", empleadoBaseMasComision.ingresos());
        Empleado[] empleado = new Empleado[4];
        empleado[0] = empleadoAsalariado;
    }
}
