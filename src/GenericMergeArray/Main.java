package GenericMergeArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Test with Integer arrays
        Integer[] intArray1 = {4, 6, 7};
        Integer[] intArray2 = {8, 8, 10};
        Integer[] mergedIntArray = GenericArrayUtility.mergeArrays(intArray1, intArray2);
        System.out.println("Merged Integer Array: " + Arrays.toString(mergedIntArray));

        // Test with String arrays
        String[] str1 = {"the", "World"};
        String[] str2 = {"Technology ", "in", "Java"};
        String[] mergedStrArray = GenericArrayUtility.mergeArrays(str1, str2);
        System.out.println("Merged String Array: " + Arrays.toString(mergedStrArray));
    }
}


