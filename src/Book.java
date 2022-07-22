import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;
/**
 * Book class with details for some books created using arraylist,linkedlist,hashmap to get the concepts
 */
public class Book {
    private int id;
    private String author,name;
    private int quantity;
    static int num=1;
    Book(String author,String name,int quantity) {
        this.author = author;
        this.name = name;
        this.quantity = quantity;
        id = num++;
    }
    /**
    *arraList method to show arraylist adding and removing elements functionalities,
    *removal based on index number
     */
    public void arrayList()
    {
        List<Book> list=new ArrayList<>();
        Book book1=new Book("Paulo","Alchemist",4);
        Book book2=new Book("Stephen covey","10 habits of successful people",8);
        Book book3=new Book("Stephen Hawkings","The Universe in a nutshell",8);
        list.add(book1);
        list.add(book2);
        list.add(book3);
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
    /**
    *hashMap method to create a hashmap and add book detail and here can't get the values of objects directly gets a reference
     */
    public void hashMap()
    {
        HashMap<Integer,Book> map=new HashMap<>();
        Book book1=new Book("Paulo","Alchemist",4);
        Book book2=new Book("Stephen covey","10 habits of successful people",8);
        Book book3=new Book("Stephen Hawkings","The Universe in a nutshell",8);
        map.put(1,book1);
        map.put(2,book2);
        map.put(3,book3);
        System.out.println("Iterating Hashmap");
        {
            for(Map.Entry<Integer,Book> m: map.entrySet())
            {
                System.out.println(m.getKey()+""+m.getValue());

            }
        }
    }
    /**
   * priorityQueue method to create a Queue ,adding values,peek() is for printing top element
   * poll()-printing top element and removing it from the container
    */
    public void priorityQueue()
    {
        Queue<String> priority=new PriorityQueue<>();
        priority.add("Supreme");
        priority.add("Health");
        priority.add("Relation");
        priority.add("Animals");
        priority.add("logic");
        priority.add("Education");
        priority.add("Job");
        priority.add("Security");
        priority.add("Money");
        System.out.println("Priority queue");
        System.out.println(priority);
        priority.remove("Money");
        System.out.println("After removal");
        System.out.println(priority);
        System.out.println(priority.peek());
        System.out.println(priority.poll());
        System.out.println(priority.peek());
    }
    /**
     * priorityBlockingQueue() method - processed based on priority,thread safe alternative of priority queue
     * Creating Queue adding values and removing it
     */
    public void priorityBlockingQueue()
    {
        Queue<Integer> blockingQueue=new PriorityBlockingQueue<>();
        blockingQueue.add(2);
        blockingQueue.add(9);
        blockingQueue.add(18);
        blockingQueue.add(89);
        System.out.println("Priority Blocking Queue");
        System.out.println(blockingQueue);
        System.out.println(blockingQueue.peek());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.peek());
    }

    /**
     *  linkedList() method - Creating linkedlist  adding values and removing it
     */
    public void linkedList()
    {
        Queue<Integer> list=new LinkedList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(11);
        list.add(13);
        System.out.println("Linked list");
        System.out.println(list);
        System.out.println(list.peek());
        System.out.println(list.poll());
        System.out.println(list.peek());
    }
    public static void main(String[] args)
    {
        Book book1=new Book("Paulo","Alchemist",4);
        book1.arrayList();
        Book book2=new Book("Paulo","Alchemist",4);
        book2.hashMap();
        Book book3=new Book("Paulo","Alchemist",4);
        book3.priorityQueue();
        Book book4=new Book("Paulo","Alchemist",4);
        book4.priorityBlockingQueue();
        Book book5=new Book("Paulo","Alchemist",4);
        book5.linkedList();
    }}
