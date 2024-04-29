import java.util.HashMap;

public class Principal{

    private static HashMap<String, String> usuarios = new HashMap<>();
    public static void main(String[] args){

        usuarios = Usuario.cargarDatos();
        menu();
        Mazo mazo = new Mazo();
        mazo.generarMazo();
        System.out.println(mazo.toString());
        System.out.println(mazo.getMazo().size());
    }

    public static void menu(){

    }
}
