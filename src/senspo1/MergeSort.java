/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senspo1;

import java.util.List;
import senspo1.Student;

/**
 *
 * @author Sven
 */
public class MergeSort {

    // Array voor de merges
    private static Comparable[] aux;

    // Sorteer methode
    public static void sort(Comparable[] a) {
        // Maak een aux met de lengte van de array.
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);

    }

    public static boolean isSorted(Comparable[] a, int i) {
        if (i + 1 == a.length) {
            System.out.println("Deze lijst is al gesorteerd");
        } else {
            if ((a[i + 1].compareTo(a[i])) > 1) {
                return isSorted(a, i + i);
            } else {
                return false;
            }
        }
        return true;
    }

    public static void sort(Comparable[] a, int lo, int hi) {
        if (isSorted(a, 0)) {
            return;
        }
        if (hi > lo) {

            int mid = lo + (hi - lo) / 2;
            sort(a, lo, mid);
            sort(a, mid + 1, hi);
            merge(a, lo, mid, hi);

        }
    }

    public static void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;

        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (aux[j].compareTo(aux[i]) == -1) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }

    }

}
