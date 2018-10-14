package Excessoes;

public class Lanca {
	public static void main(String[] args) {
		Lanca lanca = new Lanca();
		lanca.verificaLancamento(8);
		
	}

	public void verificaLancamento(int valor) {
		try{
			if(valor >= 10){
				System.out.println("OK. Valor válido");
			}else{
				System.out.println("Erro. Valor inválido");
				
				
				throw new Exception("Exceção por valor inválido");
			}
		}catch(Exception exc){
			System.out.println(exc.getMessage());
			System.out.println("Exceção capturada");
		
		}
		
	}
}
