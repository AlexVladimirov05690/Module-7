import java.util.Scanner;

public class Ball extends Figure implements Volume{
    private double radius;
    String name = "Шар";


    public Ball(){

    }

    public Ball(double radius) {
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
        return  4 * Math.PI * radius * radius * radius;
    }

    @Override
    public double volume() {
        return (4 * Math.PI * radius * radius * radius) / 3;
    }
}
