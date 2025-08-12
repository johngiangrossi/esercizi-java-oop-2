package ex4;

public class Macchina {

    // fields
    private String modello;
    private Motore motore;

    // costruttore
    public Macchina(String modello) {
        this.modello = modello;
        this.motore = new Motore();
    }
    
    // metodi
    public void parti(){
        // Motore motore = new Motore();
        motore.accendi();
    }
}
