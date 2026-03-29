import java.util.Scanner;

public class Main {	 
	public static void main(String[] args)  {
		try (Scanner sc = new Scanner(System.in)) {
			
				
		System.out.println("NFC West       W   L  T");
		System.out.println("-----------------------");	
		
		String[][] west = {
							{"Seattle        ","13  ","3  ","0"},
							{"San Francisco  ","12  ","4  ","0"},
							{"Arizona        ","10  ","6  ","0"},
							{"St. Louis      ","7   ","9  ","0"}
							
		};
		
		for (int i = 0; i < west.length; i++) {
			String[] inArr = west[i];
			for (int j = 0; j < inArr.length; j++) {
			System.out.print(inArr[j]);
			}
			System.out.println();
			}
		
		System.out.println();	
		System.out.println("NFC North      W   L  T");
		System.out.println("-----------------------");	
		
		String[][] North = {
							{"Green Bay      ","8   ","7  ","1"},
							{"Chicago        ","8   ","8  ","0"},
							{"Detroit        ","7   ","9  ","0"},
							{"Minnesota      ","5  ","10  ","1"}
							
		};
		
		for (int i = 0; i < North.length; i++) {
			String[] inArr = North[i];
			for (int j = 0; j < inArr.length; j++) {
			System.out.print(inArr[j]);
			}
			System.out.println();
			}
		
			
			
			}
		}
	}

