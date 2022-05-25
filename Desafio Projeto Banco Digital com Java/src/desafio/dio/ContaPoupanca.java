package desafio.dio;

public class ContaPoupanca extends Conta {

	public ContaPoupanca (Clientes cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		System.out.println("*** Extrato Conta Poupança ***");
		super.imprimirInfosComuns();
	}

	@Override
	public void cartaoCredito() {
		// TODO Auto-generated method stub
		
	}

	
}
