package ex9;

public class Formatter {

    // metodi
    public Messaggio formatta(Messaggio msg) {
        String testoFormattato = msg.getTesto().toUpperCase();
        return new Messaggio(testoFormattato);
    };
}
