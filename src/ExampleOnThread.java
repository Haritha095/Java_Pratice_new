/**
 * ExampleOnThread is a class that implements Runnable interface used to show multithreading and ovverride run() method
*/
public class ExampleOnThread implements Runnable
{

    /**
     * currentThread()-inbuilt method that returns the currently executing thread and getID()-returns the thread id
     */
    public void run() {
        try {
            System.out.println("thread" + Thread.currentThread().getId() + " is running");

        } catch (Exception E) {
            System.out.println("Caught Exception");
        }}
    /**
     *  In the main method run() method being called with start() obj is the object instantitated thread object
     */
    public static void main (String args[])
    {
        int number = 9;
        for (int i = 0; i < number; i++) {
            Thread thread = new Thread(new ExampleOnThread());
            thread.start();
        }
    }

}