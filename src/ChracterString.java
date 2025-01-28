import java.util.Scanner;

public class ChracterString {
    public static void main(String[] args) {
        //1

       /* Scanner input = new Scanner(System.in);
        String inputText = input.nextLine();
        String newText = inputText.toLowerCase().replace(" ", "");
        String vowels = "aeiou";

        int counterVowel = 0;

        for (int i = 0; i < vowels.length(); i++) {
            for (int j = 0; j < newText.length(); j++) {
                if (vowels.charAt(i) == newText.charAt(j)) {
                    counterVowel+=1;
                }
            }
        }

        System.out.println(counterVowel);*/

        //2

      /*  Scanner input = new Scanner(System.in);
        String inputText = input.nextLine();
        String newText = inputText.toLowerCase().replace(" ", "");
        String vowels = "aeiou";

        int counterVowel = 0;

        for (int i = 0; i < vowels.length(); i++) {
            for (int j = 0; j < newText.length(); j++) {
                if (vowels.charAt(i) == newText.charAt(j)) {
                    counterVowel+=1;
                    break;
                }
            }
        }

        if (counterVowel==vowels.length()){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }*/

        //3
        /*Scanner input = new Scanner(System.in);
        String inputText = input.nextLine();
        System.out.println(inputText.replace(" ", ""));*/

        //5

/*        Scanner input = new Scanner(System.in);

        String inputSentence1 = input.nextLine();
        String inputSentence2 = input.nextLine();


        int start = inputSentence1.indexOf(inputSentence2);
        int finish =  start + inputSentence2.length();
        if (start == -1){
            System.out.println(inputSentence1);
        } else {
            System.out.print(inputSentence1.substring(0,start));
            System.out.print(inputSentence1.substring(finish));
        }*/

        //6
/*
        Scanner input = new Scanner(System.in);
        int DNI = input.nextInt();
        int remainder = DNI % 23;

        String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
        String NIF = Integer.toString(DNI) + letters.charAt(remainder);
        System.out.println(NIF);*/

        //7

/*        Scanner input = new Scanner(System.in);

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String word = input.nextLine();
        int position = input.nextInt();

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < alphabet.length(); j++) {
                if (word.charAt(i) == alphabet.charAt(j)){
                    char change = alphabet.charAt(j+position);
                    System.out.print(change);
                }
            }
        }*/

       //8
/*        Scanner input = new Scanner(System.in);
        String inputText = input.nextLine();
        String formatedInputText = inputText.replace(" ", "").toLowerCase().replaceAll("[^a-zA-Z0-9\\s]","");
        StringBuilder text = new StringBuilder(formatedInputText);
        StringBuilder textReverse = new StringBuilder();

        for (int i = text.length()-1; i >=0; i--) {
            textReverse.append(text.charAt(i));
        }
//        System.out.println(text);
//        System.out.println(textReverse);

        if (text.compareTo(textReverse) == 0){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }*/

        //9

/*        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        StringBuilder formatedInputText = new StringBuilder(text);

        for (int i = text.length() -1 ; i >= 0 ; i--) {
            System.out.print(formatedInputText.charAt(i));
        }*/

        //10
/*        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String formatedText = text.toUpperCase();

        String[] textSplit = formatedText.split(" ");

        for (String sentence : textSplit) {
            for (int i = 0; i < sentence.length(); i++) {
                if (i==0 || i==sentence.length()-1){
                    System.out.print(sentence.charAt(i));
                }
            }
            System.out.print(" ");
        }*/






























    }
}
