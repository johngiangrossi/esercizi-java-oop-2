/*
 Crea due classi: `Contatore` con un metodo `incrementa()` che aumenta un contatore interno,
 e `Controllore` con metodo `eseguiIncremento(Contatore c)` che chiama `c.incrementa()` tre
 volte.
 Obiettivo: far vedere come una classe può operare su un'altra classe custom e modificare il suo
 stato
*/

package ex7;

public class Contatore {

    // fields
    private int contatore;

    // costruttore
    public Contatore() {
        this.contatore = 0;
    }
    
    // metodi
    public void incrementa() {
        contatore++;
    }

    // getters
    public int getContatore() {
        return contatore;
    }

    
}
