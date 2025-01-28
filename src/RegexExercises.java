import java.util.regex.Pattern;

public class RegexExercises {
    public static void main(String[] args) {
       //1
        System.out.println(Pattern.matches("Java", "Java")); //TRUE

        //Whatever word but if you dont inpunt nothing. So this is false
        //If put just "w" that means that is 1 String, but if you need more it will be you need "+"
        System.out.println(Pattern.matches("\\w", "J")); //TRUE
        System.out.println(Pattern.matches("\\w+", "Ja")); //TRUE

        //2
        System.out.println(Pattern.matches("\\d{8}[A-Z]", "54910978L")); //TRUE

        //3
        System.out.println(Pattern.matches("[\\w\\s{}()\\[\\].;]+","public class MainTest {public static void main(String[] args) {System.out.println(Hello world);}")); //TRUE

        //4
        System.out.println(Pattern.matches("[^aeiou`^AEIOU]+", "dfgha"));

        //5
        //(?i) UpperCase and LowerCase works!
        //.* Whatever character or nothing
        System.out.println(Pattern.matches("(?i)^fga.*", "fgasadasd"));

        //6
        System.out.println(Pattern.matches("^[^\\d].*", "F1gasadasd"));
        System.out.println(Pattern.matches("^\\D.*", "F1gasadasd"));

        //7
        System.out.println(Pattern.matches("\\w{4,7}", "dseqqdasdasd"));

        //8
        System.out.println(Pattern.matches(".*\\D$", "asdasdasd1"));

        //9
        System.out.println(Pattern.matches(".*2+(?!3).*", "dsad22"));

        //10
        System.out.println(Pattern.matches("(?i)[x`z]+", "xxxxx"));




    }

}
