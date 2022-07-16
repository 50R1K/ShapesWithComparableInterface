public class Ball extends BodyOfRevolution {

    public Ball(double radius) {
        super(radius);
    }

    //Площадь шара
    @Override
    public double getShapeYardage() {
        return Math.PI * Math.pow(radius, 3) * 4 / 3;
    }
}
