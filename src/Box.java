import java.util.ArrayList;

//Данный класс хранит в себе фигуры он имеет некоторый объем, который если превысить не даст создать новую фигуру
class Box implements Shape {
    private ArrayList<Shape> shapes = new ArrayList<>();
    private double available;
    private double volume;

    public Box(double available) {
        this.available = available;
        this.volume = available;
    }

    public boolean add(Shape shape) {
        if (available >= shape.getShapeYardage()) {
            shapes.add(shape);
            available -= shape.getShapeYardage();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getShapeYardage() {
        return volume;
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }
}