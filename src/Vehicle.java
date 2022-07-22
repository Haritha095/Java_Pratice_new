/**
 * Vehicle class extending Cars class where overloading concept explained
 */
public class Vehicle extends Cars {

    Vehicle(String carName, String brand, String color, double price, int extraCharge)
    {
        super(carName, brand, color, price, extraCharge);
    }
    protected void finalCostPrice(int price)
    {
        double sum=price+85000;
        int sumNew=(int)sum;
        System.out.println("Final amount you have to pay"+sumNew);

    }
    public static void main(String args[])
    {
        Vehicle vehicle1=new Vehicle("Sonet","Kia","Red",1300000,7000);
        vehicle1.finalCostPrice(1300000,7000);

    }
}
