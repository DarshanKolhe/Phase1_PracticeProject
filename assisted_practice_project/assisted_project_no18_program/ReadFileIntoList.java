package assisted_project_no18_program;

import java.util.*; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.*; 
import java.io.*; 
public class ReadFileIntoList 
{ 
  public static List<String> readFileInList(String fileName) 
  { 
  
    List<String> lines = Collections.emptyList(); 
    try
    { 
      lines = 
       Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8); 
    } 
  
    catch (IOException e) 
    { 
      e.printStackTrace(); 
    } 
    return lines; 
  } 
  public static void main(String[] args) 
  { 
    List l = readFileInList("c://FileHandling//testFile2.txt"); 
  
    Iterator<String> itr = l.iterator(); 
    while (itr.hasNext()) 
      System.out.println(itr.next()); 
  } 
}

