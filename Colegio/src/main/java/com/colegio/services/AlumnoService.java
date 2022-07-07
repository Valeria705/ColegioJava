/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.colegio.services;

import com.colegio.data.AlumnoData;
import com.colegio.models.Alumno;
import java.util.ArrayList;

/**
 *
 * @author valer
 */
public class AlumnoService {
    
    AlumnoData capaDatos = new AlumnoData();

    public ArrayList<Alumno> ConsultarAlumnos() throws Exception
    {
        return capaDatos.ConsultarAlumnos();
    }
    
   
    public boolean GuardarAlumno(Alumno a) throws Exception
    {
        return capaDatos.GuardarAlumno(a);
    }
    public Alumno ConsultarAlumno(String Id) throws Exception
    {
        return capaDatos.ConsultarAlumno(Id);
    }
 
    public boolean ModificarAlumno(Alumno alumno) throws Exception
    {
        return capaDatos.ModificarAlumno(alumno);
    }

    public boolean EliminarAlumno(String Id_Alumno) throws Exception
    {
        return capaDatos.EliminarAlumno(Id_Alumno);
    }

   


}
