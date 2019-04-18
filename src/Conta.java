
public abstract class Conta {
	
	private double cpf;
	private String titular;
	private double conta;
	private double saldo;
	private double agencia;
	protected double numero;
	
	
	public double getNumero() {
		return numero;
	}

	public abstract double getConta();
	
	
	public double getCpf() {
		return cpf;
	}
	public void setCpf(double cpf) {
		this.cpf = cpf;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getAgencia() {
		return agencia;
	}
	public void setAgencia(double agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	


	
	
}
