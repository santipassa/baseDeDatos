package proyectobd;
import proyectobd.BDManagement.BDManagement;
/**
 *
 * @author santiago
 */
public class ProyectoBD {
    public static void main(String[] args) {
       BDManagement bdm = new BDManagement();
       Integer opcion=-1;
       Scanner entrada;
            System.out.println("================================");
            System.out.println("MENU PRINCIPAL");
            System.out.println("1---->Insertar jugador");
            System.out.println("2---->Eliminar jugador");
            System.out.println("3---->Ver partida de jugador");
            System.out.println("4---->Salir");
            System.out.println("================================");
        while(opcion!=1 && opcion!=2 && opcion!=3 && opcion!=4 && opcion!=5  ){
           entrada = new Scanner(System.in);
           opcion = entrada.nextInt();
           
        }
        switch (opcion) {
			case 1: jugar();
				break;
			case 2: verRanking();
				break;
			case 3: registrarUsuario();
				break;
            case 4: System.out.println("GOOD BYE!");
				break;
		}
    
    }
    
}
