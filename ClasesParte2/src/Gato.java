public class Gato {
    private String raza;
    private int edad;

    public Gato(String raza, int edad) {
        this.raza = raza;
        this.edad = edad;
    }

    public Gato(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "raza='" + raza + '\'' +
                ", edad=" + edad +
                '}';
    }
    public void maullar(){
        System.out.println("Miau");
    }

    public void ronronear(){
        System.out.printf("El gato ronroneo");
    }
}
