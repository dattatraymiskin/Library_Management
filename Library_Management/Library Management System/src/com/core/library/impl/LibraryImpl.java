package com.core.library.impl;

import java.util.Scanner;

import com.core.library.service.LibraryServiceException;
import com.core.library.storage.LibraryBook;
import com.core.library.storage.LibraryJournal;
import com.core.library.storage.LibraryMagazine;
import com.core.library.storage.LibraryThesis;

public class LibraryImpl {

	LibraryBook lbs = new LibraryBook();
	LibraryMagazine lms  = new LibraryMagazine();
	LibraryJournal ljs = new LibraryJournal();
	LibraryThesis lts = new LibraryThesis();
	Scanner sc = new Scanner(System.in);

	//Add books
	public void Add() throws LibraryServiceException {
	
			System.out.println("Press 1 for add Book in Library");
			System.out.println("Press 2 for add Magazine in Library");
			System.out.println("Press 3 for add Journal in Library");
			System.out.println("Press 4 for add Thesis in Library");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				lbs.addBook();
				break;
			case 2:
				lms.addMagazine();
				break;
			case 3:
				ljs.addJournal();
				break;
			case 4:
				lts.addThesis();
				break;
			default:
				System.out.println("Please Enter the valid choice!!\n");
				break;
			}
	}	
	
	//Display list of books
		public void ShowList() throws LibraryServiceException{
			
			System.out.println("Press 1 to display list of books");
			System.out.println("Press 2 to display list of magazines");
			System.out.println("Press 3 to display list of journals");
			System.out.println("Press 4 to display list of thesis");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				lbs.Showlist();
				break;
			case 2:
				lms.Showlist();
				break;
			case 3:
				ljs.Showlist();
				break;
			case 4:
				lts.Showlist();
				break;
			default:
				System.out.println("Please Enter the valid choice!!\n");
				break;
			}
		}

	//Search books
	public void Search() throws LibraryServiceException {

		System.out.println("Press 1 for search Book in Library");
		System.out.println("Press 2 for search Magazine in Library");
		System.out.println("Press 3 for search Journal in Library");
		System.out.println("Press 4 for search Thesis in Library");
		int choice = sc.nextInt();
		switch (choice) {	
	case 1:
		System.out.println("Enter id of book");
		String id = sc.next();
		lbs.search(id);
		break;
	case 2:
		System.out.println("Enter id of magazine");
		String id1 = sc.next();
		lms.search(id1);
		break;
	case 3:
		System.out.println("Enter id of journal");
		String id2 = sc.next();
		ljs.search(id2);
		break;
	case 4:
		System.out.println("Enter id of thesis");
		String id3 = sc.next();
	    lts.search(id3);
		break;
	default:
		System.out.println("Please Enter the valid choice!!");
		break;
	    }
		
	}
	
	//Borrow book
	public void Borrow() throws LibraryServiceException {

		System.out.println("Press 1 for borrow Book in Library");
		System.out.println("Press 2 for borrow Magazine in Library");
		System.out.println("Press 3 for borrow Journal in Library");
		System.out.println("Press 4 for borrow Thesis in Library");
		int choice = sc.nextInt();
		switch (choice) {	
	case 1:
		System.out.println("Enter title of book");
		String title = sc.next();
		lbs.borrow(title);
		break;
	case 2:
		System.out.println("Enter title of magazine");
		String title1 = sc.next();
		lms.search(title1);
		break;
	case 3:
		System.out.println("Enter title of journal");
		String title2 = sc.next();
		ljs.search(title2);
		break;
	case 4:
		System.out.println("Enter title of thesis");
		String title3 = sc.next();
	    lts.search(title3);
		break;
	default:
		System.out.println("Please Enter the valid choice!!");
		break;
	}
		
	}
	
	
}
