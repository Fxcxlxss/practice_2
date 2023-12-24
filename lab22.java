package lab2;
import java.util.Scanner;

public class lab22 {
    public static class Ball {
        double x = 0.0;
        double y = 0.0;

        public Ball(double x, double y) {
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

        public void setXY(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public void move(double xDisp, double yDisp) {
            this.x += xDisp;
            this.y += yDisp;
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    public static class Tester {
        public static void main(String[] args) {
            Ball k = new Ball(2.1, 3.3);
            k.move(4.4, 3.1);
            System.out.println(k.x + " " + k.y);
        }
    }
}