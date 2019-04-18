
public class Poupanca extends Conta implements Comparable<Conta> {

	@Override
	public double getConta() {
		
		return 0;
	}

	@Override
	public int compareTo(Conta o) {
		if (this.getNumero() < o.getNumero()) {
			return -1;
			}
			if (this.getNumero() > o.getNumero()) {
			return 1;
			}
		return 0;
	}
	
	
	public void setNumero(double i) {
		// TODO Auto-generated method stub
		this.numero = i;
	}

}
