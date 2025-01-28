public class StringsTest {
    public static void main(String[] args) {
        // charAt
        String str = "El primer programa";
        System.out.println("En la posició 4 hi ha: " + str.charAt(4));
        System.out.println("En la posició 11 hi ha: " + str.charAt(11));

        //substring

        // str.substring(posicioInicial)
        // str.substring(posicioInicial, posicioFinal)

        str = "El primer programa";
        System.out.println("Substring " + str.substring(12)); //Java
        System.out.println("Substring " + str.substring(3, 11));  //lenguaje

        // Starts or Ends with

        str = "El primer programa";
        System.out.println("comienza por El      " + str.startsWith("El"));
        System.out.println("termina por programa " + str.endsWith("programa"));

        // indexOf

        str = "El primer programa";
        //Also allow search throw strings

        int pos = str.indexOf("El");
        System.out.println("posició de la subcadena \"EL\" " + pos);

        int pos2 = str.indexOf("pr", 7);
        System.out.println("posició de la subcadena \"pr\" a partir de la posició 7: " + pos2);

        // trim

        str = "                12             ";
        System.out.println("string original               :" + str);
        System.out.println("string sin espacios en blanco :" + str.trim());


         // split
        //Separar les diferents paraules per espais
        //str.split(" ");

        String cadena = "Hola que tal com estas";
        String[] vectorSeparat = cadena.split(" ");
        for (String a : vectorSeparat) System.out.println(a);


        //Construeix un StringBuilder buit i amb una capacitat de 16 caràcters
        StringBuilder s = new StringBuilder();

        //Construeix un StringBuilder buit i amb una capacitat de 25 caràcters
        StringBuilder string = new StringBuilder(25);

        //Construeix un StringBuilder en base a l'String passat com a paràmetre
        StringBuilder strings = new StringBuilder("Hola Món!");


        //append
        for(int i = 0; i < 20; i++) {
            s.append(i);
        }

        System.out.println(s);

        //length()
        System.out.println(strings.length());

        //capacity()
        System.out.println(string.capacity());

        //toString
        System.out.println(strings.toString());




    }
}
