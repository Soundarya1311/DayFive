package org.sample;

import java.util.Scanner;

public class Staff extends Student{
	
	public void staffPortal() {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Welcome to Staff Portal \n Enter your name");
		 String staffname = sc.nextLine();
		 System.out.println("Enter your major");
		 String major = sc.nextLine();
		 System.out.println("The staff name is " +staffname);
		 
		}
	private void staffPortal2() {
		System.out.println("Staff");

	}

}
