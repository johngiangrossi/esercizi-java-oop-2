/*
 Crea una classe `Utente` con campi `nome` ed `email`, e metodi come:
 `Utente setNome(String nome)` e `Utente setEmail(String email)`.
 Ogni metodo deve restituire `this` per permettere la costruzione dell’oggetto in modo fluente.
 Alla fine, aggiungi un metodo `stampa()` per visualizzare i dati.
 Questo esercizio rinforza il concetto di ritorno dell'oggetto stesso
*/

package ex5;

public class Utente {

    // fields
    private String nome;
    private String email;

    // costruttore
    public Utente() {
    }
    
    // metodi
    public Utente setNome(String nome) {
        this.nome = nome;
        return this;
    };

    public Utente setEmail(String email) {
        this.email = email;
        return this;
    };

    public void stampa() {
        System.out.println("il nome utente è: " + nome + "\nl'email è: " + email);
    }
}
