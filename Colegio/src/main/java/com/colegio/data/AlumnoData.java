
package com.colegio.data;

import com.colegio.models.Alumno;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class AlumnoData {

    public ArrayList<Alumno> ConsultarAlumnos() throws Exception {

        ArrayList<Alumno> list = new ArrayList<Alumno>();
                
        try {

            String myDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            
            String myUrl = "jdbc:sqlserver://localhost:1433;databaseName=Colegio;username=sa;password=12345";
            
            Class.forName(myDriver);
            
            Connection conn = DriverManager.getConnection(myUrl);

          
            String query = "SELECT * FROM Alumno";
 
            Statement st = conn.createStatement();
  
            ResultSet rs = st.executeQuery(query);

           
            while (rs.next()) {
                Alumno x = new Alumno();
                
                x.setId(rs.getString("Id_Alumno"));
                x.setDireccion(rs.getString("Dir_Alumno"));
                x.setGrupo(rs.getString("Grp_Alumno"));
                x.setNombre(rs.getString("Nom_Alumno"));
                x.setTelefono(rs.getString("Tel_Alumno"));
                
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

    public boolean GuardarAlumno(Alumno a) throws Exception  {
         try { 
            String myDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            
            String myUrl = "jdbc:sqlserver://localhost:1433;databaseName=Colegio;username=sa;password=12345";
            
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl);
            Statement st = conn.createStatement();
            
            String query ="INSERT INTO Alumno(Id_Alumno,Dir_Alumno,Grp_Alumno,Nom_Alumno,Tel_Alumno) VALUES ('"+a.getId()+"', '"+a.getDireccion()+"', '"+a.getGrupo()+"', '"+a.getNombre()+"', '"+a.getTelefono()+"')";
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

    public Alumno ConsultarAlumno(String Id_Alumno) throws Exception {
        
         Alumno reg = null;
                
        try {

            String myDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            
            String myUrl = "jdbc:sqlserver://localhost:1433;databaseName=Colegio;username=sa;password=12345";
            
            Class.forName(myDriver);
            
            Connection conn = DriverManager.getConnection(myUrl);

          
            String query = "SELECT * FROM Alumno WHERE Id_Alumno='"+Id_Alumno+"'";
 
            Statement st = conn.createStatement();
  
            ResultSet rs = st.executeQuery(query);

           
            if (rs.next()) {
                reg = new Alumno();
                
                reg.setId(rs.getString("Id_Alumno"));
                reg.setDireccion(rs.getString("Dir_Alumno"));
                reg.setGrupo(rs.getString("Grp_Alumno"));
                reg.setNombre(rs.getString("Nom_Alumno"));
                reg.setTelefono(rs.getString("Tel_Alumno"));
                
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

    public boolean ModificarAlumno(Alumno alumno) throws Exception {
         try { 
            String myDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            
            String myUrl = "jdbc:sqlserver://localhost:1433;databaseName=Colegio;username=sa;password=12345";
            
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl);
            Statement st = conn.createStatement();
            
            String query ="UPDATE  Alumno SET Dir_Alumno='"+alumno.getDireccion()+"',"
                    + "Grp_Alumno='"+alumno.getGrupo()+"',"
                    + "Nom_Alumno='"+alumno.getNombre()+"',"
                    + "Tel_Alumno='"+alumno.getTelefono()+"'"
                    + " WHERE Id_Alumno = '"+alumno.getId()+"'";
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

    public boolean EliminarAlumno(String Id_Alumno) throws Exception {
        try { 
            String myDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            
            String myUrl = "jdbc:sqlserver://localhost:1433;databaseName=Colegio;username=sa;password=12345";
            
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl);
            Statement st = conn.createStatement();
            
            String query ="DELETE FROM Alumno WHERE Id_Alumno = '"+Id_Alumno+"'";
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
