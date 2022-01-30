package com.core.library.storage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryBook {

	File file = new File("Book.txt");
	FileWriter filewriter = null;
	BufferedReader bufferedreader = null;
	Scanner sc = new Scanner(System.in);
	
	//Add Book
	public void addBook() {
		System.out.print("Enter the id of the Book:\n ");
		String id = sc.next();
		System.out.print("Enter the title of the Book:\n ");
		String title = sc.next();
		System.out.print("Enter the auther of the Book:\n ");
		String author = sc.next();
		System.out.print("Enter the price of the Book:\n ");
		String price = sc.next();
		try {
			filewriter = new FileWriter(file, true);
			filewriter.write("id= " + id + " " + "title= " + title + " " + "author= " + author + " "+ "price= " + price + "\n");
			System.out.print("Successfully added: " + "id= " + id + " " + "title=" + title + " " + "author=" + author + " " + "price=" + price + "\n");
		} catch (IOException e) {
			System.out.println("Error while adding in the file");
		} finally {
			if (filewriter != null)
				try {
					filewriter.close();
				} catch (IOException e) {
					System.out.println("File not close");
				}
		}
	}
	//Display list
	public ArrayList<String> Showlist() {
		ArrayList<String>list= new ArrayList<>();
		FileReader filereader = null;
		try {
			filereader = new FileReader(file);
			bufferedreader = new BufferedReader(filereader);
			System.out.println("List of Books available in Library: \n");
			String line = bufferedreader.readLine();
			while ((line = bufferedreader.readLine()) != null) {
                list.add(line);
                System.out.println(line);
			}	 
		} catch (IOException e) {
			System.out.println("File not found");
		}
		try {
			filereader.close();
		} catch (IOException e) {
			System.out.println("File not close");
		}
		return list;
	    }



    //Search
    public void search(String id) {
    	
    	LibraryBook lb = new LibraryBook();
    	ArrayList<String>list1 = lb.Showlist();
		FileReader filereader = null;
		int counter = 0;
			try {
				filereader = new FileReader(file);
				bufferedreader = new BufferedReader(filereader);
				String searchid = bufferedreader.readLine();
				for(String id1 : list1) {
					if(id1.equals(searchid)) {
						System.out.println(id1);
						break;
					}
				}
			} catch (IOException e) {
				System.out.println("Error");
			}
			if (counter ==0)
				System.out.println("This id is not present ");
			try {
				filereader.close();
			} catch (IOException e) {
				System.out.println("File not close");
		}
   }
    
    //Borrow Book
    public void borrow(String title) {
    	ArrayList<String> list= new ArrayList<>();
		FileReader filereader = null;
		int counter = 0;
			try {
				filereader = new FileReader(file);
				bufferedreader = new BufferedReader(filereader);
				for(String title1 : list) {
					if(title1.equals(title1)) {
						System.out.println("You can borrow the book" +title1);
					}
				}
			} catch (IOException e) {
				System.out.println("Error");
			}
			  if (counter ==0)
				  System.out.println("This book is not available in Library");
			try {
				filereader.close();
			} catch (IOException e) {
				System.out.println("File not close");
		}
    }
	
}   
 	
