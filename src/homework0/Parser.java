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
			String[] result1 = line.split("//");
			String[] result2 = line.split("/+\\*");
			if(result1.length != 1)
			{
				System.out.println(result1[1]);
			}
			if (result2.length != 1)
			{
				String[] result3 = result2[1].split("\\*+/");
				System.out.println(result3[0]);
			}

		}//while
		
		bufferedReader.close();
	}

}
