package ex8;

public class FiltraIniziaConA implements Filtrabile {

    @Override
    public boolean accetta(String elemento) {
        for (int i = 0; i < elemento.length(); i++) {
            char elem = elemento.charAt(i);
            if (elem == 'A') {
                return true;
            }
        }
        return false;
    }

}
