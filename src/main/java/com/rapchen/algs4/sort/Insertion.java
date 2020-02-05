package com.rapchen.algs4.sort;

import edu.princeton.cs.algs4.StdIn;

/**
 * 算法2.2 插入排序 P157
 * @author Chen Runwen
 * @time 2020/2/4 14:58
 */
public class Insertion extends ISort {

    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            Comparable tmp;
            if (!less(a[i], a[i - 1])) {
                continue;
            }

            tmp = a[i];
            a[i] = a[i - 1];
            int j;
            for (j = i - 1; j >= 1 && less(tmp, a[j-1]); j--) {
                a[j] = a[j - 1];
            }
            a[j] = tmp;
        }
    }

    public static void main(String[] args) {
        String[] a = StdIn.readAllStrings();
        new Insertion().sort(a);
        show(a);
    }

}
