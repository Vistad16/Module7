package JavaCore.Module7;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape trapezoid = new Trapezoid();
        Shape rhombus = new Rhombus();
        Shape quad = new Quad();

        circle.figureName();
        triangle.figureName();
        trapezoid.figureName();
        rhombus.figureName();
        quad.figureName();
    }
}
