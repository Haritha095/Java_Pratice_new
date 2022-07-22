/**
 * Cars class used to show the new price of a car with inheritance concept
 */
public class Cars {
    String carName, brand;
    int carId;
    double price;
    static int id = 1;
    private String color;
    private int extraCharge;

    Cars(String carName, String brand, String color, double price, int extraCharge) {
        this.carName = carName;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.extraCharge = extraCharge;
        carId = id++;

    }
/**
 * finalCostPrice method to calculate the finalcost of the car
 */
    protected void finalCostPrice(int price, int extraCharge)
    {
        double gst = 85000;
        double sum = price + extraCharge + gst;
        int sumNew = (int) sum;
        System.out.println("Final cost for this brandnew Car: " + sum);
        System.out.println("You have to just pay: "+sumNew);
    }
}
