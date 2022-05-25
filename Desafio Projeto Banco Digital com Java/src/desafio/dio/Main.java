package desafio.dio;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clientes cliente = new Clientes ();
		cliente.setNome();
		
		
	
		Conta cc = new ContaCorrente (cliente);
				
		Conta poupanca = new ContaPoupanca (cliente);
		
		CartaoCredito cartao = new CartaoCredito ();
		
		
		
		cc.depositar(1000);
		
		
		cc.transferir(450, poupanca);
	 
		cc.sacar(140);
		 
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	
		cartao.cartaoCredito();
		
}
	
	

}
	
		
		
		
		
