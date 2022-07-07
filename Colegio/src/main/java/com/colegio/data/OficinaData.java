
package com.colegio.data;

import com.colegio.models.Oficina;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class OficinaData {

    public ArrayList<Oficina> ConsultarOficinas() throws Exception {

        ArrayList<Oficina> list = new ArrayList<Oficina>();
                
        try {

            String myDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            
            String myUrl = "jdbc:sqlserver://localhost:1433;databaseName=Colegio;username=sa;password=12345";
            
            Class.forName(myDriver);
            
            Connection conn = DriverManager.getConnection(myUrl);

          
            String query = "SELECT * FROM Oficina";
 
            Statement st = conn.createStatement();
  
            ResultSet rs = st.executeQuery(query);

           
            while (rs.next()) {
                Oficina x = new Oficina();
                
                x.setId(rs.getString("Id_Oficina"));
                x.setNombre(rs.getString("Nom_Oficina"));
                x.setTelefono(rs.getString("Tel_Oficina"));
                
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

    public boolean GuardarOficina(Oficina a) throws Exception  {
         try { 
            String myDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            
            String myUrl = "jdbc:sqlserver://localhost:1433;databaseName=Colegio;username=sa;password=12345";
            
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl);
            Statement st = conn.createStatement();
            
            String query ="INSERT INTO Oficina(Id_Oficina,Nom_Oficina,Tel_Oficina) VALUES ('"+a.getId()+"', '"+a.getNombre()+"', '"+a.getTelefono()+"')";
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

    public Oficina ConsultarOficina(String Id_Oficina) throws Exception {
        
         Oficina reg = null;
                
        try {

            String myDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            
            String myUrl = "jdbc:sqlserver://localhost:1433;databaseName=Colegio;username=sa;password=12345";
            
            Class.forName(myDriver);
            
            Connection conn = DriverManager.getConnection(myUrl);

          
            String query = "SELECT * FROM Oficina WHERE Id_Oficina='"+Id_Oficina+"'";
 
            Statement st = conn.createStatement();
  
            ResultSet rs = st.executeQuery(query);

           
            if (rs.next()) {
                reg = new Oficina();
                
                reg.setId(rs.getString("Id_Oficina"));
                reg.setNombre(rs.getString("Nom_Oficina"));
                reg.setTelefono(rs.getString("Tel_Oficina"));
                
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

    public boolean ModificarOficina(Oficina alumno) throws Exception {
         try { 
            String myDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            
            String myUrl = "jdbc:sqlserver://localhost:1433;databaseName=Colegio;username=sa;password=12345";
            
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl);
            Statement st = conn.createStatement();
            
            String query ="UPDATE  Oficina SET "
                    + "Nom_Oficina='"+alumno.getNombre()+"',"
                    + "Tel_Oficina='"+alumno.getTelefono()+"'"
                    + " WHERE Id_Oficina = '"+alumno.getId()+"'";
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

    public boolean EliminarOficina(String Id_Oficina) throws Exception {
        try { 
            String myDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            
            String myUrl = "jdbc:sqlserver://localhost:1433;databaseName=Colegio;username=sa;password=12345";
            
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl);
            Statement st = conn.createStatement();
            
            String query ="DELETE FROM Oficina WHERE Id_Oficina = '"+Id_Oficina+"'";
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
