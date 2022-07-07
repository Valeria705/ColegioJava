
package com.colegio.data;

import com.colegio.models.Especialidad;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class EspecialidadData {

    public ArrayList<Especialidad> ConsultarEspecialidades() throws Exception {

        ArrayList<Especialidad> list = new ArrayList<Especialidad>();
                
        try {

            String myDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            
            String myUrl = "jdbc:sqlserver://localhost:1433;databaseName=Colegio;username=sa;password=12345";
            
            Class.forName(myDriver);
            
            Connection conn = DriverManager.getConnection(myUrl);

          
            String query = "SELECT * FROM Especialidad";
 
            Statement st = conn.createStatement();
  
            ResultSet rs = st.executeQuery(query);

           
            while (rs.next()) {
                Especialidad x = new Especialidad();
                
                x.setIdEspecialidad(rs.getString("Id_Especialidad"));
                x.setNomEspecialidad(rs.getString("Nom_Especialidad"));
              
                
                list.add(x);
            }
            
            rs.close();
            st.close();
            conn.close();
            
        } catch (Exception e) {
            System.err.println("ERROR!!! ");
            System.err.println(e.toString());
            throw e;
        }

        return list;
    }

    public boolean GuardarEspecialidad(Especialidad a) throws Exception  {
         try { 
            String myDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            
            String myUrl = "jdbc:sqlserver://localhost:1433;databaseName=Colegio;username=sa;password=12345";
            
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl);
            Statement st = conn.createStatement();
            
            String query ="INSERT INTO Especialidad(Id_Especialidad,Nom_Especialidad) VALUES ('"+a.getIdEspecialidad()+"', '"+a.getNomEspecialidad()+"')";
            System.out.println(query );
            st.executeUpdate(query); 

            st.close();
            conn.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
            throw e;
        } 
         
         return true;
    }

    public Especialidad ConsultarEspecialidad(String Id_Especialidad) throws Exception {
        
         Especialidad reg = null;
                
        try {

            String myDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            
            String myUrl = "jdbc:sqlserver://localhost:1433;databaseName=Colegio;username=sa;password=12345";
            
            Class.forName(myDriver);
            
            Connection conn = DriverManager.getConnection(myUrl);

          
            String query = "SELECT * FROM Especialidad WHERE Id_Especialidad='"+Id_Especialidad+"'";
 
            Statement st = conn.createStatement();
  
            ResultSet rs = st.executeQuery(query);

           
            if (rs.next()) {
                reg = new Especialidad();
                
                reg.setIdEspecialidad(rs.getString("Id_Especialidad"));
                reg.setNomEspecialidad(rs.getString("Nom_Especialidad"));
                
                
            }
            
            rs.close();
            st.close();
            conn.close();
            
        } catch (Exception e) {
            System.err.println("ERROR!!! ");
            System.err.println(e.toString());
            throw e;
        }

        return reg;
       
    }

    public boolean ModificarEspecialidad(Especialidad curso) throws Exception {
         try { 
            String myDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            
            String myUrl = "jdbc:sqlserver://localhost:1433;databaseName=Colegio;username=sa;password=12345";
            
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl);
            Statement st = conn.createStatement();
            
            String query ="UPDATE  Especialidad SET Id_Especialidad ='"+curso.getIdEspecialidad()+"',"
                    
                    + "Nom_Especialidad='"+curso.getNomEspecialidad()+"'"
                    
                    + " WHERE Id_Especialidad = '"+curso.getIdEspecialidad()+"'";
            System.out.println(query );
            st.executeUpdate(query); 

            st.close();
            conn.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e); 
            throw e;
        } 
         
         return true;
    }

    public boolean EliminarEspecialidad(String Id_Especialidad) throws Exception {
        try { 
            String myDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            
            String myUrl = "jdbc:sqlserver://localhost:1433;databaseName=Colegio;username=sa;password=12345";
            
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl);
            Statement st = conn.createStatement();
            
            String query ="DELETE FROM Especialidad WHERE Id_Especialidad = '"+Id_Especialidad+"'";
            System.out.println(query );
            st.executeUpdate(query); 

            st.close();
            conn.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
            throw e;
        } 
         
         return true;
    }

    

}
