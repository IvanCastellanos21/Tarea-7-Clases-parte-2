public class Main {
    public static void main(String[] args) {
        Pais pais = new Pais("Mexico", "Peso");
        System.out.println(pais);
        pais.ayudar();

        CuboRubik cubo = new CuboRubik("3*3*3");
        System.out.println(cubo);
        cubo.rotar();

        Gato gato = new Gato ("Calico", 6);
        System.out.println(gato);
        gato.maullar();

        Giroscopio giro = new Giroscopio(12);
        System.out.println(giro);
        giro.fijar();

        Lampara lamp = new Lampara("Led", 100);
        System.out.println(lamp);
        lamp.encenderLampara();

        Libro libro = new Libro(327, "Java a fondo", "Español");
        System.out.println(libro);
        libro.abrir();

        Computadora compu = new Computadora(16, "Windows");
        System.out.println(compu);
        compu.encender();

        Pelota pelota = new Pelota(8, "Volleyball", "Wilson");
        System.out.println(pelota);
        pelota.rebotar();
    }
}