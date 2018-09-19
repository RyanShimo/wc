/*
	Name: Ryan Shimozaki
	Date: 9/23/18
	What it does: prints out the word count, character count, and/or line count of any number of files
*/
public class wc 
{
	public static void main (String []args)
	{
		if(args[0]=="wc")
		{
			if((args[1]=="-l" || args[1]=="-w" || args[1]=="-c") /* && the file (args[2] can be read */)	//need to check if file exists
			{
				int numFiles=2;
				while(args[numFiles]!=null  /* && the file (args[numFiles]) can be read */ )  //continues till there are no more files to read through
				{
					//enter method accepting args[1] and filename
					numFiles++;
				}
			}
			else if (/* the file (args[1] can be read */)
			{	
				int numFiles=1;
				while(args[numFiles]!=null)
				{
					//enter method accepting filename can be read
					numFiles++;
				}
			}
		}
		else if(args[1]==null)
			System.out.print("Description: The wc utility displays the number of lines, words, and/or characters contained in each input file. \n" + 
					"The following options are: \n" + 
					"	wc -l [file ...]	The number of lines in a file\n" + 
					"	wc -w [file …]	The number of characters in a file\n" + 
					"	wc -c [file …]	The number of words in a file\n" + 
					"	wc [file …]	The number of lines, characters and words in a file");
	
	}
	
	//method accepts args[1] and filename 	continues to respected -l, -w, or -c
	//method accepts filename	prints l, w, and c 
	//method accepts filename	prints line count
	//method accepts filename	prints word count
	//method accepts filename	prints character count

}
 