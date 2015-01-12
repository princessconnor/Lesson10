
import TerminalIO.KeyboardReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author conn6070
 */

public class Fibonnaci {

    public static void main (String[] args){
        
    KeyboardReader k = new KeyboardReader();
    
  int number;
    //ask for the input of a  number 
    while(true)
    {        
        number= k.readInt(" Enter a number between 1 and 15 -> ");
        if (number>15 || number < 0)
        {
            System.out.println(" Enter a valid number-> ");
        }
        else break;   
    }
     System.out.println(fibonacci(number) + " is fibonacci number " + number);
    }
    //fib code
    public static int fibonacci(int n)
    {
        if(n<=2)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }
}