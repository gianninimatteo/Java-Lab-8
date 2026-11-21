package it.unibo.generics.utilities;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Simple class to test the {it.unibo.oop.lab05.Utilities} class.
 */
//Classe che utilizza le operazioni e controlla i risultati.
public final class UseUtilities {

    private UseUtilities() { }

    /**
     * @param s
     *            unused
     */
    public static void main(final String[] s) {

        //Crea due insiemi di stringhe. In questo i 2 insiemi contengono solo stringhe.
        final var setA = Set.of("a", "b", "c", "d"); // 'var' permette a Java di dedurre automaticamente il tipo.
        final var setB = Set.of("c", "d", "e");

        //Controlla che l'unione restituisca esattamente l'insieme previsto.
        assertEquals(Set.of("a", "b", "c", "d", "e"), Utilities.union(setA, setB));

        //Controlla che vengano restituiti solamente gli elementi comuni.
        assertEquals(Set.of("c", "d"), Utilities.intersection(setA, setB));

        //Controlla che vengano restituiti solamente gli elementi non comuni.
        assertEquals(Set.of("a", "b", "e"), Utilities.symmetricDifference(setA, setB));

        //Test randomElement
        final var extractedA = new HashSet<String>(); //Crea un insieme vuoto. Usa 'HashSet' perchè non vogliamo duplicati.
        while (!extractedA.equals(setA)) { 
            final var random = Utilities.randomElement(setA); //Estrae un elemento casuale da setA.
            assertContains(setA, random); //Controlla che l'elemento estratto appartenga a setA.
            extractedA.add(random); //Aggiunge l'elemento estratto a extractedA.
            //Ripete finché extractedA contiene tutti gli elementi di setA.
        }
        extractedA.clear();

        //Qui estrae continuamente coppie casuali.
        //Per ogni coppia:
        // - getFirst() restituisce un elemento del primo insieme.
        // - getSecond() restituisce un elemento del secondo insieme.
        // Li aggiunge ai rispettivi insiemi di elementi estratti.

        //Il ciclo termina quando ha estratto tutti gli elementi di entrambi gli insiemi.

        final var extractedB = new HashSet<String>();
        while (!(extractedA.equals(setA) && extractedB.equals(setB))) {
            final var randomPair =  Utilities.randomPair(setA, setB);
            extractedA.add(randomPair.getFirst());
            extractedB.add(randomPair.getSecond());
            assertContains(setA, randomPair.getFirst());
            assertContains(setB, randomPair.getSecond());
        }
    }

    private static void assertEquals(final Object expected, final Object actual) {
        Objects.requireNonNull(
            Objects.equals(expected, actual) ? new Object() : null,
            "ERROR! Expected " + expected + ", but got " + actual + "!"
        );
        System.out.println("OK: " + expected + " is the same of " + actual); // NOPMD
    }

    private static <T> void assertContains(final Collection<? super T> collection, final T element) {
        Objects.requireNonNull(
            collection.contains(element) ? new Object() : null,
            "ERROR! " + collection + " does not contain " + element + "!"
        );
        System.out.println("OK: " + collection + " contains " + element); // NOPMD
    }
}

// Quindi un esempio di Generici qui:
// Utilities.randomElement(setA);
// Il metodo non specifica direttamente il tipo: lo deduce dalla collezione passata. Quindi utilizza X senza specificare un tipo concreto.
// Deduce il tipo dagli elementi della collezione che passiamo al metodo.
