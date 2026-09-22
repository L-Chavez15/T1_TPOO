/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1_poo;

import java.util.ArrayList;

/**
 *
 * @author leoch
 */
public class AlumnoCollector 
{
    ArrayList<Alumno> lista_alumno= new ArrayList<>();
    void agregar_Alumno(Alumno nuevaAlumno)
    {
        System.out.println("SE AGREGO PERSONA");
        lista_alumno.add(nuevaAlumno);
    }
    
    void lista_Alumno()
    {
        System.out.println("*******ALUMNOS REGISTRADOS*******");
        Alumno  actual;
        for (int i = 0; i < lista_alumno.size(); i++) {
            actual=lista_alumno.get(i);
            actual.VerDato();
        }
    }
}
