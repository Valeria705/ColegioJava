/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.colegio.services;

import com.colegio.data.OficinaData;
import com.colegio.models.Oficina;
import java.util.ArrayList;

/**
 *
 * @author valer
 */
public class OficinaService {
    
    OficinaData capaDatos = new OficinaData();

    public ArrayList<Oficina> ConsultarOficinas() throws Exception
    {
        return capaDatos.ConsultarOficinas();
    }
    
   
    public boolean GuardarOficina(Oficina a) throws Exception
    {
        return capaDatos.GuardarOficina(a);
    }
    public Oficina ConsultarOficina(String Id) throws Exception
    {
        return capaDatos.ConsultarOficina(Id);
    }
 
    public boolean ModificarOficina(Oficina alumno) throws Exception
    {
        return capaDatos.ModificarOficina(alumno);
    }

    public boolean EliminarOficina(String Id_Oficina) throws Exception
    {
        return capaDatos.EliminarOficina(Id_Oficina);
    }

   


}
