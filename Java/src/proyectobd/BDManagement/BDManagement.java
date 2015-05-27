
package proyectobd.BDManagement;

/**
 *
 * @author Santiago
 */
import java.sql.*;


public class BDManagement{
      //Configuracion de la conexion a la base de datos
      private String driver = "org.gjt.mm.mysql.Driver";
      private String url = "jdbc:mysql://localhost/connect4BD";
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
  		System.out.println("Conexion exitosa");
  	}catch(Exception e){
  		System.out.println("No se pudo conectar a la base de datos");
  	}

  }
  /**
   * 
   * @param dniUs DNI del jugador al que se le quieren ver las partidas
   */
  public void showUserGame(String dniUs){
    try{
      ResultSet rs = st.executeQuery
      ("SELECT codigo_partida,fecha_hora_inicio,fecha_hora_fin,dni_jugador_1,dni_jugador_2 FROM Partida WHERE dni_jugador_1="+'"'+dniUs+'"'+" OR dni_jugador_2="+'"'+dniUs+'"');
     System.out.println("");
      while(rs.next()){
        System.out.println(rs.getString(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4)+" | "+rs.getString(5));
      }
    }catch(Exception e){
      System.out.println(e+"Error al realizar la consulta");

    }
  }
  /**
   * 
   * @param nombre nombre del jugador
   * @param apellido apellido del jugador
   * @param dniUs  es el DNI del jugador (debe ser unico)
   */ 
  public void addUser(String dniUs, String nombreUs,String apellidoUs){
      try{
        stm = ct.prepareStatement("INSERT INTO Usuario (dni,nombre,apellido) VALUES (?,?,?)");
        stm.setString(1,dniUs);
        stm.setString(2,nombreUs);
        stm.setString(3,apellidoUs);
        stm.executeUpdate();
        
      }catch(Exception e){
          System.out.println(e+"Error al ingresar usuario");         
      
      }
  }
  /**
   * 
   * @param dniUs DNI del usuario a eliminar
   */
  public void deleteUser(String dniUs){
      try{
        st.execute("delete from Usuario where dni="+'"'+dniUs+'"');
      }catch(Exception e){
          System.out.println(e+"Ocurrio un error al querer eliminar el usuario");
      }
  
  }
}