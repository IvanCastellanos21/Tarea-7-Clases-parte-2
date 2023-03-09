public class Giroscopio {
    public double radio;

    public Giroscopio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Giroscopio{" +
                "radio=" + radio +
                '}';
    }
    public void girar(){
        System.out.println("Ha hecho girar al giroscopio");
    }
    public void fijar(){
        System.out.println("Ha fijado el giroscopio");
    }
}

