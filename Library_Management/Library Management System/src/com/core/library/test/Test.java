package com.core.library.test;

import java.util.Scanner;

import com.core.library.impl.LibraryImpl;
import com.core.library.service.LibraryServiceException;

public class Test {
	LibraryImpl obj = new LibraryImpl();
	Scanner sc = new Scanner(System.in);

	@SuppressWarnings("resource")
	public static void main(String[] args) throws LibraryServiceException {
		Test t = new Test();
		Scanner sc = new Scanner(System.in);
		System.out.println("....Welcome in Library Management Project....\n");
	
		int n = 1;
		do {
			System.out.println("Press 1 for Sign in as Admin");
			System.out.println("Press 2 for Sign in as Staff");
			System.out.println("Press 3 for Sign in as Student");
			System.out.println("Enter the choice\n");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				t.adminstator();;
				break;
			case 2:
				t.staff();
				break;
			case 3:
				t.student();
				break;
			default:
				System.out.println("Please Enter the valid choice!!\n");
				break;
			}
			System.out.println("\nDo you want to Carry on?..Please press 1");
			System.out.println("\nDo you want to Leave?.....Please press 2");
			n = sc.nextInt();
		} while (n == 1);
          System.out.println("Thanks for using Library Management Application!!");
	}
		
	public void adminstator() throws LibraryServiceException {
		int n = 1;
		 do { 
			System.out.println("Press 1 for Add the books");
			System.out.println("Press 2 for Show List of books, magazines, journals, thesis");
			System.out.println("Press 3 for Search the books");
			System.out.println("Press 4 for Borrow the books");
			System.out.println("Enter the choice\n");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				obj.Add();
				break;
			case 2:
				obj.ShowList();
				break;
			case 3:
				obj.Search();
				break;
			case 4:
				obj.Borrow();
				break;
			default:
				System.out.println("Please Enter the valid choice!!\n");
				break;
			}
			System.out.println("\nDo you want to Carry on?..Please press 1");
			System.out.println("\nDo you want to Sign out?..Please press 2");			
			n = sc.nextInt();
		} while (n == 1);
          System.out.println("Thank you!!");
	}

	public void staff() throws LibraryServiceException {
		int n = 1;
		 do { 
		    System.out.println("Press 1 for Show List of books, magazines, journals, thesis");
			System.out.println("Press 2 for Search the books");
			System.out.println("Press 3 for Borrow the books");
			System.out.println("Enter the choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				obj.ShowList();
				break;
			case 2:
				obj.Search();
				break;
			case 3:
				obj.Borrow();
				break;
			default:
				System.out.println("Please Enter the valid choice!!\n");
				break;
			}
			System.out.println("\nDo you want to Carry on?..Please press 1");
			System.out.println("\nDo you want to Sign out?..Please press 2");
			n = sc.nextInt();
		} while (n == 1);
		 System.out.println("Thank you!!");
	}

	public void student() throws LibraryServiceException {
		int n = 1;
		 do { 
			System.out.println("Press 1 for Show List of books, magazines, journals, thesis");
			System.out.println("Press 2 for Search the books");
			System.out.println("Press 3 for Borrow the books");
			System.out.println("Enter the choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				obj.ShowList();
				break;
			case 2:
				obj.Search();
				break;
			case 3:
				obj.Borrow();
			default:
				System.out.println("Please Enter the valid choice!! \n");
				break;
			}
			System.out.println("\nDo you want to Carry on?..Please press 1");
			System.out.println("\nDo you want to Sign out?..Please press 2");
			n = sc.nextInt();
		} while (n == 1);
		 System.out.println("Thank you!!");
	}
}
