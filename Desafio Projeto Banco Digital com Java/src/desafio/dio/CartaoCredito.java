package desafio.dio;


import java.util.Random;

public class CartaoCredito {

	private int numeroCartao;
	
	private int codigoSeguranca;
	

	
	
	public CartaoCredito () {
		
		
		
		Random random = new Random ();
	
		this.numeroCartao = random.nextInt ();
		this.codigoSeguranca = random.nextInt ();
	}
		
		public void cartaoCredito () {
			// TODO Auto-generated method stub
			System.out.println("*** Dados do Cartão de Crédito ***");
			System.out.println("Cartão número: " + this.numeroCartao);
		
		
		
	}
	

	

	

	
	
	
	

	@Override
	public String toString() {
		return "CartaoCredito [numeroCartao=" + numeroCartao + ", codigoSeguranca=" + codigoSeguranca + "]";
	}











	public int getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public int getCodigoSeguranca() {
		return codigoSeguranca;
	}

	public void setCodigoSeguranca(int codigoSeguranca) {
		this.codigoSeguranca = codigoSeguranca;
	}
	
	
	
}
