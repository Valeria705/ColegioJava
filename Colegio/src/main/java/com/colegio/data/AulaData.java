
package com.colegio.data;

import com.colegio.models.Aula;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class AulaData {

    public ArrayList<Aula> ConsultarAulas() throws Exception {

        ArrayList<Aula> list = new ArrayList<Aula>();
                
        try {

            String myDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            
            String myUrl = "jdbc:sqlserver://localhost:1433;databaseName=Colegio;username=sa;password=12345";
            
            Class.forName(myDriver);
            
            Connection conn = DriverManager.getConnection(myUrl);

          
            String query = "SELECT * FROM Aula";
 
            Statement st = conn.createStatement();
  
            ResultSet rs = st.executeQuery(query);

           
            while (rs.next()) {
                Aula x = new Aula();
                
                x.setIdAula(rs.getString("Id_Aula"));
                x.setNomAula(rs.getString("Nom_Aula"));
              
                
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

    public boolean GuardarAula(Aula a) throws Exception  {
         try { 
            String myDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            
            String myUrl = "jdbc:sqlserver://localhost:1433;databaseName=Colegio;username=sa;password=12345";
            
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl);
            Statement st = conn.createStatement();
            
            String query ="INSERT INTO Aula(Id_Aula,Nom_Aula) VALUES ('"+a.getIdAula()+"', '"+a.getNomAula()+"')";
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

    public Aula ConsultarAula(String Id_Aula) throws Exception {
        
         Aula reg = null;
                
        try {

            String myDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            
            String myUrl = "jdbc:sqlserver://localhost:1433;databaseName=Colegio;username=sa;password=12345";
            
            Class.forName(myDriver);
            
            Connection conn = DriverManager.getConnection(myUrl);

          
            String query = "SELECT * FROM Aula WHERE Id_Aula='"+Id_Aula+"'";
 
            Statement st = conn.createStatement();
  
            ResultSet rs = st.executeQuery(query);

           
            if (rs.next()) {
                reg = new Aula();
                
                reg.setIdAula(rs.getString("Id_Aula"));
                reg.setNomAula(rs.getString("Nom_Aula"));
                
                
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

    public boolean ModificarAula(Aula curso) throws Exception {
         try { 
            String myDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            
            String myUrl = "jdbc:sqlserver://localhost:1433;databaseName=Colegio;username=sa;password=12345";
            
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl);
            Statement st = conn.createStatement();
            
            String query ="UPDATE  Aula SET Id_Aula ='"+curso.getIdAula()+"',"
                    
                    + "Nom_Aula='"+curso.getNomAula()+"'"
                    
                    + " WHERE Id_Aula = '"+curso.getIdAula()+"'";
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

    public boolean EliminarAula(String Id_Aula) throws Exception {
        try { 
            String myDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            
            String myUrl = "jdbc:sqlserver://localhost:1433;databaseName=Colegio;username=sa;password=12345";
            
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl);
            Statement st = conn.createStatement();
            
            String query ="DELETE FROM Aula WHERE Id_Aula = '"+Id_Aula+"'";
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
