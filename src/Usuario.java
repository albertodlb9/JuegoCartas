
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.util.HashMap;
import java.io.IOException;
import java.io.File;

public class Usuario {
    
    private String nickname;
    private String password;
    private static final String FILE = "datos/datos.dat";
   
    public Usuario(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public static void guardarDatos(HashMap <String,String> lista){
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE))){
            out.writeObject(lista);
        }
        catch(IOException e){
            System.err.println("Error: el archivo no se ha encontrado.");
        }
    }

    public static HashMap<String,String> cargarDatos(){
        
        File file = new File(FILE);
        HashMap<String,String> lista = new HashMap<>();

        if(file.exists()){
            try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE))){     
                lista = (HashMap<String,String>) in.readObject();
            }
            catch(IOException e){
                System.err.println("Error: el archivo no se ha encontrado.");
            }
            catch(ClassNotFoundException e){
                System.err.println("Error " + e.getMessage());
            }
        }
        return lista;
    }

    public static boolean comprobarUsuario(String nickname, String password, HashMap<String,String> mapa){

        boolean comprobacion = false;
        if(mapa.containsKey(nickname)){
            if(mapa.get(nickname).equals(password)){
                comprobacion = true;
            } 
        }
        
        return comprobacion;
    }
}
