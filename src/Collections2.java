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
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(2,"student");
        map.put(4,"teacher");
        map.put(6,"Universe");
        map.put(8,"Potential");
        map.put(8,"Potential");
        System.out.println("Iteration through");
        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+""+m.getValue());
        }
        map.putIfAbsent(10,"Hope");
        System.out.println("Printing after put statement");
        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+""+m.getValue());
        }
        map.remove(2);
        System.out.println("after removal");
        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+""+m.getValue());
        }
        map.replace(4,"teacher","doctor");
        System.out.println("After replacement");
        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+""+m.getValue());
        }


    }
    /**
     * hashset method used to create hashset ,added values to it and no duplicate elements here,won't be displayed
     **/
    public void hashSet()
    {
        HashSet<String> set=new HashSet<String>();
        set.add("Hari");
        set.add("Mittu");//adding elements
        set.add("luttu");
        set.add("luttu");
        Iterator<String> itr=set.iterator();
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
