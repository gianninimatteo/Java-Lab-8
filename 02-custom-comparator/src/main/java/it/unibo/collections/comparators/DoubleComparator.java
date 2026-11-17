package it.unibo.collections.comparators;

import java.util.Comparator;

public class DoubleComparator implements Comparator<String> { //Comparator non è una classe: è un'interfaccia già fornita da Java. Uso il tipo String perchè confrontiamo 2 stringhe
    
    public int compare(final String s1, final String s2) {

        //Salvo i 2 valori nelle 2 variabili 'v1' e 'v2' e li converto in double
        double v1 = Double.parseDouble(s1); 
        double v2 = Double.parseDouble(s2);

        //Confronto v1 e v2 per scoprire il più grande
        return Double.compare(v1, v2);
    }
}
