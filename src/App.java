import ex5.Utente;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        
        // ex1
        /*
        Pizza pizza1 = new Pizza();
        
        pizza1.stampaIngredienti();
        
        Pizza p = new Pizza().aggiungiMozzarella().aggiungiPomodoro();
        
        p.stampaIngredienti();
        */

        // ex1b
        /*
        PizzaArray pizza1 = new PizzaArray();
        System.out.println(pizza1.getIngredienti());

        PizzaArray p = new PizzaArray().aggiungiMozzarella().aggiungiPomodoro();
        System.out.println(p.getIngredienti());
        */

        // ex2
        /*
        Studente studente1 = new Studente("Mario", 123456);
        
        Corso corso1 = new Corso("matematica");
        
        corso1.iscrivi(studente1);
        */
        // ex2b
        /*
        Studente studente1 = new Studente("Mario", 123456);
        
        CorsoArray corso1 = new CorsoArray("matematica");
        
        corso1.iscrivi(studente1);
        
        Studente studente2 = new Studente("Francesco", 14560);
        corso1.iscrivi(studente2);
        
        Studente studente3 = new Studente("Marco", 14546560);
        corso1.iscrivi(studente3);
        */
        
        // ex3
        /*
        Calcolabile figura = new Quadrato(5);
        figura.stampaArea();
        
        figura = new Rettangolo(2, 3);
        figura.stampaArea();
        */

        // ex3b
        /*
        Calcolabile figura = new Quadrato(5);
        UsaCalcolabile.stampaCalcolabile(figura);
        
        figura = new Rettangolo(2, 3);
        UsaCalcolabile.stampaCalcolabile(figura);
        */
        
        // ex4
        /*
        Macchina macchina1 = new Macchina("fiat");
        macchina1.parti();
        */

        // ex5
        LocalDate LD = LocalDate.now();
        System.out.println("la data di oggi è: " + LD);

        LD = LocalDate.of(2000, 5, 17);

        Utente utente1 = new Utente().setEmail("mario.rossi1").setNome("mario").setDataNascita(LD);
        // utente1.setEmail("mario.rossi1").setNome("mario").setDataNascita(LD);
        utente1.stampa();

        LD = LD.plusDays(10);
        System.out.println("aggiungo 10 giorni alla data quindì sarà: " + LD);

        LD = LD.plusMonths(5);
        System.out.println("aggiungo 5 mesi alla data quindì sarà: " + LD);


        // ex6
        /*
        Animale[] animali = { new Cane(), new Cane(), new Gatto() };
        for (int i = 0; i < animali.length; i++) {
            Animale elem = animali[i];
            elem.verso();
        }
        
        // foreach
        for (Animale animale : animali) {
            animale.verso();
        }
        */

        // ex7
        /*
        Contatore c = new Contatore();
        Controllore controllore1 = new Controllore();
        controllore1.eseguiIncremento(c);
        System.out.println(c.getContatore());
        controllore1.eseguiIncremento(c);
        System.out.println(c.getContatore());
        */

        // ex8
        
        

        // ex9
        /*
        Messaggio msg = new Messaggio("ciao come stai");
        Formatter formatter1 = new Formatter();

        System.out.println(msg.getTesto());
   
        Messaggio msgFormattato = formatter1.formatta(msg);
        System.out.println(msgFormattato.getTesto());
        */

        // ex10
        /*
        Personaggio personaggio1 = new Personaggio(10, "mario");
        Giocatore giocatore1 = new Giocatore();

        System.out.println("il personaggio " + personaggio1.getNome() + " ha " + personaggio1.getPuntiVita() + " punti vita");

        giocatore1.attacca(personaggio1, 5);
        System.out.println("il personaggio " + personaggio1.getNome() + " ha " + personaggio1.getPuntiVita() + " punti vita");

        giocatore1.attacca(personaggio1, 5);
        System.out.println("il personaggio " + personaggio1.getNome() + " ha " + personaggio1.getPuntiVita() + " punti vita");
        */

    }
}
