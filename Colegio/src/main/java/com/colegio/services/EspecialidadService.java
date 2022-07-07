/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.colegio.services;

import com.colegio.data.EspecialidadData;
import com.colegio.models.Especialidad;
import java.util.ArrayList;


public class EspecialidadService {
    
    EspecialidadData capaDatos = new EspecialidadData();

    public ArrayList<Especialidad> ConsultarEspecialidades() throws Exception
    {
        return capaDatos.ConsultarEspecialidades();
    }
    
   
    public boolean GuardarEspecialidad(Especialidad a) throws Exception
    {
        return capaDatos.GuardarEspecialidad(a);
    }
    public Especialidad ConsultarEspecialidad(String Id) throws Exception
    {
        return capaDatos.ConsultarEspecialidad(Id);
    }
 
    public boolean ModificarEspecialidad(Especialidad curso) throws Exception
    {
        return capaDatos.ModificarEspecialidad(curso);
    }

    public boolean EliminarEspecialidad(String Id_Especialidad) throws Exception
    {
        return capaDatos.EliminarEspecialidad(Id_Especialidad);
    }

   


}
