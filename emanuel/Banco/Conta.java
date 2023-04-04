package emanuel;
public class Conta {

	private String titular;
	private int numero;
	private double saldo;
	
	public Conta(String titular, int numero, double saldo) {
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public Conta(String titular, int numero) {
		this.titular = titular;
		this.numero = numero;
		this.saldo = 0;
	}

		
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public boolean sacar (double valor) {
		if (saldo >= valor) { 
			saldo -= valor;
			return true;
		} 	
		else
			return false;
	}

	public boolean transferir(double valor, Conta c) {
		if (sacar(valor)) {
			c.depositar(valor);
			return true;
		}
		else
			return false;
	} 
	
	public String toString(){
		return "Isso é uma conta. Titular="+ titular + ", numero=" + numero + ", saldo=" + saldo;
	}
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
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

}
