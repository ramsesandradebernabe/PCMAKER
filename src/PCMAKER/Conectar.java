package PCMAKER;
import java.sql.*;
import javax.swing.*;

public class Conectar {
    Connection conect = null;
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
            //conect = DriverManager.getConnection("jdbc:mysql://192.168.43.33:3306/project","remoto1","123");
            //JOptionPane.showMessageDialog(null,"Conexion Exitosa","Proceso Completado. . !",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error de MySQL","Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        } catch(ClassNotFoundException e){
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        return conect;
    }
}