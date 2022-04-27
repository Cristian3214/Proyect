/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datos;

/**
 *
 * @author Cristian
 */
public class NewClass {
    String nombre;
    String carrera;
    int semestre;

    public NewClass(String nombre, String carrera, int semestre) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    public void imprimir(){
        System.out.println("Los datos del alumno son: /n");
        System.out.println("Nombre: "+nombre);
        System.out.println("Semestre: "+semestre);
        System.out.println("Carrera: "+carrera);
                
                
                
                
    }
    
}
