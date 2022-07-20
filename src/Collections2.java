import java.util.*;
/**
 *Collection class used to show method to show hashMap,hashset creation
 */
class Collection {
    /**
     * hashMap method to show how to create hashmap,adding values and keys and iterating.
     * duplicate keys allowed here but won't be printed
     */
    public void hashMap()
    {
        HashMap<Integer,String> m1=new HashMap<Integer,String>();
        m1.put(2,"student");
        m1.put(4,"teacher");
        m1.put(6,"Universe");
        m1.put(8,"Potential");
        m1.put(8,"Potential");
        System.out.println("Iteration through");
        for(Map.Entry m:m1.entrySet())
        {
            System.out.println(m.getKey()+""+m.getValue());
        }
        m1.putIfAbsent(10,"Hope");
        System.out.println("Printing after put statement");
        for(Map.Entry m:m1.entrySet())
        {
            System.out.println(m.getKey()+""+m.getValue());
        }
        m1.remove(2);
        System.out.println("after removal");
        for(Map.Entry m:m1.entrySet())
        {
            System.out.println(m.getKey()+""+m.getValue());
        }
        m1.replace(4,"teacher","doctor");
        System.out.println("After replacement");
        for(Map.Entry m:m1.entrySet())
        {
            System.out.println(m.getKey()+""+m.getValue());
        }


    }
    /**
     * hashset method used to create hashset ,added values to it and no duplicate elements here,won't be displayed
     **/
    public void hashSet()
    {
        HashSet<String> hs=new HashSet<String>();
        hs.add("Hari");
        hs.add("Mittu");//adding elements
        hs.add("luttu");
        hs.add("luttu");
        Iterator<String> itr=hs.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());

        }

    }
    public static void main(String args[])
    {
        Collection collection1=new Collection();
        collection1.hashMap();
        Collection collection2=new Collection();
        collection2.hashSet();
    }
}
