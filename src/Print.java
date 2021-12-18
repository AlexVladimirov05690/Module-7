public class Print {
    String name;
    double square;
    double volume;

    public void printSquare(String name, double square){
        System.out.println(name + ". Площадь равна: " + square );
    }

    public void printSquareVolume(String name, double square, double volume) {
        System.out.println(name + ". Площадь поверхности равна: " + square + " Объём данной фигуры равен: " + volume);
    }
}
