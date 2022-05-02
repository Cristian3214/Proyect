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
        System.out.printf("$s\n%s: $%,.2f\n\n", empleadoPorComision, "Ingresos", empleadoPorComision.ingresos());
                System.out.printf("$s\n%s: $%,.2f\n\n", empleadoPorHoras, "Ingresos", empleadoPorHoras.ingresos());

        Empleado[] empleado = new Empleado[4];
        empleado[0] = empleadoAsalariado;
        empleado[1] = empleadoBaseMasComision;
        empleado[2] = empleadoPorComision;
        empleado[3] = empleadoPorHoras;
        
        for(Empleado empleadoActual:empleado){
            System.out.println(empleado);
            if (empleadoActual instanceof EmpleadoBaseMasComision){
            EmpleadoBaseMasComision empleados=(EmpleadoBaseMasComision) empleadoActual;
            empleados.establecerSalarioBase(1.10*empleados.obtenerSalarioBase());
                System.out.printf("El nuevo salario base es con el 10% de incremento: $%,.2f\n\n",empleadoBaseMasComision());
                
                
            
        }
            System.out.printf("El empleado actual: $%,.2f\n\n",empleadoActual.ingresos());
            for(int j=0;j<empleado.length;j++){
                System.out.println("El empleado es un  %$\n",j,empleado(j).getClass().getName());
            }
        }
    }
}
