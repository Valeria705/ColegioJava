/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.colegio.services;

import com.colegio.data.DocenteData;
import com.colegio.models.Docente;
import java.util.ArrayList;

/**
 *
 * @author valer
 */
public class DocenteService {
    
    DocenteData capaDatos = new DocenteData();

    public ArrayList<Docente> ConsultarDocentes() throws Exception
    {
        return capaDatos.ConsultarDocentes();
    }
    
   
    public boolean GuardarDocente(Docente a) throws Exception
    {
        return capaDatos.GuardarDocente(a);
    }
    public Docente ConsultarDocente(String Id) throws Exception
    {
        return capaDatos.ConsultarDocente(Id);
    }
 
    public boolean ModificarDocente(Docente alumno) throws Exception
    {
        return capaDatos.ModificarDocente(alumno);
    }

    public boolean EliminarDocente(String Id_Docente) throws Exception
    {
        return capaDatos.EliminarDocente(Id_Docente);
    }

   


}
