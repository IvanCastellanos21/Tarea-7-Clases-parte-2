public class Lampara {
    private String tipo;
    private int rendimiento;
    private int irc;

    public Lampara(String tipo, int rendimiento, int irc) {
        this.tipo = tipo;
        this.rendimiento = rendimiento;
        this.irc = irc;
    }

    public Lampara(String tipo, int rendimiento) {
        this.tipo = tipo;
        this.rendimiento = rendimiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(int rendimiento) {
        this.rendimiento = rendimiento;
    }

    public int getIrc() {
        return irc;
    }

    public void setIrc(int irc) {
        this.irc = irc;
    }

    @Override
    public String toString() {
        return "Lampara{" +
                "tipo='" + tipo + '\'' +
                ", rendimiento=" + rendimiento +
                ", irc=" + irc +
                '}';
    }

    public void encenderLampara(){
        System.out.println("Lampara encendida");
    }
    public void apagarLampara(){
        System.out.println("Lampara apagada");
    }

}
