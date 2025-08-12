package ex3;

public class Rettangolo implements Calcolabile {

    // fields
    private int base;
    private int altezza;

    // costruttore
    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    // metodi
    @Override
    public int calcola() {
        return base * altezza;
    }

    /*
    @Override
    public void stampaArea() {
        System.out.println("area del rettangolo è: " + this.calcola());
    }
    */
    
}
