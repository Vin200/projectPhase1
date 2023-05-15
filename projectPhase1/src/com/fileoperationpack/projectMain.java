package com.fileoperationpack;

import java.io.IOException;
import java.util.Scanner;

public class projectMain {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		fileoperations fop = new fileoperations();
		System.out.println("Project Name: LockedMe.com\tDeveloper Name:Vinayak Badiger");
		
		while(true) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1.Retrieving all file names in an ascending order\n2.Business-level operations\n3.Exit from the application");
			System.out.println("-----------------------------------------------------");
			System.out.println("Enter Your Choice:");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1:{
					fop.viewAllFiles();
					break;
				}
				case 2:{
					System.out.println("\t************************************\n");
					System.out.println("\t1.Add a file to the application\n\t2.delete a file from the application\n\t3.Search file from the application\n\t4.Exit\n");
					System.out.println("\t************************************\n");
					int choice2 = sc.nextInt();
					sc.nextLine();
					switch(choice2) {
						case 1:{
							System.out.println("Enter File Name: ");
							String fileName = sc.next();
							sc.nextLine();
							System.out.println("Enter content of file");
							String content = sc.nextLine();
							fop.addNewFile(fileName, content);
							break;
						}
						case 2:{
							System.out.println("Enter the file name to delete: ");
							String fname = sc.next();
							fop.deleteFile(fname);
							break;
						}
						case 3:{
							System.out.println("Enter File Name to search:");
							String fname = sc.next();
							fop.searchFile(fname);
							break;
						}
						case 4:break;
						default:System.out.println("Invalid Choice!");
					}
					break;
				}
				case 3:{
					System.out.println("\n\nThank you for using the Application!");
					System.exit(0);
				}
				default:System.out.println("Please Enter Correct Choice");break;
			}
		}	
	}
}
