public class Vehicle extends Cars {

    Vehicle(String carname, String brand, String color, double price, int extracharge)
    {
        super(carname, brand, color, price, extracharge);
    }
    protected void finalCostPrice(int price)
    {
        double sum=price+85000;
        int sumnew=(int)sum;
        System.out.println("Final amount you have to pay"+sumnew);

    }
    public static void main(String args[])
    {
        Vehicle obj=new Vehicle("Sonet","Kia","Red",1300000,7000);
        obj.finalCostPrice(1300000,7000);

    }
}
