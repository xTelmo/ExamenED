class Persona {
    private final String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

}

public class CompareWithEquals {

    public static void main(String... argv) {
        Persona p = new Persona("Pepe");
        Persona p1 = new Persona("Pepe");
        Persona p2 = p;

        System.out.println(p == p1); // false
        System.out.println(p.equals(p1)); // false
        System.out.println(p == p2); // true
        System.out.println(p.equals(p2)); // true
    }
}