package ex1;

public class Pizza {

    /*
     Crea una classe `Pizza` che permetta di aggiungere ingredienti con metodi come:
    `Pizza aggiungiMozzarella();`, `Pizza aggiungiPomodoro();`, `Pizza aggiungiProsciutto();`
    Ogni metodo deve restituire lo stesso oggetto `Pizza` per permettere catene di chiamate come:
    `Pizza p = new Pizza().aggiungiMozzarella().aggiungiPomodoro();`
    L'obiettivo è far comprendere il concetto di metodi che ritornano `this`, spesso utilizzati in Java
    per implementare il pattern 'fluent interface'
    */
    

    // fields
    private String ingredienti;
    

    
    // costruttore
    public Pizza() {
        this.ingredienti = "";
    }
    

    // metodi
    // aggiungo mozzarella
    public Pizza aggiungiMozzarella() {
        ingredienti += "\nMozzarella";
        return this;
    }

    // aggiungo pomodoro
    public Pizza aggiungiPomodoro() {
        ingredienti += "\nPomodoro";
        return this;
    }

    // aggiungo prosciutto
    public Pizza aggiungiProsciutto() {
        ingredienti += "\nProsciutto";
        return this;
    }

    // stampo gli ingredienti
    public void stampaIngredienti() {
        if ("".equals(ingredienti)) {
            System.out.println("la pizza è vuota");
        } else {
            System.out.print("gli ingredienti della pizza sono: " + ingredienti);
        }
    }

    
}
