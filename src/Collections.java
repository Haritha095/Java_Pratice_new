import java.util.*;
/*
Collections is a class used here to show the functionalities of array and arraylist
 * */
public class Collections
{
 public void array1() {
        int arr[][] = {{1, 2, 3}, {2, 4, 5}, {4, 4, 5}};
        // int[][] arr=new int[4][8];
        for (int k = 0; k< 3; k++) {
            for (int l = 0; l < 3; l++) {
                System.out.print(arr[k][l] + " ");
            }
            System.out.println();
        }
    }
 public void array2(){
        int arr[]={1,2,3,3,4,7};
        for(int i=0;i<arr.length;i++)
        {

        }
        System.out.println("4th index vale:" +arr[4]);
    }
    /*
    arraylist method used to show the creation of arraylist and adding values to it and
    traversing through the arraylist using iterator which is iterator ,checking till itr has next
     */
public void arrayList()
{
    ArrayList<String> lst =new ArrayList<String>();
    lst.add("hari");
    lst.add("arjun");
    lst.add("aji");
    Iterator itr=lst.iterator();
    while(itr.hasNext())
    {
        System.out.println(itr.next());//printing through the itr and moving
    }
}
/*
arraList2 created another method used to get the element with indesx number
 **/
public void arrayList2()
{
    ArrayList<String> lst1=new ArrayList<String>();
    lst1.add("bubbles");
    lst1.add("buttercup");
    lst1.add("blossom");
    System.out.println("1st element: "+lst1.get(0));
    lst1.set(0,"powerpuff");
    for(String girls:lst1)
    {
        System.out.println(girls);
    }
}

    public static void main(String args[]) {
Collections obj=new Collections();
obj.array1();
Collections obj1=new Collections();
obj1.array2();
Collections obj3=new Collections();
obj3.arrayList();
Collections obj4=new Collections();
obj4.arrayList2();

    }}