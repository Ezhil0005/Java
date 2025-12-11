import java.io.*;
public class Filewriter {
    public static void main (String[]args)
    {
        try{
        FileWriter obj=new FileWriter("lokesh.java");
        obj.write("Hello");
        obj.close();
        System.out.println("sucess");
        }
        catch(IOException e)
        {
            System.out.println("error");
        }
    }
}
