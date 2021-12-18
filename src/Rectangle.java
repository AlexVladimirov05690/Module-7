import java.util.Scanner;

public class Rectangle extends Figure {
    private double width;
    private double length;
    String name = "Прямоугольник";


    public Rectangle(){
    }

    public Rectangle(double width, double length) {
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

    }

    @Override
    public double square() {
        square = width * length;
        return square;
    }
}