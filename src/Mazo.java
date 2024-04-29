import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
    
    private ArrayList<Carta> mazo;

    public Mazo() {
        this.mazo = new ArrayList<>();
    }

    public void generarMazo(){

        for(int i = 0; i < 13; i++){
            this.mazo.add(new Carta(i+1,"Corazones"));
            this.mazo.add(new Carta(i+1,"Picas"));
            this.mazo.add(new Carta(i+1,"Treboles"));
            this.mazo.add(new Carta(i+1,"Diamantes"));
        }

        Collections.shuffle(mazo);
    }

    @Override
    public String toString() {
        return "Mazo [mazo=" + mazo + "]";
    }

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    
}
