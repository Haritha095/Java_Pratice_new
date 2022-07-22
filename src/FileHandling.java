import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * FileHandling class is to show how to create,write and read file
 */
public class FileHandling
{
    /**
     * create() method is to create a file
     */
    public void create()
    {
        try
        {
            File file1 = new File("hari.txt");
            if (file1.createNewFile())
            {
                System.out.println("File created: "+ file1.getName());
            }
            else {
                System.out.println("File with this name already exists.");
            }
        }
        catch (IOException e) {
            System.out.println("An error");
            e.printStackTrace();
        }
    }

    /**
     * write() method is to write into a file
     */
    public void write()
    {
        try {
            FileWriter writer = new FileWriter("hari.txt");
            writer.write("Trust Nature");
            writer.close();
            System.out.println("Success");
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
    }
}
    /**
     * read() method is to read from a file using Scanner class
     */
    public void read()
    {
        try {
            File reader = new File("hari.txt");
            Scanner Reader = new Scanner(reader);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
    /**
     * fileInformation() method is to get file related information
     */
    public void fileInformation()
    {
        File file2 = new File("hari.txt");
        if (file2.exists()) {
            System.out.println("File name " + file2.getName());
            System.out.println("Absolute path " + file2.getAbsolutePath());
            System.out.println("Writeable " + file2.canWrite());
            System.out.println("Readable " + file2.canRead());
            System.out.println("File size " + file2.length());
        } else {
            System.out.println("The file does not exist.");
    }}
    public static void main(String args[])
    {
        FileHandling fileHandle=new FileHandling();
        fileHandle.create();
        fileHandle.write();
        fileHandle.read();
        fileHandle.fileInformation();

    }
}