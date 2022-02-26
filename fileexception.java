import java.util.Scanner;
import java.io.*;
class fileexception
{
    public static void main(String args[])
    {
  	System.out.println("Opening file..");
  	try
	{
  	    FileInputStream fin= new FileInputStream("test.txt");
  	    System.out.println("File opened");
  	}
  	catch(FileNotFoundException e)
  	{
   	    System.out.println(e);
  	} 
    }
}
