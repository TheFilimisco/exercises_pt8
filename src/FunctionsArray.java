import java.util.Arrays;

public class FunctionsArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.arraycopy(arr, 2, arr, 3, 4); // Mueve elementos a la izquierda
        System.out.println(Arrays.toString(arr)); // [2, 3, 4, 5, 5]

        int[] source = {1, 2, 3, 4, 5};
        int[] destination = new int[source.length];
        System.arraycopy(source, 0, destination, 0, source.length);


        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] combined = new int[array1.length + array2.length];

        System.arraycopy(array1, 1, combined, 0, array1.length-1);
        System.arraycopy(array2, 0, combined, array1.length, array2.length);

        System.out.println(Arrays.toString(combined));


        int[] source1 = {1,2,3,4,5};
        int[] dest = new int[6];
        System.arraycopy(source1,2,dest,3,3);
        System.out.println(Arrays.toString(dest));


    }
}
