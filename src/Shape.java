//Объем фигуры
public interface Shape extends Comparable<Shape> {

    double getShapeYardage();

    @Override
    default int compareTo(Shape other) {
        return Double.compare(getShapeYardage(), other.getShapeYardage());
    }
}
