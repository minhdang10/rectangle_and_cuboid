public class Cuboid extends Rectangle {
    public double height = 0;


    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        double volume = getArea() * height;
        return volume;
    }
}