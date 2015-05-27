package proyectobd;
import java.util.Scanner;
import proyectobd.BDManagement.BDManagement;
/**
 *
 * @author santiago
 */
public class ProyectoBD {

    public static void insertar(BDManagement bdm){
        Scanner scan = new Scanner(System.in);
        String dni;
        String nombre;
        String apellido;
        System.out.println("Ingrese el dni del jugador");
        dni = scan.next();
        System.out.println("Ingrese el nombre del jugador");
        nombre = scan.next();
        System.out.println("Ingrese el apellido del jugador");
        apellido = scan.next();
        bdm.addUser(dni,nombre,apellido);
  }
  public static void eliminar(BDManagement bdm){
        Scanner scan = new Scanner(System.in);
        String dni;
        System.out.println("Ingrese el dni del jugador a eliminar");
        dni = scan.next();
        bdm.deleteUser(dni);
  }
  public static void verJuego(BDManagement bdm){
        Scanner scan = new Scanner(System.in);
        String dni;
        System.out.println("Ingrese el dni del usuario para ver sus juegos");
        dni = scan.next();
        bdm.showUserGame(dni);
  }




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
			case 1: insertar(bdm);
				break;
			case 2: eliminar(bdm);
				break;
			case 3: verJuego(bdm);
				break;
            case 4: System.out.println("GOOD BYE!");
				break;
		}
    
    }
    
}
