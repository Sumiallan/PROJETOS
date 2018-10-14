package Array3;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
	
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numTamanho = 10;
		int[] num = new int[numTamanho];
		
		for(int i=0; i < numTamanho; i++){
			System.out.println("Digite o numero: ");
			num[i] = input.nextInt();
			
		}
		Arrays.sort(num);
		for (int i = 0 ; i<num.length;i++)
	       {
	                 System.out.print (num[i]+", ");
	       }
	
	
	}

}
