/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd.BDManagement;

/**
 *
 * @author santiago
 */
import java.sql.*;


public class BDManagement{
      //Configuracion de la conexion a la base de datos
      private String driver = "org.gjt.mm.mysql.Driver";
      private String url = "jdbc:mysql://localhost/proyectoBD";
      private String username = "root";
      private String password = "Control123";
      private Connection ct;
      private Statement st;
      private PreparedStatement stm;


  public BDManagement(){
  	try{
  		Class.forName(driver);
  		ct = DriverManager.getConnection(url,username,password);
                st = ct.createStatement();
  		System.out.println("conexion exitosa");
  	}catch(Exception e){
  		System.out.println("No se pudo conectar a la base de datos");
  	}

  }
  /**
   * 
   * @param username nombre de usuario al que se le quieren ver las partidas
   */
  public void showUserGame(String username){
    try{
      ResultSet rs = st.executeQuery("SELECT * FROM partida where username1="+'"'+username+'"');
      while(rs.next()){
        System.out.println(rs.getString(1)+" | "+rs.getString(2)+" | "+rs.getString(3));
      }
    }catch(Exception e){
      System.out.println("Error al realizar la consulta");

    }
  }
  /**
   * 
   * @param nombre nombre del jugador
   * @param apellido apellido del jugador
   * @param username nombre de usuario (debe ser unico)
   */ 
  public void addUser(String nombre, String apellido,String username){
      try{
        stm = ct.prepareStatement("INSERT INTO users VALUES(?,?,?)");
        stm.setString(1,username);
        stm.setString(2,nombre);
        stm.setString(3,apellido);
        stm.executeUpdate();
        
      }catch(Exception e){
          System.out.println(e+"Error al ingresar usuario");         
      
      }
  }
  /**
   * 
   * @param username nombre de usuario a eliminar
   */
  public void deleteUser(String username){
      try{
        st.execute("delete from users where username="+'"'+username+'"');
      }catch(Exception e){
          System.out.println(e);
      }
  
  }
}