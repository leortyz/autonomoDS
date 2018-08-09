/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispensables.comments.refactoring;

/**
 *
 * @author eduar
 */
public class Fibonacci {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        int number = 5;

        System.out.println("Fibonacci series upto " + number + " numbers : ");
        
        // printing Fibonacci series up to "number" of times
        for (int i = 1; i <= number; i++) {
            System.out.print(FirstNumberOfFibonacci(i) + " ");
        }
    }
    public static int FirstNumberOfFibonacci(int number){
        if(number == 1 || number == 2){
            return 1;
        }
      
        return FirstNumberOfFibonacci(number-1) + FirstNumberOfFibonacci(number -2); // tail recursion
    }
  
    
    public static int SecondNumberOfFibonacci(int number ){
        
        if(number == 1 || number == 2){
            return 1;
        }
        
        int fibo1 = 1, fibo2 = 1, numberFibonacci = 1;
        
        for(int i= 3; i<= number; i++){
            numberFibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = numberFibonacci;
        }
        return numberFibonacci;
    }
    
}
