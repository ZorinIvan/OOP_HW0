package homework0;

import java.io.*;
import java.util.*;
import java.lang.String;

public class Parser {


	public static void main(String[] args) throws IOException{ 
		Scanner scanner = new Scanner(System.in);
		String fileName = scanner.next();
		scanner.close();
		
		FileReader fr = new FileReader(fileName);
		BufferedReader bufferedReader = new BufferedReader(fr);
		String line;
		
		while((line= bufferedReader.readLine()) != null)
		{
			String[] result = line.split("//");
			if(result.)
			System.out.println(result[1]);
		}//while
		
		bufferedReader.close();
	}

}
