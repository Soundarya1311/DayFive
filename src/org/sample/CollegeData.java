package org.sample;

import java.util.Scanner;

public class CollegeData extends Staff{
	public static void main(String[] args) {
		 System.out.println("SSP College");
		 CollegeData cd = new CollegeData();
		 cd.staffPortal();
		 cd.studentPortal();
		 System.out.println("Enter your feed back");
		 Scanner sc = new Scanner(System.in);
		 String feedback = sc.nextLine();
		 System.out.println("THANK YOU!!");
		
	}

}
