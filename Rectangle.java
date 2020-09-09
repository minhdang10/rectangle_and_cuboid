public class Rectangle {
  public double width = 0;
  public double length = 0;


  public Rectangle(double width, double length) {
    this.width = width;
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public double getLength() {
    return length;
  }

  public double getArea() {
    double area = width * length;
    return area;
  }
}