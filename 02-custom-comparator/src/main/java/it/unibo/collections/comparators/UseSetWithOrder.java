package it.unibo.collections.comparators;

import java.util.Set;
import java.util.TreeSet;

/**
 * 
 */
public final class UseSetWithOrder {

    private UseSetWithOrder() {
    }

    /**
     * @param s
     *            ignored
     */
    public static void main(final String[] s) {

        /*
         * Scrivi un programma che:
         *
         * 1) Crei un nuovo TreeSet ORDINATO di stringhe.
         * Per ordinare l'insieme, definisci un nuovo Comparator in una classe separata.
         * Il comparator deve convertire le stringhe in valori double, quindi confrontare i valori double per individuare il più grande. 
         * Questo perchè ad esempio se abbiamo: "1", "10", "2", "20", "3" in double otteniamo: 1,2,3,10,20
         * 
         * Il comparatore non deve occuparsi del caso delle stringhe che non sono analizzabili come valori double.
         */

        /*
         * 2) Inserisca nel set cento stringhe contenenti numeri generati casualmente
         * (utilizzi Math.random() e converta opportunamente in String)
         */
        /*
         * 3) Stampa il set, che deve essere ordinato
         */ 
        
        // 1. Dichiaro comparator
        DoubleComparator comparator = new DoubleComparator(); //creo un oggetto della classe DoubleComparator.

        //Chi utilizza questo Comparator? Il TreeSet, che deve sapere come ordinare le stringhe che contiene.
        //Altrimenti Comparator da solo non fa nulla: serve una struttura, come TreeSet, che lo utilizzi.

        // 2. Creo il TreeSet passando il Comparator
        Set<String> set = new TreeSet<>(comparator);

        //Ma perché passiamo il Comparator?
        //Perché vogliamo che il TreeSet utilizzi il nostro criterio di ordinamento numerico anziché quello alfabetico.

        // 3. Inserisco 100 numeri casuali convertiti in String. Il Comparator le converte temporaneamente in double per confrontarle.
        for (int i = 0; i < 100; i++) {
            set.add(String.valueOf(Math.random()));
        }

        // 4. Stampo il set
        System.out.println(set);

    }
}
