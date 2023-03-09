public class Pais {
    private String nombrePais;
    private String monedaPais;
    private String continentePais;

    public Pais(String nombrePais, String monedaPais, String continentePais) {
        this.nombrePais = nombrePais;
        this.monedaPais = monedaPais;
        this.continentePais = continentePais;
    }
    public Pais(String nombrePais, String monedaPais) {
        this.nombrePais = nombrePais;
        this.monedaPais = monedaPais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getMonedaPais() {
        return monedaPais;
    }

    public void setMonedaPais(String monedaPais) {
        this.monedaPais = monedaPais;
    }

    public String getContinentePais() {
        return continentePais;
    }

    public void setContinentePais(String continentePais) {
        this.continentePais = continentePais;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombrePais='" + nombrePais + '\'' +
                ", monedaPais='" + monedaPais + '\'' +
                ", continentePais='" + continentePais + '\'' +
                '}';
    }

    public void atacar(){
        System.out.println("Has atacado a " + nombrePais);
    }
    public void ayudar(){
        System.out.println("Has aportado ayuda a " + nombrePais);
    }

}
