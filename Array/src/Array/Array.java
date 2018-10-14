package Array;

public class Array {

	public static void main(String[] args) {
		int numeroDeArray = 300;
		int[] array = new int[numeroDeArray];

		for(int i=0; i < numeroDeArray; i++ ){
			array[i] = 45;
			System.out.println("Array: "+ array[i]);
		}
		int x = 0;
		while( x < numeroDeArray){
			array[x] = 45;
			System.out.println("Array: "+ array[x]);
			x++;
		}
		int z = 0;
		do{
			array[z] = 45;
			System.out.println("Array: "+ array[z]);
			z++;
		}while(z < numeroDeArray);
	
	}

}
