/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist.java;

/**
 *
 * @author TetendaAllenChisvo
 */

public class ArrayList 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      Arraylist<String> student = new ArrayList<>();

        // Adding student names to the ArrayList
        student.add("Vuyo");
        student.add("Allen");
        student.add("Musa");
        student.add("Lutho");
        student.add("Ayanda");

        // Printing the student names
        System.out.println("Student names:");
        for (String name : student) 
        {
            System.out.println(name);
        }

        // Using the get method to retrieve a student name
        System.out.println("\nStudent at index 2: " + student.get(2));

        // Using the size method to get the size of the ArrayList
        System.out.println("Number of students: " + student.size());

        // Using the remove method to remove a student
        student.remove(3);
        System.out.println("\nAfter removing a student, updated list:");
        for (String name : student) 
        {
            System.out.println(name);
        }

        // Using the clear method to remove all elements
        student.clear();
        
        // Using the isEmpty method to check if the ArrayList is empty
        if (student.isEmpty()) 
        {
            System.out.println("\nNo students in the list.");
        } 
        else 
        {
            System.out.println("\nThere are students in the list.");
        }
    }
    
}
