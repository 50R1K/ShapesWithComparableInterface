//Тело вращения
abstract class BodyOfRevolution implements Shape {
    protected double radius;

    public BodyOfRevolution(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
