package Excessoes;

public class Lanca {
	public static void main(String[] args) {
		Lanca lanca = new Lanca();
		lanca.verificaLancamento(8);
		
	}

	public void verificaLancamento(int valor) {
		try{
			if(valor >= 10){
				System.out.println("OK. Valor v�lido");
			}else{
				System.out.println("Erro. Valor inv�lido");
				
				
				throw new Exception("Exce��o por valor inv�lido");
			}
		}catch(Exception exc){
			System.out.println(exc.getMessage());
			System.out.println("Exce��o capturada");
		
		}
		
	}
}
