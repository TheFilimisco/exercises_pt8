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

/*
        Scanner input = new Scanner(System.in);
//        System.out.println("Put position for iterator");
        int P = input.nextInt();
//        System.out.println("'e' or 'd': ");
        String d = input.next();
//        System.out.print("Put your length's arrays: ");
        int N = input.nextInt();
        int[] array = new int[N];

        for(int i = 0; i < array.length; i++) {
//            System.out.print("Put your numbers's arrays: ");
            int number = input.nextInt();
            array[i] = number;
        }

        int[] newArray = new int[N];

        int count = 0;
        switch (d){
            case "e":
                for (int i = 0; i < newArray.length; i++) {
                    if (newArray.length==2){
                        newArray[0] = array[1];
                        newArray[1] = array[0];
                        break;
                    }
                    if (i+P > newArray.length-1){
                        newArray[i] = array[count];
                        count++;
                    } else {
                        newArray[i] = array[i+P];
                    }
                }
                break;
            case "d":
                for (int i = 0; i < newArray.length; i++) {
                    if (newArray.length==2){
                        newArray[0] = array[1];
                        newArray[1] = array[0];
                        break;
                    }
                    if (i-P < 0){
                        newArray[i] = array[(array.length-(P-count))];
                        count++;
                    } else {
                        newArray[i] = array[i-P];
                    }
                }
                break;
        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
*/

        /*//6
        Scanner input = new Scanner(System.in);
        int inputNumberLength = input.nextInt();
        Student[] students = new Student[inputNumberLength];
        for (int i = 0; i < students.length; i++) {
            String name = input.next();
            double note = input.nextDouble();
            students[i] = new Student(name,note);
        }

        int counterStudent = 0;
        double accumStudent = 0;

        for (Student student : students){
            accumStudent+=student.note_grade;
            counterStudent+=1;
        }

        double arithmeticMean = accumStudent/counterStudent;

        for (Student student: students){
            if (student.note_grade >= arithmeticMean){
                System.out.println(student.name);
            }
        }*/

        //7

/*        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] listVotes = new int[N];
        for(int i = 0; i < listVotes.length; i++) {
            int number = input.nextInt();
            listVotes[i] = number;
        }

        int maxValue = Integer.MIN_VALUE;
        int numVote = 0;

        for (int i = 0; i < 21; i++) {
            int counter = 0;
            for (int j = 0; j < listVotes.length; j++) {
                if (i==listVotes[j]){
                    counter+=1;
                }
            }
            if (maxValue<counter){
                maxValue=counter;
                numVote=i;
            }
        }

        System.out.println(numVote);*/

        //8






    }


    /*public static class Student{
        private String name;
        private double note_grade;

        public Student(String name, double note_grade) {
            this.name = name;
            this.note_grade = note_grade;
        }

        public Student() {
            this.name = "";
            this.note_grade = 0;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getNote_grade() {
            return note_grade;
        }

        public void setNote_grade(double note_grade) {
            this.note_grade = note_grade;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", note_grade=" + note_grade +
                    '}';
        }
    }*/
}

