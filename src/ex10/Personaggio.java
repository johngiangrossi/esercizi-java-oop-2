/*
 Crea un’interfaccia `Attaccabile` con metodo `void subisciDanno(int danno)`.
 Crea una classe `Personaggio` che implementa `Attaccabile` e ha punti vita e nome.
 Crea una classe `Giocatore` con metodo `attacca(Attaccabile nemico, int danno)` che chiama
 `subisciDanno()`.
 Obiettivo: rinforzare polimorfismo e interazione tra classi tramite interfacce
*/

package ex10;

public class Personaggio implements Attaccabile {

    // fields
    private int puntiVita;
    private String nome;


    // costruttore
    public Personaggio(int puntiVita, String nome) {
        this.puntiVita = puntiVita;
        this.nome = nome;
    }
    

    // getters
    public int getPuntiVita() {
        return puntiVita;
    }

    public String getNome() {
        return nome;
    }


    // metodi
    @Override
    public void subisciDanno(int danno) {
        puntiVita -= danno;
        if (puntiVita <= 0) {
            System.out.println("hai subito " + danno + " hai perso tutta la vita");
        } else {
            System.out.println("hai subito " + danno + " vita rimasta " + puntiVita);
        }
    }


}
