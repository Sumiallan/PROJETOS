package Array2;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int nomeTamanho = 10;
		String[] nome = new String[nomeTamanho];
		
		for(int i=0; i < nomeTamanho; i++){
			System.out.println("Digite o nome: ");
			nome[i] = input.nextLine();
			
		}
		Arrays.sort(nome);
		for (int i = 0 ; i<nome.length;i++)
	       {
	                 System.out.print (nome[i]+", ");
	       }
	
	
	}

}
