package desafio.dio;

public class ContaCorrente extends Conta {

	public ContaCorrente(Clientes cliente) {
		super (cliente);


	}
	
	
	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		System.out.println("*** Extrato Conta Corrente ***");
		super.imprimirInfosComuns();
	}


	@Override
	public void cartaoCredito() {
		// TODO Auto-generated method stub
		
	}

}
