package com.rapchen.algs4.sort;

import edu.princeton.cs.algs4.StdIn;

/**
 * 算法2.1 选择排序 P156
 * @author Chen Runwen
 * @time 2020/2/4 15:14
 */
public class Selection extends ISort {

    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i; j < N; j++) {
                if (less(a[j], a[min]))
                    min = j;
            }
            exch(a, i, min);
        }
    }

    public static void main(String[] args) {
        String[] a = StdIn.readAllStrings();
        new Selection().sort(a);
        show(a);
    }

}
