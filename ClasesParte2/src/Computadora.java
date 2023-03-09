public class Computadora {
    private String marcaProcesador;
    private int cantidadRAM;
    private String OS;
    private String marcaDiscoDuro;
    private String marcaMotherboard;
    private String marcaTarjetaGrafica;

    public Computadora(int cantidadRAM, String OS) {
        this.cantidadRAM = cantidadRAM;
        this.OS = OS;
    }
    public Computadora(String marcaProcesador, int cantidadRAM, String OS, String marcaDiscoDuro, String marcaMotherboard, String marcaTarjetaGrafica) {
        this.marcaProcesador = marcaProcesador;
        this.cantidadRAM = cantidadRAM;
        this.OS = OS;
        this.marcaDiscoDuro = marcaDiscoDuro;
        this.marcaMotherboard = marcaMotherboard;
        this.marcaTarjetaGrafica = marcaTarjetaGrafica;
    }

    public String getMarcaProcesador() {
        return marcaProcesador;
    }

    public void setMarcaProcesador(String marcaProcesador) {
        this.marcaProcesador = marcaProcesador;
    }

    public int getCantidadRAM() {
        return cantidadRAM;
    }

    public void setCantidadRAM(int cantidadRAM) {
        this.cantidadRAM = cantidadRAM;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getMarcaDiscoDuro() {
        return marcaDiscoDuro;
    }

    public void setMarcaDiscoDuro(String marcaDiscoDuro) {
        this.marcaDiscoDuro = marcaDiscoDuro;
    }

    public String getMarcaMotherboard() {
        return marcaMotherboard;
    }

    public void setMarcaMotherboard(String marcaMotherboard) {
        this.marcaMotherboard = marcaMotherboard;
    }

    public String getMarcaTarjetaGrafica() {
        return marcaTarjetaGrafica;
    }

    public void setMarcaTarjetaGrafica(String marcaTarjetaGrafica) {
        this.marcaTarjetaGrafica = marcaTarjetaGrafica;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marcaProcesador='" + marcaProcesador + '\'' +
                ", cantidadRAM=" + cantidadRAM +
                ", OS='" + OS + '\'' +
                ", marcaDiscoDuro='" + marcaDiscoDuro + '\'' +
                ", marcaMotherboard='" + marcaMotherboard + '\'' +
                ", marcaTarjetaGrafica='" + marcaTarjetaGrafica + '\'' +
                '}';
    }

    public void encender(){
        System.out.println("Usted ha encendido esta computadora");
    }
    public void apagar(){
        System.out.println("Usted ha apagado esta computadora");
    }
}
