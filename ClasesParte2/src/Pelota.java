public class Pelota {
    private double radioPelota;
    private String tipoPelota;
    private String marcaPelota;

    public Pelota(double radioPelota, String tipoPelota, String marcaPelota) {
        this.radioPelota = radioPelota;
        this.tipoPelota = tipoPelota;
        this.marcaPelota = marcaPelota;
    }

    public Pelota(double radioPelota, String tipoPelota) {
        this.radioPelota = radioPelota;
        this.tipoPelota = tipoPelota;
    }

    public double getRadioPelota() {
        return radioPelota;
    }

    public void setRadioPelota(double radioPelota) {
        this.radioPelota = radioPelota;
    }

    public String getTipoPelota() {
        return tipoPelota;
    }

    public void setTipoPelota(String tipoPelota) {
        this.tipoPelota = tipoPelota;
    }

    public String getMarcaPelota() {
        return marcaPelota;
    }

    public void setMarcaPelota(String marcaPelota) {
        this.marcaPelota = marcaPelota;
    }

    @Override
    public String toString() {
        return "Pelota{" +
                "radioPelota=" + radioPelota +
                ", tipoPelota='" + tipoPelota + '\'' +
                ", marcaPelota='" + marcaPelota + '\'' +
                '}';
    }
    public void rebotar(){
        System.out.println("Ha hecho rebotar a la pelota");
    }
    public void patear(){
        System.out.println("Ha pateado a la pelota");
    }
    public void ponchar(){
        System.out.println("Ha ponchado a la pelota :(");
    }
}
