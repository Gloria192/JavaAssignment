package GenericMergeArray;

import java.lang.reflect.Array;

public class GenericArrayUtility {
    public static <T> T[] mergeArrays(T[] a, T[] b) {

        if (a == null)
            return b;

        if (b == null)
            return a;

        T[] mergedArray = (T[]) Array.newInstance(a.getClass().getComponentType(), a.length + b.length);

        System.arraycopy(a, 0, mergedArray, 0, a.length);
        System.arraycopy(b, 0, mergedArray, a.length, b.length);

        return mergedArray; // Return the mergedarray
    }
}

