import java.util.Arrays;
import java.util.Scanner;

public class MatrixExercises {
    public static void main(String[] args) {
        //1
        /*Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();

        int[][] A = new int[N][M];


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M ; j++) {
                int number = input.nextInt();
                A[i][j] = number;
            }
        }

        int N2 = input.nextInt();
        int M2 = input.nextInt();
        int[][] B = new int[N2][M2];

        for (int i = 0; i < N2; i++) {
            for (int j = 0; j < M2 ; j++) {
                int number = input.nextInt();
                B[i][j] = number;
            }
        }

        int[][] C = new int[N][M];

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C.length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        for (int i = 0; i <C.length ; i++) {
            for (int j = 0; j < C.length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println(" ");
        }*/

        //2

/*        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();

        int[][] A = new int[N][M];


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M ; j++) {
                int number = input.nextInt();
                A[i][j] = number;
            }
        }

        int[][] A2 = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                A2[i][j] = A[j][i];
                System.out.print(A2[i][j] + " ");
            }
            System.out.println(" ");
        }*/

        //3

//        Scanner input = new Scanner(System.in);
//        int N = input.nextInt();
//
//        int[][] A = new int[N][N];
//
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N ; j++) {
//                int number = input.nextInt();
//                A[i][j] = number;
//            }
//        }
//        String hisSymmetric ="";
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                if (((A[i] != A[j]) && (A[i][j]!=A[j][i]))){
//                    hisSymmetric="FALSE";
//                    break;
//                }
//            }
//        }
//        if (hisSymmetric.equals("FALSE")){
//            System.out.println("FALSE");
//        } else {
//            System.out.println("TRUE");
//        }



//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                System.out.print(A[i][j] + " ");
//            }
//            System.out.println(" ");
//        }

//        for (int i = N-1 ; i >= 0; i--) {
//            for (int j = M-1; j >= 0; j--) {
//                System.out.print(A[i][j] + " ");
//            }
//            System.out.println(" ");
//        }


        //4

//        Scanner input = new Scanner(System.in);
//        String nameInput = input.nextLine();
//        City [][] cities = new City[6][6];
//
//
//        for (int i = 0; i < cities.length ; i++) {
//            for (int j = 0; j < cities.length; j++) {
//                if (cities[i] == cities[j]){
//                    cities[i][j] = new City(nameInput,0);
//                }
//                System.out.print(cities[i][j] + " ");
//
//            }
//            System.out.println(" ");
//        }
//

        Scanner input = new Scanner(System.in);
        int inputNumberArray = input.nextInt();

        String[][] board = new String[inputNumberArray][inputNumberArray];
        input.nextLine();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = input.nextLine();
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j <board.length ; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(" ");
        }

        int x = input.nextInt();
        int y = input.nextInt();
        while (!(x==-1 && y==-1)){
            if (board[x][y].equals("V")){
                board[x][y] = "A";
            }
            x = input.nextInt();
            y = input.nextInt();
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j <board.length ; j++) {
                if (board[i][j].equals("V")){
                    System.out.println("NO GUANYA");
                    break;
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j <board.length ; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(" ");
        }




    }

//    public static class City{
//        private String name;
//        private int km;
//
//        public City(String name, int km) {
//            this.name = name;
//            this.km = km;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public int getKm() {
//            return km;
//        }
//
//        public void setKm(int km) {
//            this.km = km;
//        }
//
//        @Override
//        public String toString() {
//            return "City{" +
//                    "name='" + name + '\'' +
//                    ", km=" + km +
//                    '}';
//        }
//    }


}
