import java.util.Arrays;

public class ArraysExample {
    public static void main(String a[] ){

   
        int[] array01 = {1, 2, 3};
        int[] array02 = {1, 2, 4};
        int[] array03 = {1, 2, 3};

        /*Compares two arrays lexicographically and returns an integer indicating their order relation 

        A negative value if the first array is lexicographically less than the second array.
        Zero if both arrays are equal.
        A positive value if the first array is lexicographically greater than the second array.
         * 
        */

        int result1 = Arrays.compare(array01, array02);
        int result2 = Arrays.compare(array01, array03);

        System.out.println("Comparing array1 and array2: " + result1); // Output: -1
        System.out.println("Comparing array1 and array3: " + result2); // Output: 0


        // Example arrays
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 4};
        int[] array3 = {1, 2, 3};
        int[] array4 = {1, 2, 3, 4};

        // Using Arrays.mismatch
        /** 
         *  The index of the first differing element.
            The length of the shorter array if the arrays are identical up to that point.
            -1 if the arrays are completely identical.
        */
        int mismatch1 = Arrays.mismatch(array1, array2); // Expected output: 2
        int mismatch2 = Arrays.mismatch(array1, array3); // Expected output: -1
        int mismatch3 = Arrays.mismatch(array1, array4); // Expected output: 3

        // Printing the results
        System.out.println("Mismatch between array1 and array2: " + mismatch1);
        System.out.println("Mismatch between array1 and array3: " + mismatch2);
        System.out.println("Mismatch between array1 and array4: " + mismatch3);
    }
    
}
