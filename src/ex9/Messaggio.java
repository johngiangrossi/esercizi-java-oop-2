/*
 Crea una classe `Messaggio` con un campo `testo`, e una classe `Formatter` con metodo:
 `Messaggio formatta(Messaggio msg)`
 Il metodo modifica il testo (ad es. rendendolo tutto maiuscolo) e restituisce un nuovo
 `Messaggio`.
 Questo esercizio combina passaggio di oggetti e ritorno di oggetti custom
*/

package ex9;

public class Messaggio {

    // fields
    private String testo;

    // costruttore
    public Messaggio(String testo) {
        this.testo = testo;
    }
   
    // getters
    public String getTesto() {
        return testo;
    }

    // setters
    public void setTesto(String testo) {
        this.testo = testo;
    }


    
    
}
