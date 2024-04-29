public class Carta {
    
    private int numero;
    private String palo;
    
    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {

        int numero = this.getNumero();
        String salida = "";

        switch(numero){
            case 1:{
                if(this.getPalo().equalsIgnoreCase("Corazones")){
                    salida = "🂱";
                } else if(this.getPalo().equalsIgnoreCase("Picas")){
                    salida = "🂡";
                } else if(this.getPalo().equalsIgnoreCase("Treboles")){
                    salida = "🃑";
                } else if(this.getPalo().equalsIgnoreCase("Diamantes")){
                    salida = "🃁";
                } 
            }
            case 2:{
                if(this.getPalo().equalsIgnoreCase("Corazones")){
                    salida = "🂲";
                } else if(this.getPalo().equalsIgnoreCase("Picas")){
                    salida = "🂢";
                } else if(this.getPalo().equalsIgnoreCase("Treboles")){
                    salida = "🃒";
                } else if(this.getPalo().equalsIgnoreCase("Diamantes")){
                    salida = "🃂";
                } 
            }
            case 3:{
                if(this.getPalo().equalsIgnoreCase("Corazones")){
                    salida = "🂳";
                } else if(this.getPalo().equalsIgnoreCase("Picas")){
                    salida = "🂣";
                } else if(this.getPalo().equalsIgnoreCase("Treboles")){
                    salida = "🃓";
                } else if(this.getPalo().equalsIgnoreCase("Diamantes")){
                    salida = "🃃";
                } 
            }
            case 4:{
                if(this.getPalo().equalsIgnoreCase("Corazones")){
                    salida = "🂴";
                } else if(this.getPalo().equalsIgnoreCase("Picas")){
                    salida = "🂤";
                } else if(this.getPalo().equalsIgnoreCase("Treboles")){
                    salida = "🃔";
                } else if(this.getPalo().equalsIgnoreCase("Diamantes")){
                    salida = "🃄";
                } 
            }
            case 5:{
                if(this.getPalo().equalsIgnoreCase("Corazones")){
                    salida = "🂵";
                } else if(this.getPalo().equalsIgnoreCase("Picas")){
                    salida = "🂥";
                } else if(this.getPalo().equalsIgnoreCase("Treboles")){
                    salida = "🃕";
                } else if(this.getPalo().equalsIgnoreCase("Diamantes")){
                    salida = "🃅";
                } 
            }
            case 6:{
                if(this.getPalo().equalsIgnoreCase("Corazones")){
                    salida = "🂶";
                } else if(this.getPalo().equalsIgnoreCase("Picas")){
                    salida = "🂦";
                } else if(this.getPalo().equalsIgnoreCase("Treboles")){
                    salida = "🃖";
                } else if(this.getPalo().equalsIgnoreCase("Diamantes")){
                    salida = "🃆";
                } 
            }
            case 7:{
                if(this.getPalo().equalsIgnoreCase("Corazones")){
                    salida = "🂷";
                } else if(this.getPalo().equalsIgnoreCase("Picas")){
                    salida = "🂧";
                } else if(this.getPalo().equalsIgnoreCase("Treboles")){
                    salida = "🃗";
                } else if(this.getPalo().equalsIgnoreCase("Diamantes")){
                    salida = "🃇";
                } 
            }
            case 8:{
                if(this.getPalo().equalsIgnoreCase("Corazones")){
                    salida = "🂸";
                } else if(this.getPalo().equalsIgnoreCase("Picas")){
                    salida = "🂨";
                } else if(this.getPalo().equalsIgnoreCase("Treboles")){
                    salida = "🃘";
                } else if(this.getPalo().equalsIgnoreCase("Diamantes")){
                    salida = "🃈";
                } 
            }
            case 9:{
                if(this.getPalo().equalsIgnoreCase("Corazones")){
                    salida = "🂹";
                } else if(this.getPalo().equalsIgnoreCase("Picas")){
                    salida = "🂩";
                } else if(this.getPalo().equalsIgnoreCase("Treboles")){
                    salida = "🃙";
                } else if(this.getPalo().equalsIgnoreCase("Diamantes")){
                    salida = "🃉";
                } 
            }
            case 10:{
                if(this.getPalo().equalsIgnoreCase("Corazones")){
                    salida = "🂺";
                } else if(this.getPalo().equalsIgnoreCase("Picas")){
                    salida = "🂪";
                } else if(this.getPalo().equalsIgnoreCase("Treboles")){
                    salida = "🃚";
                } else if(this.getPalo().equalsIgnoreCase("Diamantes")){
                    salida = "🃊";
                } 
            }
            case 11:{
                if(this.getPalo().equalsIgnoreCase("Corazones")){
                    salida = "🂻";
                } else if(this.getPalo().equalsIgnoreCase("Picas")){
                    salida = "🂫";
                } else if(this.getPalo().equalsIgnoreCase("Treboles")){
                    salida = "🃛";
                } else if(this.getPalo().equalsIgnoreCase("Diamantes")){
                    salida = "🃋";
                } 
            }
            case 12:{
                if(this.getPalo().equalsIgnoreCase("Corazones")){
                    salida = "🂽";
                } else if(this.getPalo().equalsIgnoreCase("Picas")){
                    salida = "🂭";
                } else if(this.getPalo().equalsIgnoreCase("Treboles")){
                    salida = "🃝";
                } else if(this.getPalo().equalsIgnoreCase("Diamantes")){
                    salida = "🃍";
                }          
            }
            case 13:{
                if(this.getPalo().equalsIgnoreCase("Corazones")){
                    salida = "🂾";
                } else if(this.getPalo().equalsIgnoreCase("Picas")){
                    salida = "🂮";
                } else if(this.getPalo().equalsIgnoreCase("Treboles")){
                    salida = "🃞";
                } else if(this.getPalo().equalsIgnoreCase("Diamantes")){
                    salida = "🃎";
                }          
            }
        }

        return salida;
    }

    
}
