package by.bsuir.dubitskaya.task5.util;

import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;

public class LongestIncreasingSubsequence {

    public static int getLength(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array should'n be null");
        }

        if (array.length < 2) {
            return array.length;
        }

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int element : array) {
            if ((list.size() == 0) || (element > list.get(list.size() - 1))) {
                list.add(element);
            } else {
                int i = 0;
                int j = list.size() - 1;

                while (i < j) {
                    int mid = (i + j) / 2;
                    if (list.get(mid) < element) {
                        i = mid + 1;
                    } else {
                        j = mid;
                    }
                }

                list.set(j, element);
            }
        }

        return list.size();
    }
}
