/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.colegio.services;

import com.colegio.data.AulaData;
import com.colegio.models.Aula;
import java.util.ArrayList;


public class AulaService {
    
    AulaData capaDatos = new AulaData();

    public ArrayList<Aula> ConsultarAulas() throws Exception
    {
        return capaDatos.ConsultarAulas();
    }
    
   
    public boolean GuardarAula(Aula a) throws Exception
    {
        return capaDatos.GuardarAula(a);
    }
    public Aula ConsultarAula(String Id) throws Exception
    {
        return capaDatos.ConsultarAula(Id);
    }
 
    public boolean ModificarAula(Aula curso) throws Exception
    {
        return capaDatos.ModificarAula(curso);
    }

    public boolean EliminarAula(String Id_Aula) throws Exception
    {
        return capaDatos.EliminarAula(Id_Aula);
    }

   


}
