import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;
/*
Book class with details for some books created using arraylist,linkedlist,hashmap to get the concepts
* */
public class Book {
    int id;
    String author,name;
    int quantity;
    static int num=1;
    Book(String author,String name,int quantity) {
        this.author = author;
        this.name = name;
        this.quantity = quantity;
        id = num++;
    }
    /*
    arraList method to show arraylist adding and removing elements functionalities,
    removal based on index number
     */
    public void arrayList()
    {
        List<Book> list=new ArrayList<Book>();
        Book b1=new Book("Paulo","Alchemist",4);
        Book b2=new Book("Stephen covey","10 habits of successful people",8);
        Book b3=new Book("Stephen Hawkings","The Universe in a nutshell",8);
        list.add(b1);
        list.add(b2);
        list.add(b3);
        for(Book b:list)
        {
            System.out.println("Name: "+b.name+" ,Author: "+b.author+" ,Quantity: "+quantity);
        }
list.remove(0);
        System.out.println("After removal");
        for(Book b:list)
        {
            System.out.println("Name: "+b.name+" ,Author: "+b.author+" ,Quantity: "+quantity);
        }
    }
    /*
    hashMap method to create a
    hashmap and add book details
    and here can't get the values of objects directly gets a reference
     */
    public void hashMap()
    {
        HashMap<Integer,Book> map=new HashMap<Integer,Book>();
        Book b1=new Book("Paulo","Alchemist",4);
        Book b2=new Book("Stephen covey","10 habits of successful people",8);
        Book b3=new Book("Stephen Hawkings","The Universe in a nutshell",8);
        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);
        System.out.println("Iterating Hashmap");
        {
            for(Map.Entry<Integer,Book> m: map.entrySet())
            {
                System.out.println(m.getKey()+""+m.getValue());

            }
        }
    }
    /*
    priorityQueue method to create a Queue ,adding values,
    peek() is for printing top element
    poll()-printing top element and removing it from the container
    **/
    public void priorityQueue()
    {
        Queue<String> pq=new PriorityQueue<>();
        pq.add("Supreme");
        pq.add("Health");
        pq.add("Relation");
        pq.add("Animals");
        pq.add("logic");
        pq.add("Education");
        pq.add("Job");
        pq.add("Security");
        pq.add("Money");
        System.out.println("Priority queue");
        System.out.println(pq);
        pq.remove("Money");
        System.out.println("After removal");
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());
    }
    /*
    priorityBlockingQueue() method - processed based on priority,thread safe alternative
    of priority queue
    Creating Queue adding values and removing it
     */
    public void priorityBlockingQueue()
    {
        Queue<Integer> pbq=new PriorityBlockingQueue<>();
        pbq.add(2);
        pbq.add(9);
        pbq.add(18);
        pbq.add(89);
        System.out.println("Priority Blocking Queue");
        System.out.println(pbq);
        System.out.println(pbq.peek());
        System.out.println(pbq.poll());
        System.out.println(pbq.peek());
    }
    /*
    linkedList() method - Creating linkedlist  adding values and removing it
     */
    public void linkedList()
    {
        Queue<Integer> lst=new LinkedList<>();
        lst.add(2);
        lst.add(3);
        lst.add(5);
        lst.add(7);
        lst.add(11);
        lst.add(13);
        System.out.println("Linked list");
        System.out.println(lst);
        System.out.println(lst.peek());
        System.out.println(lst.poll());
        System.out.println(lst.peek());
    }
    public static void main(String args[])
    {
Book obj1=new Book("Paulo","Alchemist",4);
     obj1.arrayList();
        Book obj2=new Book("Paulo","Alchemist",4);
        obj2.hashMap();
        Book obj3=new Book("Paulo","Alchemist",4);
        obj3.priorityQueue();
        Book obj4=new Book("Paulo","Alchemist",4);
        obj4.priorityBlockingQueue();
        Book obj5=new Book("Paulo","Alchemist",4);
        obj5.linkedList();
    }}
