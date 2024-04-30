import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal{

    private static HashMap<String, String> usuarios = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);
    private static Mazo mazo = new Mazo();
    public static void main(String[] args){

        usuarios = Usuario.cargarDatos();
        menuPrincipal();
    }

    public static void menuPrincipal(){
       
        try{
            int opcion;
            do{
                System.out.println("Bienvenido!");
                System.out.println("1. Iniciar sesion");
                System.out.println("2. Registrarse");
                System.out.println("3. Salir del juego");
                opcion = sc.nextInt();

                switch(opcion){
                    case 1:{
                        iniciarSesion();
                        break;
                    }
                    case 2:{
                        //registrarUsuario();
                        break;
                    }
                    case 3:{
                        Usuario.guardarDatos(usuarios);
                        System.out.println("Hasta la proxima!");
                        break;
                    }
                    default :{
                        System.out.println("La opcion introducida no es correcta");
                        System.out.println("Intentelo de nuevo");
                    }
                }
            }while(opcion != 3);
        }
        catch(InputMismatchException e){
            System.err.println("Error: la opcion introducida es incorrecta");
        }
    }

    public static void iniciarSesion(){
        
        try{
            String nickname;
            String password;
            do{
                System.out.print("Nombre de usuario: ");
                nickname = sc.nextLine();
                System.out.print("Contraseña: ");
                password = sc.nextLine();

                if(usuarios.containsKey(nickname)){
                    if(usuarios.get(nickname).equals(password)){
                        System.out.println("Inicio de sesion exitoso");
                        //menuJuego();
                    } else{
                        System.err.println("Error: la contraseña no se corresponde con el usuario");
                    }
                } else{
                    System.err.println("Error: el nombre de usuario no esta registrado");

                }
            }while(!Usuario.comprobarUsuario(nickname, password, usuarios));
        }
        catch(InputMismatchException e){
            System.err.println(e.getMessage());
        }
    }

    public static void volverMenuPrincipal(){

        try{
            int opcion;
            do{
                System.out.println("1. Volver a intentarlo");
                System.out.println("2. Volver al menu principal");
                opcion = sc.nextInt();

                switch(opcion){
                    case 1:{break;}  
                    case 2:{
                        menuPrincipal();
                        break;
                    }
                    default :{
                        System.err.println("Error: la opcion introducida es incorrecta");
                    }
                }
            }while(opcion != 1 && opcion != 2);
        }
        catch(InputMismatchException e){
            System.err.println("Error: la opcion introducida es incorrecta");
        }
    }
}
