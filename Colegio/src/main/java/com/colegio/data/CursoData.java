
package com.colegio.data;

import com.colegio.models.Curso;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class CursoData {

    public ArrayList<Curso> ConsultarCursos() throws Exception {

        ArrayList<Curso> list = new ArrayList<Curso>();
                
        try {

            String myDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            
            String myUrl = "jdbc:sqlserver://localhost:1433;databaseName=Colegio;username=sa;password=12345";
            
            Class.forName(myDriver);
            
            Connection conn = DriverManager.getConnection(myUrl);

          
            String query = "SELECT * FROM Curso";
 
            Statement st = conn.createStatement();
  
            ResultSet rs = st.executeQuery(query);

           
            while (rs.next()) {
                Curso x = new Curso();
                
                x.setIdCurso(rs.getString("Id_Curso"));
                x.setNomCurso(rs.getString("Nom_Curso"));
              
                
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

    public boolean GuardarCurso(Curso a) throws Exception  {
         try { 
            String myDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            
            String myUrl = "jdbc:sqlserver://localhost:1433;databaseName=Colegio;username=sa;password=12345";
            
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl);
            Statement st = conn.createStatement();
            
            String query ="INSERT INTO Curso(Id_Curso,Nom_Curso) VALUES ('"+a.getIdCurso()+"', '"+a.getNomCurso()+"')";
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

    public Curso ConsultarCurso(String Id_Curso) throws Exception {
        
         Curso reg = null;
                
        try {

            String myDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            
            String myUrl = "jdbc:sqlserver://localhost:1433;databaseName=Colegio;username=sa;password=12345";
            
            Class.forName(myDriver);
            
            Connection conn = DriverManager.getConnection(myUrl);

          
            String query = "SELECT * FROM Curso WHERE Id_Curso='"+Id_Curso+"'";
 
            Statement st = conn.createStatement();
  
            ResultSet rs = st.executeQuery(query);

           
            if (rs.next()) {
                reg = new Curso();
                
                reg.setIdCurso(rs.getString("Id_Curso"));
                reg.setNomCurso(rs.getString("Nom_Curso"));
                
                
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

    public boolean ModificarCurso(Curso curso) throws Exception {
         try { 
            String myDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            
            String myUrl = "jdbc:sqlserver://localhost:1433;databaseName=Colegio;username=sa;password=12345";
            
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl);
            Statement st = conn.createStatement();
            
            String query ="UPDATE  Curso SET Id_Curso ='"+curso.getIdCurso()+"',"
                    
                    + "Nom_Curso='"+curso.getNomCurso()+"'"
                    
                    + " WHERE Id_Curso = '"+curso.getIdCurso()+"'";
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

    public boolean EliminarCurso(String Id_Curso) throws Exception {
        try { 
            String myDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            
            String myUrl = "jdbc:sqlserver://localhost:1433;databaseName=Colegio;username=sa;password=12345";
            
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl);
            Statement st = conn.createStatement();
            
            String query ="DELETE FROM Curso WHERE Id_Curso = '"+Id_Curso+"'";
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
