/*
Crea due classi: `Studente` e `Corso`.
 La classe `Studente` contiene informazioni come nome e matricola.
 La classe `Corso` deve avere un metodo `iscrivi(Studente studente)` che stampa un messaggio
 come:
 `Studente Mario iscritto al corso di Matematica`.
 Questo esercizio serve per esercitarsi con metodi che ricevono oggetti di classi custom come
 argomenti
*/

package ex2;

public class Studente {

    private String nome;
    private int matricola;

    // costruttore
    public Studente(String nome, int matricola) {
        this.nome = nome;
        this.matricola = matricola;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public int getMatricola() {
        return matricola;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }
    
    
    
}
