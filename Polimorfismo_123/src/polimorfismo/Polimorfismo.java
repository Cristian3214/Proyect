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
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Jorge", "Rodrigues", "511", 5000,.04,300);
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Pepe", "Octaz", "231",1000,.06);
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Daiel", "Jaquez", "1234", 16.75, 40);
       System.out.printf("%s\n%s: $%,.2f\n\n",empleadoAsalariado,"Ingresos",empleadoAsalariado.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n",empleadoBaseMasComision,"Ingresos",empleadoBaseMasComision.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n",empleadoPorComision,"Ingresos",empleadoPorComision.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n",empleadoPorHoras,"Ingresos",empleadoPorHoras.ingresos());

        Empleado[] empleados = new Empleado[4];
        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoBaseMasComision;
        empleados[2] = empleadoPorComision;
        empleados[3] = empleadoPorHoras;
        
        for(Empleado empleadoActual:empleados){
            System.out.println(empleadoActual);
            if(empleadoActual instanceof EmpleadoBaseMasComision){
                EmpleadoBaseMasComision  empleado = (EmpleadoBaseMasComision)empleadoActual;
                empleado.establecerSalarioBase(1.10*empleado.obtenerSalarioBase());
                System.out.printf("El nuevo salario Base con 10%% de incremento es: $%,.2f\n",empleado.obtenerSalarioBase());
            }
                       System.out.printf("El empleado actual: $%,.2f\n\n",empleadoActual.ingresos());

                
            
        }
            for(int j=0;j<empleados.length;j++){
            System.out.printf("El empleado %d es un  %s\n",j,empleados[j].getClass().getName());
            }
        }
        /*
        //Por pagar
        System.out.println("$n%.,2fn2++");
                */
    }//main class


        