import java.util.*;
/**
 * Collections is a class used here to show the functionalities of array and arraylist
*/
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
    /**
     *  arraylist method used to show the creation of arraylist and adding values to it and
     *  traversing through the arraylist using iterator
     */
public void arrayList()
{
    ArrayList<String> list =new ArrayList<String>();
    list.add("hari");
    list.add("arjun");
    list.add("aji");
    Iterator itr=list.iterator();
    while(itr.hasNext())
    {
        System.out.println(itr.next());//printing through the itr and moving
    }
}
/**
 * arraList2 created another method used to get the element with index number
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
Collections collection2=new Collections();
        collection2.array1();
Collections collection3=new Collections();
        collection3.array2();
Collections collection4=new Collections();
        collection4.arrayList();
Collections collection5=new Collections();
collection5.arrayList2();

    }}