public class Cars {
    String carname, brand;
    int carid;
    double price;
    static int id = 1;
    String color;
    int extracharge;

    Cars(String carname, String brand, String color, double price, int extracharge) {
        this.carname = carname;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.extracharge = extracharge;
        carid = id++;

    }

    protected void finalCostPrice(int price, int extracharge)
    {
        double gst = 85000;
        double sum = price + extracharge + gst;
        int sumnew = (int) sum;
        System.out.println("Final cost for this brandnew Car: " + sum);
        System.out.println("You have to just pay: "+sumnew);

    }
}


