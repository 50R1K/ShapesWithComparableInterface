class Cylinder extends BodyOfRevolution{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    @Override
    public double getShapeYardage() {
        return Math.PI * radius * radius * height;
    }
}
