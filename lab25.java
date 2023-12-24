package lab2;
import java.util.ArrayList;
import java.util.Scanner;

public class lab25 {
    public static class Dog {
        int age;
        String name;

        public Dog(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int humanage () {
            return this.age * 7;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static class Kennel {
        ArrayList<Dog> kennel = new ArrayList<>();

        public Kennel(ArrayList<Dog> kennel) {
            this.kennel = kennel;
        }

        public ArrayList<Dog> getKennel() {
            return kennel;
        }
    }

    public static void main(String[] arsg) {
        ArrayList<Dog> k = new ArrayList<>();
        Kennel k1 = new Kennel(k);
        Scanner sc = new Scanner(System.in);

        Dog d1 = new Dog(5, "dog1");
        Dog d2 = new Dog(7, "dog2");

        k.add(d1);
        k.add(d2);

        System.out.println(k);
        System.out.println(d1.humanage());
    }
}
