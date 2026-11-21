package it.unibo.generics.utilities;

import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Set;

// Questa classe contiene dei metodi statici che lavorano con collezioni.
public final class Utilities {

    //Generatore di numeri casuali condiviso.
    private static final Random RANDOM_GENERATOR = new Random();

    //Costruttore private: impedisce di creare oggetti Utilities.
    private Utilities() { }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the union of the input sets.
     */
    //L'unione di 2 insiemi significa prendere tutti gli elementi di entrambi, senza duplicati.
    public static <X> Set<X> union(final Set<? extends X> setA, final Set<? extends X> setB) {
        return Collections.emptySet();

        // <X> Indica che il metodo è generico. X è un tipo che verrà determinato quando il metodo viene utilizzato.
        // Set<X> È il tipo restituito dal metodo. Significa che restituisce un insieme di elementi di tipo X.
        // Set<? extends X> Significa che accetta un Set contenente elementi di tipo X oppure di un suo sottotipo.
    }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the intersection of the input sets.
     */
    //L'intersezione restituisce solamente gli elementi presenti in entrambi gli insiemi. Metodo uguale a 'union'.
    public static <X> Set<X> intersection(final Set<? extends X> setA, final Set<? extends X> setB) {
        return Collections.emptySet();
    }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the symmetric difference of the input sets.
     */
    //La differenza simmetrica restituisce gli elementi che appartengono a uno dei due insiemi, ma non a entrambi.
    public static <X> Set<X> symmetricDifference(final Set<? extends X> setA, final Set<? extends X> setB) {
        return Collections.emptySet();
    }

    /**
     * @param coll
     *            the collection
     * @param <X>
     *            collection type
     * @return a random element from the collection
     *
     */
    // Il metodo restituisce un elemento casuale della collezione.
    public static <X> X randomElement(final Collection<X> coll) { //il metodo è generico e restituisce un elemento di tipo X.
        return null;
    }

    /**
     * @param first
     *            first collection
     * @param second
     *            second collection
     * @param <X>
     *            First collection type
     * @param <Y>
     *            Second collection type
     * @return a pair with two random elements
     */
    //Questo metodo collega le due classi
    public static <X, Y> Pair<X, Y> randomPair(final Collection<X> first, final Collection<Y> second) {
        return null;
    }
}
