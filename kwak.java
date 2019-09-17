import java.io.*;
import java.util.*;
public class kwak {
    
    public static void main(String[] args) throws Exception {
    	Scanner toy = new Scanner(System.in);
    	System.out.print("Enter your file Name: ");
    	String filename = toy.next();
    	String FileName = "C:\\Users\\Complab502-PC43\\Documents\\JCreator LE\\MyProjects\\totoy\\src\\" + filename +".txt";
    	
    	RandomAccessFile file = new RandomAccessFile(FileName, "r");
    	String pwet = file.readLine();
    	System.out.println("");
    	System.out.println("Text inside the file: ");
    	System.out.println(pwet);
    	

 
    }
}
