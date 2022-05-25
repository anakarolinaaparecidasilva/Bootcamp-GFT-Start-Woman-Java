package desafio.dio;

public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO=1;
	private static int SEQUENCIAL=1;
	
	protected int agencia;
	protected int numero;
	public double saldo;
	protected  Clientes cliente;
	
	
		public Conta (Clientes cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		
		
	}
	
		public void sacar (double valor) {
			saldo -= valor;
		}
		
		public void depositar(double valor) {
			saldo += valor;
		}
		
		public void transferir(double valor, IConta contaDestino) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		
		
		}
		public void pix (double valor, IConta contaDestino) {
			this.sacar(valor);
			contaDestino.depositar(valor);
	}
	
	

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	
}
	
		
	
	
	

	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente
				+ "]";
	}

	protected void imprimirInfosComuns () {
		
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	
		
	}


	
	
	
	
	
	
	
	
