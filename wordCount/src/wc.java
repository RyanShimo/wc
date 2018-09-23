/*
	Name: Ryan Shimozaki
	Date: 9/23/18
	What it does: prints out the word count, character count, and/or line count of any number of files
*/

import java.io.*;
import java.util.Scanner;
public class wc 
{
	public static void main (String []args) throws FileNotFoundException
	{
		
		
		if(args.length>=1 && args[0].equals("wc"))
		{
			String whichCounts = args[1];
			char[] firstInput = whichCounts.toCharArray();
			
			if(args.length==1) // makes sure if the input is strictly wc then it will print out a description
			{
				System.out.print("The wc utility displays the number of lines, words,\n"
						+ "and/or characters in each input file. \n");
			}
			
			else if(args.length>3 && firstInput[0]=='-')  // checks if second argument is a count identifier
			{
				int identifier = 0;
				int argumentNum = 1;
				while(firstInput[0]=='-' && firstInput.length>1 && argumentNum!=4) //checks through given argument and gets which counts are going to occur even if input as -l -w -c or -wc -l or -lcw
				{
					identifier += countIdentifier(args[argumentNum]); //assumed they only input each letter l w or c once, program will be incorrect if any letter is repeated while checking each array
					String newCount = args[argumentNum];
					argumentNum++;
					char[] newInput = newCount.toCharArray(); 
					firstInput[0] = newInput[0];
				}
					File documentOne = new File(args[argumentNum]);
					
					while(documentOne.exists()) 
					{
						//System.out.println("\n" + parentCount(identifier,documentOne));  NEED TO CORRECT ACCEPTING THE FILE OR ARRAY OF FILE
						argumentNum++;
						documentOne = new File(args[argumentNum]);
					}
			}
			
			else 
			{
				File documentTwo = new File(args[1]);
				int numFiles=1;
				while(documentTwo.exists())
				{
					//System.out.println("\n" + parentCount(7,documentOne));  NEED TO CORRECT ACCEPTING THE FILE OR ARRAY OF FILE						
					numFiles++;
					documentTwo = new File(args[numFiles]);
				}
			}

				
			}
		
			
		}
	}

	
	//method accepts filename	returns l w, c in an array 
	public static int[] allCounts(String file)
	{
		int l = lineCount(file);
		int w = wordCount(file);
		int c = characterCount(file);
		int[] counts = {l, w, c};
		return counts;
	}
	//method accepts countIdentifier and filename 	continues to respected -l, -w, or -c
	public static int[] parentCount(int whichCount, String file)
	{
		int values[] = new int[3];
		if(whichCount==1)
			values[0] = lineCount(file);
		else if(whichCount==2)
			values[0] = wordCount(file);
		else if(whichCount==3)
			values[0] = characterCount(file);
		else if(whichCount==4)
		{
			values[0] = lineCount(file);
			values[1] = wordCount(file);
		}
		else if(whichCount==5)
		{
			values[0] = lineCount(file);
			values[1] = characterCount(file);
		}
		else if(whichCount==6)
		{
			values[0] = characterCount(file);
			values[1] = wordCount(file);
		}
		else if(whichCount==7)
		{
			values[0] = lineCount(file);
			values[1] = wordCount(file);
			values[2] = characterCount(file);
		}
		
		return values;
	}
	//method accepts filename	prints line count
	public static int lineCount(String file)
	{
		int lines = 0;
		try
		{
			Scanner s = new Scanner(new File(file));
			while(s.hasNextLine())
				lines ++;
		}
		catch(FileNotFoundException e)
		{
			System.out.print("File not found");
		}

		return lines;
	}
	//method accepts filename	prints word count
	public static int wordCount(String file)
	{
		int lines = 0;
		int words = 0;
		try
		{
			Scanner s1 = new Scanner(new File(file));
			while(s1.hasNextLine())
			{
				lines ++;
			}
			String[] wordsArray = new String[lines];

			Scanner s2 = new Scanner(new File(file));
			for(int i=0; i<lines; i++)
				wordsArray[i] = s2.next();   
			words = wordsArray.length; 
		}
		catch(FileNotFoundException e)
		{
			System.out.print("File not found");
		}
		return words;

	}
	//method accepts filename	prints character count
	public static int characterCount(String file)
	{
		int characters = 0;
		
		return characters;
	}
	
	
	//method accepts argument   returns the number of which counts to do 
	public static int countIdentifier(String identifier)
	{
		int count = 0;
		if(identifier.length()>1)
			count+=1;
		if(identifier.contains("l"))
			count+=1;
		if(identifier.contains("w"))
			count+=2;
		if(identifier.contains("c"))
			count+=3;

		return count;
	}
	
}











 