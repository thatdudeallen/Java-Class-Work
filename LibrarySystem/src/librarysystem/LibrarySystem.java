/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librarysystem;
import java.util.ArrayList;

/**
 *
 * @author TetendaAllenChisvo
 */
public class LibrarySystem 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Library library = new Library();

        // Adding some books
        library.addBook(new Book("Java Programming", "Jemina Matiya", "123456789", 5));
        library.addBook(new Book("Human Computer Interaction", "Jealous Kwamaya", "987654321", 3));
        library.addBook(new Book("Software Engineering", "Adrian Drizzy", "456789123", 2));

        // Displaying all available books
        library.displayAvailableBooks();
    }
    
}
