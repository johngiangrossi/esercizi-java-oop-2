/*
 Crea due classi: `Motore` e `Macchina`.
 La classe `Motore` deve avere un metodo `accendi()` che stampa "Motore acceso".
 La classe `Macchina` deve avere un metodo `parti()` che crea un oggetto `Motore` e chiama
 `accendi()`.
 Scopo: comprendere come una classe può collaborare con un’altra per svolgere una funzione
 più complessa
 */

package ex4;

public class Motore {

    // metodi
    public void accendi() {
        System.out.println("motore acceso");
    }
}
