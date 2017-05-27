/**
 * Created by Иван on 27.05.2017.
 */
public class RightTriangle {

    public double a;
    public double b;
    public double c;

    RightTriangle() {
        a = 3;
        b = 4;
        c = 5;
    }

    RightTriangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String check() {
        double a2 = Math.pow(a, 2);
        double b2 = Math.pow(b, 2);
        double c2 = Math.pow(c, 2);
        if ((a2 + b2 == c2) || (a2 + c2 == b2) || (b2 + c2 == a2)) {
            return ("Triangle with sides " + a + ", " + b + " and " + c + " is a right-angled triangle");
        } else {
            return ("Triangle with sides " + a + ", " + b + " and " + c + " is NOT a right-angled triangle! Hate it!");
        }
    }
}