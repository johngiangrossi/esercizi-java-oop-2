package ex2;

public class CorsoArray {

    // fields
    private String nomeCorso;
    private Studente[] iscritti;
    private int contatoreIscritti;

    // costruttore
    public CorsoArray(String nomeCorso) {
        this.nomeCorso = nomeCorso;
        this.iscritti = new Studente[2];
    }

    // metodi
    public void iscrivi(Studente studente) {
        if (contatoreIscritti < iscritti.length) {
            this.iscritti[contatoreIscritti] = studente;
            System.out.println("Studente " + studente.getNome() + " iscritto al corso di " + nomeCorso);
            contatoreIscritti++;
        } else {
            System.out.println("posti terminati");
        }

    }

    // getters
    public String getNomeCorso() {
        return nomeCorso;
    }
}




