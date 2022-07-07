/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.colegio.services;

import com.colegio.data.CursoData;
import com.colegio.models.Curso;
import java.util.ArrayList;


public class CursoService {
    
    CursoData capaDatos = new CursoData();

    public ArrayList<Curso> ConsultarCursos() throws Exception
    {
        return capaDatos.ConsultarCursos();
    }
    
   
    public boolean GuardarCurso(Curso a) throws Exception
    {
        return capaDatos.GuardarCurso(a);
    }
    public Curso ConsultarCurso(String Id) throws Exception
    {
        return capaDatos.ConsultarCurso(Id);
    }
 
    public boolean ModificarCurso(Curso curso) throws Exception
    {
        return capaDatos.ModificarCurso(curso);
    }

    public boolean EliminarCurso(String Id_Curso) throws Exception
    {
        return capaDatos.EliminarCurso(Id_Curso);
    }

   


}
