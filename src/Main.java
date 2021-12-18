public class Main {
    public static void main(String[] args) {
        Print print = new Print();
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(4,5);
        rectangle.setParametrs();
        print.printSquare(rectangle.name, rectangle.square());
        print.printSquare(rectangle1.name, rectangle1.square());
        Cuboid cuboid = new Cuboid();
        cuboid.setParametrs();
        Cuboid cuboid1 = new Cuboid(5,2,5);
        print.printSquareVolume(cuboid.name, cuboid.square(), cuboid.volume());
        print.printSquareVolume(cuboid1.name, cuboid1.square(), cuboid1.volume());
        Circle circle = new Circle();
        circle.setParametrs();
        Circle circle1 = new Circle(43);
        print.printSquare(circle.name, circle.square());
        print.printSquare(circle1.name, circle1.square());
        Ball ball = new Ball();
        ball.setParametrs();
        Ball ball1 = new Ball(32);
        print.printSquareVolume(ball.name, ball.square(), ball.volume());
        print.printSquareVolume(ball1.name, ball1.square(), ball1.volume());


    }
}
