package it.unibo.collections.sets;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

/**
 * Example class using {@link java.util.Set}.
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
         * Considering the content of "UseCollection, write a program which, in
         * order:
         *
         * 1) Builds a TreeSet containing Strings
         */
        final Collection<String> strings = new TreeSet<>();
        /*
         * 2) Populates such Collection with all the Strings representing numbers ranging from "1" to
         * "20" (both included)
         */
        
        for(int i =1; i <= ELEMS; i++) {
            strings.add(Integer.toString(i));
        }
        /*
         * 3) Prints its content
         */
        System.out.println(strings);
        /*
         * 4) Removes all those strings whose represented number is divisible by three.
         * Note: the method removeIf(Predicate) is not allowed.
         */
        for(int s =1; s <= ELEMS;  s++) {
            if(s % 3 == 0) {
                strings.remove(Integer.toString(s));
            } 
        }
        /*
         * 5) Prints the content of the Set using a for-each construct
         */
        for(String s : strings ) {
            System.out.println(s);
        }
        /*
         * 6) Verifies whether all the numbers left in the set are even
         */
        boolean result = true;
        for(String s : strings ) {
            if(Integer.valueOf(s) % 2 != 0) {
                result=false;
                break;
            }
        }
        System.out.println(result);
      
    }
}
