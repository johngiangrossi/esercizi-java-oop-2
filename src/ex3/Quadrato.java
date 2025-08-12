/*
 Definisci un'interfaccia `Calcolabile` con un metodo `int calcola();`.
 Crea due classi che la implementano:- `Quadrato` (con campo `lato`) che calcola e ritorna l’area.- `Rettangolo` (con `base` e `altezza`) che ritorna l’area.
 Scrivi un metodo che accetta un oggetto `Calcolabile` e stampa il risultato del metodo
 `calcola()`.
 L'obiettivo è applicare interfacce e polimorfismo
*/

package ex3;

public class Quadrato implements Calcolabile {

    // fields
    private int lato;

    // costruttore
    public Quadrato(int lato) {
        this.lato = lato;
    }
    
    // metodi
    @Override
    public int calcola() {
        return (int) Math.pow(lato, 2);
    }

    @Override
    public void stampaArea() {
        System.out.println("area del quadrato è: " + this.calcola());
    }
}
