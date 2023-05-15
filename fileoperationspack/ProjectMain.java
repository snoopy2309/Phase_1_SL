package com.fileoperationspack;

import java.io.IOException;
import java.util.*;

public class ProjectMain {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Project Name : Virtual Key for Your Repositories	Developer's Name : Aparna");
		System.out.println("—---------------------------------------------------------------------\n");
		FileOperations op=new FileOperations();
		
		while(true) {
			System.out.println("Select one of the options below:");
			System.out.println("1.Retrieving the All file names in an ascending order");
			System.out.println("2.Business-level operations");
			System.out.println("3.Exit from the application");
			int ch=sc.nextInt();
			if(ch>=3) {
				System.out.println("Thanks for using our application");
				System.exit(0);
			}
			
			switch(ch) {
			case 1:
				op.ViewAllFiles();
				break;
			case 2:
				while(true) {
					System.out.println("Select one of the options below:");
					System.out.println("1.Add a file to the application");
					System.out.println("2.Delete a file from the application");
					System.out.println("3.Search a file from the application");
					System.out.println("4.Return to Home");
					int choice=sc.nextInt();
					if(choice>=4) {
						break;
					}
					switch(choice) {
					case 1:
						System.out.println("Give the name of the file:");
						String name=sc.next();
						String content="Hello this is my first file";
						op.AddNewFile(name,content);
						break;
					case 2:
						System.out.println("Name the file that needs to be deleted:");
						name=sc.next();
						op.DeleteFile(name);
						break;
					case 3:
						System.out.println("Give the name of the file:");
						name=sc.next();
						op.SearchFile(name);
						break;
					}	
				}
			}
		}
	}
}
