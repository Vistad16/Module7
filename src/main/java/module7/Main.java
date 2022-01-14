package module7;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape trapezoid = new Trapezoid();
        Shape rhombus = new Rhombus();
        Shape quad = new Quad();


        circle.figureShape();
        triangle.figureShape();
        trapezoid.figureShape();
        rhombus.figureShape();
        quad.figureShape();
    }
}
