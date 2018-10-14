package Excessoes;

public class ExcecaoPersonalizada {

	public static void main(String[] args) {
		ExcecaoPersonalizada teste = new ExcecaoPersonalizada();
		try {
			teste.consultarCliente("");
		} catch (ClienteNaoEncontradoException e) {
			System.out.println(e.getMessage() + "  " + e.getCodigoErro());
			
		}
		
	}
	
	public void consultarCliente(String nome) throws ClienteNaoEncontradoException  {
		if(nome.equals("")) {
			throw new ClienteNaoEncontradoException("Cliente nao cadastrado", 2);
			
		}
			
			System.out.println("Sucesso. Execção não gerada");
		
		}
	
	
	}


