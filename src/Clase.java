class Clase {
    int entero;
    String string;

    public Clase(int i, String string) {
        this.entero = i;
        this.string = string;
    }

    @Override
    public String toString() {
        return "Objeto { i=" + entero + ", a='" + string + "\'}";
    }
}