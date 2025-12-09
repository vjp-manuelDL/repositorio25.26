package repaso_12;

/**
 *
 * @author Admin
 */
public class Triangulo {

    private double cateto1;
    private double cateto2;

    public Triangulo() {
        cateto1 = 0;
        cateto2 = 0;
    }

    public Triangulo(double c1, double c2) {
        cateto1 = c1;
        cateto2 = c2;
    }

    public double getCateto1() {
        return cateto1;
    }

    public double getCateto2() {
        return cateto2;
    }

    public void setCateto1(double c1) {
        this.cateto1 = c1;
    }

    public void setCateto2(double c2) {
        this.cateto2 = c2;
    }
}
