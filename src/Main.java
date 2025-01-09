import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Put your length's arrays: ");
        int N = input.nextInt();
        int[] array = new int[N];
        int acum = 10;
        for(int i=0; i<array.length; i++) {
            array[i]=acum;
            acum+=10;
            System.out.print(array[i] + " ");
        }

        int[] array_reverse = new int[N];
        for (int i = 0; i < array.length; i++) {
            int less = array[array.length-1];
            array_reverse[i] = less;
            less-=10;
            System.out.println(array_reverse[i] + " ");
        }

    }
}