/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarysystem;
import java.util.ArrayList;

/**
 *
 * @author TetendaAllenChisvo
 */
public class Book
{
    // declaring variables
    String title;
    String author;
    String isbn;
    int quantity;
    
    //constructors
    public Book(String title, String author, String isbn, int quantity)
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.quantity = quantity;
    }

    //getter method
    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public int getQuantity()
    {
        return quantity;
    }
    
    //setter method
    public void setTitle(String title)
    {
        this.title = title;
    }
     
    public void setAuthor(String author)
    {
        this.author = author;
    }
    
    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    
}
