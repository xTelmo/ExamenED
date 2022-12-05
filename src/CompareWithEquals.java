public class CompareWithEquals {

    public static void main(String[] args) {
        String s1 = "hola";
        String s2 = s1;
        String s3 = "hola";
        String s4 =  new String("hola"); // aunque el IDE sugiere no hacer explicita la instancia,...

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // true
        System.out.println(s1 == s4); // false: referencias distintas
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3));  // true
        System.out.println(s1.equals(s4)); // true: referencias distintas a objetos iguales

    }

}
