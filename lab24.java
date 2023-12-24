package lab2;
import java.util.ArrayList;

public class lab24 {
    public static class Computer {
        String model;
        double price;

        public Computer(String model, double price) {
            this.model = model;
            this.price = price;
        }

        public String getModel() {
            return model;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Computer{" +
                    "model='" + model + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    public static class Shop {
        ArrayList<Computer> pcs = new ArrayList<>();

        public void addPc (Computer computer) {
            pcs.add(computer);
        }

        public void removePc (Computer computer) {
            pcs.remove(computer);
        }

        public boolean findPc(String model) {
            for (Computer computer : pcs) {
                if (computer.getModel().equals(model))
                    return true;
            }
            return false;
        }

        public Shop(ArrayList<Computer> pcs) {
            this.pcs = pcs;
        }

        public ArrayList<Computer> getPcs() {
            return pcs;
        }

        @Override
        public String toString() {
            return "Shop{" +
                    "pcs=" + pcs +
                    '}';
        }
    }

    public static class Test {
        public static void main(String[] args) {
            Computer pc1 = new Computer("asus_tuf_dash_f15_fx517zc-hn098", 900);
            Computer pc2 = new Computer("msi_gf63_thin_11uc-1215nl", 899);

            ArrayList<Computer> plist = new ArrayList<>();
            Shop m3ga = new Shop(plist);

            m3ga.addPc(pc1);
            m3ga.addPc(pc2);

            System.out.println(m3ga);
            System.out.println(m3ga.findPc("asus_tuf_dash_f15_fx517zc-hn098"));

            m3ga.removePc(pc1);

            System.out.println(m3ga.findPc("asus_tuf_dash_f15_fx517zc-hn098"));
        }
    }
}
