import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        //Pattern.matches
        /*Pattern.matches(PATRO_DEFINIT, TEXT_A_BUSCAR); //Retorna True/False*/
        System.out.println(Pattern.matches("\\d{5}", "56745")); //TRUE
        System.out.println(Pattern.matches("\\d{5}", "56745d")); //FALSE

        //Using Patter and Matcher
        Pattern myPattern = Pattern.compile("\\w+");
        Matcher myMatcher = myPattern.matcher("Hola Mon!");

        //Matcher.group()
        while (myMatcher.find()) {
            System.out.println("Trobat: " + myMatcher.group() + " a: " + myMatcher.start() + "," + myMatcher.end());
        }

        //Difference
        System.out.println(Pattern.matches("HOLA", "HOLA MON!"));  //False
        System.out.println(Pattern.compile("HOLA").matcher("HOLA MON!").find()); //True


        //Pattern.compile(patrón)
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher("12345");
        System.out.println(matcher.matches()); // true

        //Matcher.find()
        Pattern patternFind = Pattern.compile("\\d+");
        Matcher matcherFind = patternFind.matcher("abc123def456");
        while (matcherFind.find()) {
            System.out.println(matcherFind.group()); // "123", "456"
        }

        // Matcher.start() y Matcher.end()
        Pattern patternStartEnd = Pattern.compile("\\d+");
        Matcher matcherStartEnd = patternStartEnd.matcher("abc123def");
        if (matcherStartEnd.find()) {
            System.out.println("Inicio: " + matcherStartEnd.start()); // 3
            System.out.println("Fin: " + matcherStartEnd.end());     // 6
        }

        //Matcher.replaceAll()

        String resultado = "abc123def".replaceAll("\\d+", "X");
        System.out.println(resultado); // "abcXdef"

        //String.split(patrón)

        String[] partes = "a,b,c".split(",");
        System.out.println(Arrays.toString(partes)); // [a, b, c]

        //Matcher.matches()
        Pattern pat = Pattern.compile("\\d+");
        Matcher mat = pat.matcher("12345");
        System.out.println(mat.matches()); // true

    }
}
