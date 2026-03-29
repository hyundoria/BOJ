import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        
        int n = sc.nextInt();
        int b = sc.nextInt();

        while (n > 0) {

            int temp = n % b;

            if (temp >= 10) {
                sb.append((char) (temp - 10 + 'A'));
            }
            else {
                sb.append(temp);
            }

            n = n / b;

        }

        System.out.print(sb.reverse());



        


            
            
        }  
    }