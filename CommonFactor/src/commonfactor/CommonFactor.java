/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package commonfactor;
import java.util.Arrays;

/**
 *
 * @author TetendaAllenChisvo
 */
public class CommonFactor
{

    public static void main(String[] args)
    {
        int[] numbers = {2, 4, 6, 8};
        
        try
        {
            findAndPrintCommonFactor(numbers);
        } catch (IllegalArgumentException e)
        {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void findAndPrintCommonFactor(int[] numbers)
    {
        if (numbers == null || numbers.length < 2)
        {
            throw new IllegalArgumentException("Array must contain at least 2 numbers");
        }

        int num1 = numbers[0];
        int num2 = numbers[1];

        int commonFactor = findCommonFactor(num1, num2);

        if (commonFactor == 1)
        {
            System.out.println("No common factor found.");
        } else {
            System.out.println("Common factor found: " + commonFactor);
        }

        // remove every number that are equal by the common factor to reduce the array
        int[] reducedArray = Arrays.stream(numbers)
                                   .filter(n -> n % commonFactor != 0)
                                   .toArray();

        System.out.println("Reduced array: " + Arrays.toString(reducedArray));
    }

    public static int findCommonFactor(int num1, int num2)
    {
        while (num2 != 0)
        {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}