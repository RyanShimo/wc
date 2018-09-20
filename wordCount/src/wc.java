/*
	Name: Ryan Shimozaki
	Date: 9/23/18
	What it does: prints out the word count, character count, and/or line count of any number of files
*/

import java.io.*;
public class wc 
{
	public static void main (String []args) throws FileNotFoundException
	{
		
		if(args.length>=1 && args[0].equals("wc"))
		{
			if(args.length==1)
			{
				System.out.print("Description: The wc utility displays the number of lines, words,\n"
						+ "and/or characters contained in each input file. \n" + 
					"  The following options are: \n" + 
					"	wc -l [file ...]	The number of lines in a file\n" + 
					"	wc -w [file ...]	The number of characters in a file\n" + 
					"	wc -c [file ...]	The number of words in a file\n" + 
					"	wc [file ...]		The number of lines, characters and words in a file");
			}
			 
			else if(args.length>3 && (args[1].equals("-l") || args[1].equals("-w") || args[1].equals("-c")))	
			{
				File documentOne = new File(args[2]);
				int numFiles=2;
				while(documentOne.exists()) //continues till there are no more files to read through
				{
					//enter method accepting args[1] and filename
					numFiles++;
					documentOne = new File(args[numFiles]);
				}
			}
			
			else 
			{
				File documentTwo = new File(args[1]);
				if(documentTwo.exists())
				{
					int numFiles=1;
					while(documentTwo.exists())
					{
						//enter method accepting filename
						numFiles++;
						documentTwo = new File(args[numFiles]);
					}
				}
			}
		}
	}

	
	//method accepts filename	prints l, w, and c 
	public static int[] allCounts(String file)
	{
		int l = lineCount(file);
		int w = wordCount(file);
		int c = characterCount(file);
		int[] counts = {l, w, c};
		return counts;
	}
	//method accepts args[1] and filename 	continues to respected -l, -w, or -c
	public static int parentCount(String whichCount, String file)
	{
		if(whichCount.equals("-l"))
			return lineCount(file);
		else if(whichCount.equals("-l"))
			return wordCount(file);
		else if(whichCount.equals("-l"))
			return characterCount(file);
		return 0;
	}
	//method accepts filename	prints line count
	public static int lineCount(String file)
	{
		
	}
	//method accepts filename	prints word count
	public static int wordCount(String file)
	{
		
	}
	//method accepts filename	prints character count
	public static int characterCount(String file)
	{
		
	}
	
	//method accepts filename   puts filename stuff into an array
	public static String[] fileData(String file)
	{
		
	}
	
	
}











 