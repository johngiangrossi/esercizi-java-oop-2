/*
 Definisci un'interfaccia `Animale` con un metodo `verso()`.
 Crea due classi `Cane` e `Gatto` che implementano `Animale` e forniscono
 un’implementazione concreta di `verso()`.
 Nel metodo `main`, crea un array di `Animale` con istanze di `Cane` e `Gatto` e invoca
 `verso()` per ciascuno.
 Questo esercizio mostra l’utilità del polimorfismo
*/

package ex6;

public class Cane implements Animale {

    @Override
    public void verso() {
        System.out.println("bau");
    }

}
