package ex2;

public class Corso {

    // fields
    private String nomeCorso;

    // costruttore
    public Corso(String nomeCorso) {
        this.nomeCorso = nomeCorso;
    }
    
    // metodi
    public void iscrivi(Studente studente) {
        System.out.println("Studente " + studente.getNome() + " iscritto al corso di " + nomeCorso);
    }

    // getters
    public String getNomeCorso() {
        return nomeCorso;
    }
    
}
