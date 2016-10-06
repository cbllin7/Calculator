/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;
import java.util.Scanner;
/**
 *
 * @author King of Austell
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char Sign,replay;
        do{
            double a = in.nextDouble();
            Sign = in.next().charAt(0);
            double b = in.nextDouble();
            
            switch(Sign){
                case '+':
                    System.out.println(" "+ (a+b));
                    break;
                case '-':
                    System.out.println(" " + (a - b));
                    break;
                case '*':
                    System.out.println(" " + (a*b));
                    break;
                case '/':
                    System.out.println(" " + (a/b));
                    break;
                default:
                    System.out.print("Not a oprator");
            }
            System.out.println("Continue? ");
            replay = in.next().charAt(0);
            
        }while(replay == 'Y' || replay == 'y');
                
            
            
    }
    
}
