import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] arr = new String[5][15];

        for (int i=0; i<5; i++) {

            String str = sc.next();

            for (int j=0; j<str.length(); j++) {
                arr[i][j] = str.substring(j,j+1);
                
            }
        }
            

        for (int i=0; i<15; i++) {
            for (int j=0; j<5; j++) {

                if (arr[j][i] == null) {
                    continue;
                }
                System.out.print(arr[j][i]);
                
            }
            
        }


            
            
        }



        

        
    }