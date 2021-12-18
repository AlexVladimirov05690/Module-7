import java.util.Scanner;

public class Cuboid extends Figure implements Volume{

    private double width;
    private double length;
    private double height;
    String name = "Прямоугольный параллелепипед";

    public Cuboid(){

    }

    public Cuboid(double width, double length, double height) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    @Override
    public void setParametrs() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну: ");
        length = sc.nextDouble();
        System.out.println("Введите ширину: ");
        width = sc.nextDouble();
        System.out.println("Введите высоту: ");
        height = sc.nextDouble();
    }

    @Override
    public double square() {
        return 2*(length * width + width * height + length * height);
    }

    @Override
    public double volume() {
        return length * width * height;
    }
}
