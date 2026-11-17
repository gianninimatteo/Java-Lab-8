package it.unibo.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static it.unibo.collections.test.Assertions.assertContentEqualsInAnyOrder;
import static it.unibo.collections.test.Assertions.assertTrue;

/**
 * Example class using {@link java.util.Collection}.
 */
public final class UseCollection {

    private UseCollection() {
    }

    /**
     * @param args
     *            unused
     */
    public static void main(final String[] args) {
        /*
         * A meno che non sia necessario eseguire operazioni specifiche, utilizzare sempre l'interfaccia più
         * generica.
         * Se utilizziamo `var` invece di specificare Collection<Integer>, quale tipo
         * avrà `coll`?
         */
        final Collection<Integer> coll = new ArrayList<>();
        coll.addAll(List.of(1, 3, 5, 7, 9, 11)); // var-args
        // Add some elements
        coll.add(13);
        coll.add(15);
        coll.add(15);
        // Remove an element
        coll.remove(7);

        //Confronta il contenuto di 'coll' con gli elementi che gli passi nel metodo, verificando che siano presenti tutti
        assertContentEqualsInAnyOrder(List.of(1, 3, 5, 9, 11, 13, 15, 15), coll);
        // Remove multiple elements at once
        coll.removeAll(List.of(11, 13, 15));
        assertContentEqualsInAnyOrder(List.of(1, 3, 5, 9), coll);
        
        //retainAll() mantiene nella collezione solo gli elementi presenti anche in un'altra collezione
        coll.retainAll(List.of(1, 2, 3, 4, 5));
        assertContentEqualsInAnyOrder(List.of(1, 3, 5), coll);
        assertTrue(coll.contains(3));
    }
}
