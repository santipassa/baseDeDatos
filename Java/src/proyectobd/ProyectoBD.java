package proyectobd;
import proyectobd.BDManagement.BDManagement;
/**
 *
 * @author santiago
 */
public class ProyectoBD {
    public static void main(String[] args) {
       BDManagement bdm = new BDManagement();
       bdm.addUser("Santiago","Passalacqua", "santipassa");
       bdm.addUser("Santiago","Passalacqua", "santipassa1");
    
    }
    
}
