import java.awt.*;
import java.util.ArrayList;

public class CuboRubik {
    private String Tamaño;



    private Color colorCara1;
    private Color colorCara2;
    private Color colorCara3;
    private Color colorCara4;
    private Color colorCara5;
    private Color colorCara6;

    public CuboRubik(String tamaño) {
        Tamaño = tamaño;
    }
    public CuboRubik(String tamaño, Color colorCara1, Color colorCara2, Color colorCara3, Color colorCara4, Color colorCara5, Color colorCara6) {
        Tamaño = tamaño;
        this.colorCara1 = colorCara1;
        this.colorCara2 = colorCara2;
        this.colorCara3 = colorCara3;
        this.colorCara4 = colorCara4;
        this.colorCara5 = colorCara5;
        this.colorCara6 = colorCara6;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String tamaño) {
        ArrayList<String> tamaños = new ArrayList<>();
        tamaños.add("3*3*3");
        tamaños.add("4*4*4");
        tamaños.add("5*5*5");
    }

    public Color getColorCara1() {
        return colorCara1;
    }

    public void setColorCara1(Color colorCara1) {
        this.colorCara1 = colorCara1;
    }

    public Color getColorCara2() {
        return colorCara2;
    }

    public void setColorCara2(Color colorCara2) {
        this.colorCara2 = colorCara2;
    }

    public Color getColorCara3() {
        return colorCara3;
    }

    public void setColorCara3(Color colorCara3) {
        this.colorCara3 = colorCara3;
    }

    public Color getColorCara4() {
        return colorCara4;
    }

    public void setColorCara4(Color colorCara4) {
        this.colorCara4 = colorCara4;
    }

    public Color getColorCara5() {
        return colorCara5;
    }

    public void setColorCara5(Color colorCara5) {
        this.colorCara5 = colorCara5;
    }

    public Color getColorCara6() {
        return colorCara6;
    }

    public void setColorCara6(Color colorCara6) {
        this.colorCara6 = colorCara6;
    }

    public void rotar(){
        System.out.println("Ha rotado un lado del cubo");
    }
    public void desacomodar(){
        System.out.println("Ha desacomodado al cubo");
    }

}
