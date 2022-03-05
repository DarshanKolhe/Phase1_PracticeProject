package program_project7_fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;  
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.*;

public class FileHandleDemo {
	
	 private static void createFileUsingFileClass() throws IOException
	    {
		 try{
	          File file = new File("c://FileHandling//Phase1 File.txt");
	  
	          //Create the file
	          if (file.createNewFile()){
	            System.out.println("File is created!");
	          }else{
	            System.out.println("File already exists.");
	          }
		 }
		 catch(IOException s)
		 {
			 System.out.println("s");
		 }
	    }
	 
	 private static void FileWrite() throws IOException
	 
	 {
		 try
		 {
			 FileWriter file=new FileWriter("c://FileHandling//Phase1 File.txt");    
			 try
			 {
			 file.write("Writing data to the file..!!");
			 }
			 finally
			 {
			 file.close();
			 }
			 System.out.println("Successfully Written..!! ");  
		  }
		 catch(IOException i)
		 {
		 System.out.println(i);
		 } 
	 }

	 
	 private static void FileReader() throws IOException
	 {
		 try
		 {
			 FileReader fr=new FileReader("c://FileHandling//Phase1 File.txt");    
			 try
			 {
				 int i;
				 while((i=fr.read())!=-1)
			 {
					 System.out.print((char)i);
			 }
			 }
			 finally
			 {
				 fr.close();
				 System.out.print("\n");
				 System.out.print("File Closed successfully.");
			 }  
		  }
		 catch(IOException e)
		 {
		 System.out.println("Exception handled..");
		 }
   }
	 
	 private static void AppendFile() throws IOException{
		 
		 String path = "c://FileHandling//Phase1 File.txt";
		 String text = " Currently doing training at Simplilearn";
		 try
		 {
		 FileWriter f = new FileWriter(path,true);
		 f.write(text);
		 f.close();
		 System.out.println("Append done Successfully..");
		 }
		 catch(IOException e){
		 System.out.println(e);
		 } 
	 }
	 

	public static void main(String[] args) throws IOException
	{
		FileHandleDemo myObj = new FileHandleDemo();
		Scanner input = new Scanner(System.in);
		System.out.println("Operations we can perform :\n1. create file\n2. Write\n3. Read\n4. Append");
		System.out.println("Enter your choice to perform operation :");
		int choice = input.nextInt();
		
		
		if(choice ==1){
			myObj.createFileUsingFileClass();
		}else if(choice ==2){
			myObj.FileWrite();
		}else if(choice ==3){
			myObj.FileReader();
		}else if (choice == 4){
			myObj.AppendFile();
		}else{
			System.out.println("You have choose wrong option");
		}
		
		
		
	}
}


