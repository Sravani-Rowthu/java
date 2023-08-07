package com.sra.jdbc.model.service;
import java.util.Scanner;

import com.sra.JdbcDemo.Book;
import com.sra.jdbc.model.dao.BookDAO;
public class BookService

{
    private static Scanner sc=new Scanner(System.in);
    private BookDAO bdao=new BookDAO();
    public String addBook()
    {
        System.out.println("Enter Book id");
        String bookId = sc.nextLine();
        System.out.println("Enter the book title");
        String bookTitle = sc.nextLine();
        System.out.println("Enter the book Author");
        String bookAuthor = sc.nextLine();
        System.out.println("Enter the book Category");
        String bookCategory = sc.nextLine();
        System.out.println("Enter the book Price");
        double bookPrice = sc.nextDouble();
        System.out.println("Enter book copies");
        int copies =sc.nextInt();
        
        if(bdao.insertBook(new Book(bookId, bookTitle, bookAuthor, bookCategory, bookPrice, copies)))
            return "Book details added";
        return "Book addition failed";
    }
    public void showBooksByCategory()
    {
        for(Book b: bdao.getAllBooks())
           System.out.println(b.getBookId()+" "+b.getBookTitle()+" "+b.getBookAuthor()+" "+b.getBookCategory()+" "+b.getBookPrice()+" "+b.getCopies());
    }

    public void showBookByTitle()
    {
        System.out.println("Enter book title");
        String bookTitle=sc.nextLine();
        Book b=bdao.getBookByTitle(bookTitle);
        if(b!=null)
            System.out.println(b.getBookId()+" "+b.getBookTitle()+" "+b.getBookAuthor()+" "+b.getBookCategory()+" "+b.getBookPrice()+" "+b.getCopies());
        else
            System.out.println("Book doesnt exist by title "+bookTitle);
    }
    public void deleteBookByTitle()
    {
        System.out.println("Enter book title");
        String bookTitle=sc.nextLine();
        if(bdao.deleteBookByTitle(bookTitle))
            System.out.println(bookTitle +"Deleted successfully");
        else
           System.out.println("Book doesnt exist by title "+bookTitle);         
    }
    public void showAllBooks()
    {
        for(Book b:bdao.getAllBooks())
            System.out.println(b.getBookId()+" "+ b.getBookTitle()+"  "+ b.getBookAuthor()+" "+b.getBookCategory()+" "+ b.getBookPrice()+" "+b.getCopies());
    }
}