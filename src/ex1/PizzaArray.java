package ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PizzaArray {

    // fields
    private List<String> ingredienti;

    // costruttore
    public PizzaArray() {
        this.ingredienti = new ArrayList<>();
    }
    
    // metodi
    public PizzaArray aggiungiMozzarella() {
        ingredienti.add("Mozzarella");
        return this;
    }

    public PizzaArray aggiungiPomodoro() {
        ingredienti.add("Pomodoro");
        return this;
    }

    public PizzaArray aggiungiProsciutto() {
        ingredienti.add("Prosciutto");
        return this;
    }

    // getters
    // ritorna una lista non modificabile quindì solo in lettura ma non rompe incapsulamento senza unmodifiableList
    public List<String> getIngredienti() {
        return (List<String>) Collections.unmodifiableList(this.ingredienti);
    }

    
}
