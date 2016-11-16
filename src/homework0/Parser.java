package homework0;

import java.io.*;
import java.util.*;
import java.lang.String;

public class Parser {

	/**
	 * @requires file name (command line argument). example: test.txt
	 * @modifies 
	 * @effects print all comments from input file
	 */
	public static void main(String[] args) throws IOException{ 

		if(args.length != 1) //check input
		{
			System.err.println("Error. Wrong number of arguments" );
			return;
		}
		
		String fileName = args[0];

		try{
	
			BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName)); //read input file
			String line;
			int flag = 0;
			
			while((line= bufferedReader.readLine()) != null) //parse the input file
			{
				String[] result1 = line.split("//");
				String[] result2 = line.split("/+\\*");
				
				if(flag == 1)//we have /* in previous line
				{
					if(line.contains("*/"))
					{
						String[] tmpString = line.split("\\*+/");
						System.out.println(tmpString[0]);
						flag = 0;
						continue;
					}

					//System.out.println("tmpString length " + tmpString.length);
					System.out.println(line);
				}//if(flag == 1)
				
				if(result1.length != 1)//found //
				{
					System.out.println(result1[1]);
				}
				
				if (result2.length != 1 && flag!=1) // found /*
				{
					String[] tmpString = result2[1].split("\\*+/");//found */ on the same line. 
					if(tmpString.length != 1)
					{
						System.out.println(tmpString[0]);
						flag = 0;
						continue;
					}
					
					System.out.println(result2[1]);
					flag = 1;
					continue;

				}
	
			}//while
			
			bufferedReader.close();
			
		} catch (FileNotFoundException fileNotFound){
			 System.err.println("Error. File \"" + fileName + "\" not found" );
		}
	}

}
