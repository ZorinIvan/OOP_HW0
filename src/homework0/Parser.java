package homework0;

import java.io.*;
import java.util.*;
import java.lang.String;

public class Parser {


	public static void main(String[] args) throws IOException{ 

		String fileName = getInput();
		if(fileName == null)
		{
			return;
		}
		try{
	
			BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
			String line;
			
			while((line= bufferedReader.readLine()) != null)
			{
				String[] result1 = line.split("//");
				String[] result2 = line.split("/+\\*");
				if(result1.length != 1)
				{
					System.out.println(result1[1]);
				}
				if (result2.length != 1) // found /*
				{
					while((line= bufferedReader.readLine()) != null)
					{
						String[] result3 = result2[1].split("\\*+/");
						if (result3.length != 1)
						{
							System.out.println(result3[0]);
						}
						System.out.println(line);
					}

				}
	
			}//while
			
			bufferedReader.close();
		} catch (FileNotFoundException fileNotFound){
			 System.err.println("Error. File \"" + fileName + "\" not found" );
		}
	}
	

	/**
	 * @return file name if input is valid
	 * otherwise returns null
	 */
	public static String getInput (){
		Scanner console = new Scanner(System.in);
		Scanner lineTokenizer = new Scanner(console.nextLine());
		String fileName = lineTokenizer.next();
		
		if(lineTokenizer.hasNext())
		{
			System.err.println("Error. Wrong number of arguments" );
			console.close();
			lineTokenizer.close();
			return null;
		}
		console.close();
		lineTokenizer.close();
		return fileName;
	}

}
