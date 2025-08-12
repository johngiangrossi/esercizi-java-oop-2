
public class App {
    public static void main(String[] args) throws Exception {
        
        // ex1
        /*
        Pizza pizza1 = new Pizza();
        
        pizza1.stampaIngredienti();
        
        Pizza p = new Pizza().aggiungiMozzarella().aggiungiPomodoro();
        
        p.stampaIngredienti();
        */
         
        // ex2
        /*
        Studente studente1 = new Studente("Mario", 123456);
        
        Corso corso1 = new Corso("matematica");
        
        corso1.iscrivi(studente1);
        */
        
        // ex3
        /*
        Calcolabile figura = new Quadrato(5);
        figura.stampaArea();
        
        figura = new Rettangolo(2, 3);
        figura.stampaArea();
        */
        
        // ex4
        /*
        Macchina macchina1 = new Macchina("fiat");
        macchina1.parti();
        */

        // ex5
        /*
        Utente utente1 = new Utente().setEmail("mario.rossi1").setNome("mario");
        // utente1.setEmail("mario.rossi1").setNome("mario");
        utente1.stampa();
        */

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
