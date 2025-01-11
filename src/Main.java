import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*        // 1.
        Scanner input = new Scanner(System.in);
//        System.out.print("Put your length's arrays: ");
        int N = input.nextInt();
        int[] array = new int[N];

        for(int i=0; i<array.length; i++) {
//            System.out.print("Put your numbers's arrays: ");
            int number = input.nextInt();
            array[i] = number;
        }
//        System.out.println(Arrays.toString(array));

        for (int i = N-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }*/


/*        //2
        Scanner input = new Scanner(System.in);
//        System.out.print("Put your length's arrays: ");
        int N = input.nextInt();
        int[] array = new int[N];

        for(int i=0; i<array.length; i++) {
//            System.out.print("Put your numbers's arrays: ");
            int number = input.nextInt();
            array[i] = number;
        }

        for (int i = 0; i < array.length; i++) {
            array[i] += array[N-1];
            System.out.print(array[i] + " ");
        }*/

/*        //3

//        int numMax = Integer.MIN_VALUE;
        int numMin = Integer.MAX_VALUE;

        Scanner input = new Scanner(System.in);
//        System.out.print("Put your length's arrays: ");
        int N = input.nextInt();
        int[] array = new int[N];

        for(int i=0; i<array.length; i++) {
//            System.out.print("Put your numbers's arrays: ");
            int number = input.nextInt();
            array[i] = number;
        }

        for (int i = 0; i < array.length; i++) {
//            if (numMax< array[i]){
//                numMax = array[i];
//            }
            if (numMin > array[i]){
                numMin = array[i];
            }
        }

//        System.out.println(numMax);
//        System.out.println(numMin);

        for (int i = 0; i < array.length; i++) {
            array[i] -= numMin;
            System.out.print(array[i] + " ");
        }*/

       /* // 4
        Scanner input = new Scanner(System.in);
//        System.out.print("Put your length's arrays: ");
        int N = input.nextInt();
        int[] array = new int[N];

        for(int i = 0; i < array.length; i++) {
//            System.out.print("Put your numbers's arrays: ");
            int number = input.nextInt();
            array[i] = number;
        }
//        System.out.print("Put your length's arrays: ");
        int M = input.nextInt();
        int[] array2 = new int[M];

        for(int i = 0; i<array2.length; i++) {
//            System.out.print("Put your numbers's arrays: ");
            int number = input.nextInt();
            array2[i] = number;
        }

        int[] array3 = new int[array.length+array2.length];

        int a = 0;
        int b = 0;
        int i = 0;

        while (a < array.length && b < array2.length) {
            if (array[a] < array2[b]) {
                array3[i++] = array[a++];
            } else {
                array3[i++] = array2[b++];
            }
        }
        while (b < array2.length) {
            array3[i++] = array2[b++];
        }

        while (a < array.length) {
            array3[i++] = array[a++];
        }

        for (int j = 0; j < array3.length; j++) {
            System.out.print(array3[j] + " ");
        }*/

        //5

        Scanner input = new Scanner(System.in);
//        System.out.println("Put position for iterator");
        int P = input.nextInt();

        input.nextLine();
//        System.out.println("'e' or 'd': ");
        String d = input.nextLine();
//        System.out.print("Put your length's arrays: ");
        int N = input.nextInt();
        int[] array = new int[N];

        for(int i = 0; i < array.length; i++) {
//            System.out.print("Put your numbers's arrays: ");
            int number = input.nextInt();
            array[i] = number;
        }

        switch (d){
            case "e":
                System.arraycopy(array,P,array,0,array.length-1);
                System.out.println(Arrays.toString(array));
                break;
            case "d":
                break;
        }




    }
}