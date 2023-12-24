package lab2;

public class lab23 {
    public static class Point {
        double x;
        double y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

        public void move (int x1, int y1) {
            this.x += x1;
            this.y += y1;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    public static class Circle extends Point {
        Point center;
        double radius;

        public Circle(int x, int y, Point center, double radius) {
            super(x, y);
            this.center = center;
            this.radius = radius;
        }

        public Point getCenter() {
            return center;
        }

        public void setCenter(Point center) {
            this.center = center;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public void move (int x, int y, int r) {
            center.move(x, y);
            this.radius += r;
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "center=" + center +
                    ", radius=" + radius +
                    ", x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    public static class Tester {
        public static void main(String[] args){
            Point dot = new Point(3, 4);
            Circle circle = new Circle(4, 3, dot, 4);
            System.out.println(circle);
            circle.move(2, 3, 4);
            System.out.println(circle);
        }
    }
}
