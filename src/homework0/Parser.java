package homework0;

import java.io.*;
import java.util.*;
import java.lang.String;

public class Parser {


	public static void main(String[] args) throws FileNotFoundException, IOException{ 
		Scanner scanner = new Scanner(System.in);
		String fileName = scanner.next();
		scanner.close();
		
		//FileReader fr = new FileReader(fileName);
		BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
		String line = bufferedReader.readLine();
		while(line != null)
		{
			String delims = "//";
			StringTokenizer st1 = new StringTokenizer(line, delims);
			if(st1.hasMoreElements())
			{
				System.out.println(st1.nextElement());
			}
			else 
			{
				System.out.println(st1);
			}
			
			StringTokenizer st2 = new StringTokenizer(line, "/*");
			if(st2.hasMoreElements())
			{
				System.out.println(st1.nextToken("*/"));
			}
			
		}
		
		bufferedReader.close();
	}

}
