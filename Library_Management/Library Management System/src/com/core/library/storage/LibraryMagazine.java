package com.core.library.storage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryMagazine {
	File file = new File("Magazine.txt");
	FileWriter filewriter = null;
	BufferedReader bufferedreader = null;
	Scanner sc = new Scanner(System.in);
	
	//Add Magazine
	public void addMagazine() {
		System.out.print("Enter the id of the Magazine: ");
		String id = sc.next();
		System.out.print("Enter the title of the Magazine: ");
		String title = sc.next();
		System.out.print("Enter the auther of the Magazine: ");
		String author = sc.next();
		System.out.print("Enter the price of the Magazine: ");
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
		public List<String> Showlist() {
			ArrayList<String>list= new ArrayList<>();
				FileReader filereader = null;
				try {
					filereader = new FileReader(file);
					bufferedreader = new BufferedReader(filereader);
					System.out.println("list of Magazines available in Library: \n");
					String line = null;
					while ((line = bufferedreader.readLine()) != null) {
						System.out.println(line);
						list.add(line);
					}
				} catch (IOException e) {
					System.out.println("File not found");
				}
				try {
					filereader.close();
				} catch (IOException e) {
					System.out.println("Error while closing the file");
			
			}
			return list;
		}

		public void search(String id1) {
		    	ArrayList<String> list= new ArrayList<>();
				FileReader filereader = null;
				int counter = 0;
					try {
						filereader = new FileReader(file);
						bufferedreader = new BufferedReader(filereader);
						String searchid = null ;
						for(String id : list) {
							if(id.equals(searchid)) {
								System.out.println(id);
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
		//Borrow 
		public void borrow(String title) {
	    	ArrayList<String> list= new ArrayList<>();
			FileReader filereader = null;
			int counter = 0;
				try {
					filereader = new FileReader(file);
					bufferedreader = new BufferedReader(filereader);
					for(String title1 : list) {
						if(title1.equals(title1)) {
							System.out.println("You can borrow the Thesis" +title1);
						}
					}
					
				} catch (IOException e) {
					System.out.println("Error");
				}
				if (counter ==0)
					System.out.println("This Magazine is not available in Library");
				try {
					filereader.close();
				} catch (IOException e) {
					System.out.println("File not close");
			}
	    }
}