import java.util.Scanner;

public class Circle extends Figure {
    private double radius;
    String name = "Круг";

    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public void setParametrs() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус ");
        radius = sc.nextDouble();
    }

    @Override
    public double square() {
        return Math.PI * radius * radius;
    }
}
