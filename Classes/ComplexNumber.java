package Classes;

public class ComplexNumber {
    private double a;

    private double b;

    public ComplexNumber(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public String toStringPlus()
    {
        return "z = " + getA() + " + i*" + getB();
    }

    public String toStringMinus()
    {
        return "z = " + getA() + " - i*" + (-getB());
    }
}