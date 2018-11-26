
package CodeHelpers;

/**
 *
 * @author oscar
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexionesDB {
    String conexion="jdbc:mariadb://localhost:3306/Restaurant";
    String userdb="root";
    String passdb="sasa";
    Connection conn;
    PreparedStatement sentencia;
    public String probarConexion(){
        String estado="";
    try {
            conn = DriverManager.getConnection(conexion, userdb, passdb);
            if (conn != null) {
                conn.close();
                estado="Conectado a la base de datos";
            }   
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al conectar a la base de datos, la informacion siguiente puede ayudar a diagnosticar el problema:\n"+ ex);
            estado="No ha sido posible establecer conexión con la base de datos";
        }
        return estado;
    }
    
    
    public String registrar(String SQL)
    {
        String estado="";
        try {
            conn = DriverManager.getConnection(conexion, userdb, passdb);
            if (conn != null) {
                sentencia = conn.prepareStatement(SQL);
                sentencia.execute();  
                conn.close();
                estado="El registro se ha realizado satisfactoriamente";              
            }   
         } catch (SQLException ex) {
                estado="No se ha posido realizar el registro el error ha sido el siguiente:\n"+ex;
        }   
                return estado;
    
    }
    
     public ResultSet consulta(String SQL)
    {
        ResultSet resultado=null;
        try {
            conn = DriverManager.getConnection(conexion, userdb, passdb);
             Statement sentencia = conn.createStatement();
             resultado =sentencia.executeQuery(SQL);
             conn.close();
                    
        } 
        catch (SQLException ex) 
        {
              JOptionPane.showMessageDialog(null, "No se pudo realizar la consulta con la base de datos:\n"+ex);
        }
        
        return resultado;
}
     
     public String eliminar(String SQL)
    {
        String estado="";
        try {
            conn = DriverManager.getConnection(conexion, userdb, passdb);
            if (conn != null) {
                sentencia = conn.prepareStatement(SQL);
                sentencia.execute();  
                conn.close();
                estado="La eliminacion se ha realizado exitosamente";              
            }   
         } catch (SQLException ex) {
                estado="No se ha posido realizar la eliminación el error ha sido el siguiente:\n"+ex;
        }   
                return estado;
    
    }
    
}
