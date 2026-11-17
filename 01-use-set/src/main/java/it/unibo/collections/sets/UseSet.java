package it.unibo.collections.sets;

//import java.util.ArrayList; //non usato qui
import java.util.Collection;
//import java.util.List; //non usato qui
import java.util.TreeSet;

/**
 * Example class using {@link java.util.Set}. //In questo esercizio non importo 'Set' perchè non lo utilizzo direttamente
 *
 */
public final class UseSet {

    private static final int ELEMS = 20;

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Tenendo conto del contenuto di “UseCollection”, scrivi un programma che, in
         * ordine:
         *
         * 1)  Crea un TreeSet contenente stringhe
         */
        final Collection<String> strings = new TreeSet<>(); //Usi il tipo più generale Collection.
        /*
         * 2) Popola tale raccolta con tutte le stringhe che rappresentano numeri compresi tra “1” e
         * “20” (entrambi inclusi)
         */
        
        for(int i = 1; i <= ELEMS; i++) {
            strings.add(Integer.toString(i));
        }
        /*
         * 3) Stampa il contenuto
         */
        System.out.println(strings);
        /*
         * 4) Rimuove tutte quelle stringhe il cui numero rappresentato è divisibile per tre.
         * Nota: il metodo removeIf(Predicate) non è consentito.
         */
        for(int s = 1; s <= ELEMS;  s++) {
            if(s % 3 == 0) {
                strings.remove(Integer.toString(s));
            } 
        }
        /*
         * 5) Stampa il contenuto del Set utilizzando un ciclo “for-each”
         */
        for(String s : strings ) {
            System.out.println(s);
        }
        /*
         * 6) Verifica se tutti i numeri rimasti nell'insieme sono pari
         */
        boolean result = true; //Parte da true perché inizialmente suppone che siano tutti pari.
        for(String s : strings ) {
            if(Integer.valueOf(s) % 2 != 0) {
                result=false;
                break; //appena trova anche un solo numero dispari, interrompe il ciclo e imposta result = false.
            }
        }
        System.out.println(result); //stampa soltanto true se tutti gli elementi sono pari, oppure false se ne trova anche uno dispari.
      
    }
}
