package it.unibo.generics.utilities;

import java.util.Objects;

/**
 * Una classe utilizzata per racchiudere due oggetti.
 *
 * Nota importante: quando si realizzano progetti reali, è molto, molto, molto meglio
 * affidarsi a librerie ampiamente utilizzate piuttosto che scrivere da soli tonnellate di codice boilerplate
 * (o copiare il codice che vi forniamo). Buone implementazioni di coppie mutabili
 * e immutabili sono disponibili in Apache Commons Lang, Apache Commons
 * Math e Jool (joo-lambda di Jooq).
 *
 * @param <X>
 *            type of the first {@link Object}
 * @param <Y>
 *            type of the second {@link Object}
 */

// Questa è la classe più importante per capire il concetto di generici.

public final class Pair<X, Y> { // <X, Y> significa che questa classe può contenere due oggetti di tipo qualsiasi
    /**
    * Per esempio:
    * Pair<String, Integer> coppia = new Pair<>("Matteo", 25);
    
    * In questo caso:
    *  X diventa String.
    *  Y diventa Integer.
     */

    private final X first;
    private final Y second;

    /**
     * @param o1
     *            the first object
     * @param o2
     *            the second object
     */
    // Costruttore
    public Pair(final X o1, final Y o2) { //Riceve 2 oggetti: il 1 di tipo X, il secondo di tipo Y. Li assegna agli attributi 'first' e 'second'
        this.first = o1;
        this.second = o2;
    }

    // 2 Metodi get: restituiscono i 2 oggetti mantenendo i rispettivi tipi
    /**
     * @return the first object
     */
    public X getFirst() {
        return this.first;
    }

    /**
     * @return the second object
     */
    public Y getSecond() {
        return this.second;
    }

    /**
     * Restituisce una rappresentazione testuale della coppia.
     * 
     * @return  una stringa che rappresenta lo stato di questa coppia
     */
    @Override
    public String toString() {
        return "Pair [first=" + first + ", second=" + second + "]";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() { //Calcola un codice hash della coppia.
        /*
         * Funzione di hashing della libreria. Discreta, ma non particolarmente valida.
         * Tuttavia, per i casi d’uso in cui le prestazioni sono fondamentali, si consiglia vivamente
         * di utilizzare una libreria e un algoritmo di hashing validi. Ad esempio, Google Guava offre una serie di
         * algoritmi di hashing validi e veloci (Murmur 3 è una soluzione perfetta).
         */
        return Objects.hash(first, second);
    }

    /**
     * Confronta questa coppia con l'oggetto specificato. Il risultato è vero se e
     * solo se l'argomento non è nullo ed è un oggetto Pair contenente la stessa
     * coppia di oggetti.
     * 
     * @param other l'oggetto con cui confrontare questa coppia
     * 
     * @return vero se la coppia specificata è uguale a questa coppia
     */
    @Override
    public boolean equals(final Object other) { // Confronta 2 coppie per verificare se contengono gli stessi elementi.
        return this == other
            || other instanceof final Pair<?, ?> otherPair
            && Objects.equals(first, otherPair.first)
            && Objects.equals(second, otherPair.second);
    }
}
