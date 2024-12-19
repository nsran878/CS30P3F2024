package SkillBuilders;

import java.io.File;
import java.util.Scanner;

public class MyFile1
{

	public static void main(String[] args) 
	{
		File textFile;
		String path;
		
		Scanner input = new Scanner(System.in);
		
	
		System.out.println("Enter a file name: ");
		
	
		path = input.next();
		
		
		
		textFile = new File(path);
		
		if(textFile.exists())
		{
			System.out.println("File exists.");
		}
		else
		{
			System.out.println("File does not exist.");
		}
		
		

	}

}
