import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\daman\\IdeaProjects\\Assignment1dianochka\\src\\source.txt"));
            Point[] points = new Point[10];
            for (int i = 0; i < 10; i++) {
                double x = scanner.nextDouble();
                double y = scanner.nextDouble();
                points[i] = new Point(x, y);
            }
            scanner.close();
            Shape shape = new Shape(points);
            System.out.println("Perimeter: " + shape.perimeter());
            System.out.println("Longest Side: " + shape.longestSide());
            System.out.println("Average Side: " + shape.averageSide());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}