package com.sra.jdbc;

import java.util.Scanner;

import com.sra.jdbc.model.service.BookService;

public class App
{
	public static void main(String[] args)
	{
	BookService bookService =new BookService();
	Scanner sc=new Scanner(System.in);
	int opt=0;
	do
	{
		System.out.println("1. Add Book");
		System.out.println("2. Show All Books");
		System.out.println("3. Show Books By Category");
		System.out.println("4. Show Book by Title");
		System.out.println("5. Delete Book By Title");
		System.out.println("6. E X I T");
		System.out.println("Enter your option:- ");
		opt=sc.nextInt();
		
		switch(opt)
		{
		case 1:
			bookService.addBook();
			break;
		case 2:
			bookService.showAllBooks();
			break;
		case 3:
			bookService.showBooksByCategory();
			break;
		case 4:
			bookService.showBookByTitle();
			break;
		case 5:
			bookService.deleteBookByTitle();
			break;
		case 6:
			System.out.println("you are quiting new");
			break;
		default:
			System.out.println("ENTER CORRECT OPTION");
		}
	}while(opt!=6);
}
}