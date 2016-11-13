package homework0;

import java.io.*;
import java.util.*;
import java.lang.String;

public class Parser {

 /*test*/
	public static void main(String[] args) throws IOException{ 
		Scanner console = new Scanner(System.in);
		Scanner lineTokenizer = new Scanner(console.nextLine());
		String fileName = lineTokenizer.next();
		if(lineTokenizer.hasNext())
		{
			System.err.println("Error. Wrong number of arguments" );
			console.close();
			lineTokenizer.close();
			return;
		}
		console.close();
		lineTokenizer.close();
		
		try{
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
		} catch (FileNotFoundException fileNotFound){
			 System.err.println("Error. File \"" + fileName + "\" not found" );
		}
	}

}
