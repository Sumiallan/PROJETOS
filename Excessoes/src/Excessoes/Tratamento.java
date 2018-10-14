package Excessoes;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tratamento {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		try {
		int n = ler.nextInt();
		System.out.println(30/n);
		} catch(InputMismatchException erro){
			System.out.println("Voce só pode informar numeros inteiros!" +erro);
		} catch(ArithmeticException erro){
			System.out.println("Nenhum numero pode ser divido por 0 "+erro);
		} finally{
			System.out.println("FIM");
		}
 	}


}
