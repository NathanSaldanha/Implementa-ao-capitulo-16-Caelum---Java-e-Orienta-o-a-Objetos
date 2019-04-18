
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestarOrdenacao {

	public static void main(String[] args) {
		
		List <Poupanca> contas = new LinkedList<Poupanca>();
		
		Poupanca c1 = new Poupanca();
		c1.setNumero(1973);
		contas.add(c1);
		
		Poupanca c2 = new Poupanca();
		c2.setNumero(1462);
		contas.add(c2);
		
		Poupanca c3 = new Poupanca();
		c3.setNumero(1854);
		contas.add(c3);
		
		
		Collections.sort(contas);
		
		
		for (int i = 0; i < contas.size(); i++) {
			
			Conta atual = contas.get(i);
			System.out.println("numero: "+ atual.getNumero());
		}
		
		for (int i = 0; i < contas.size(); i++) {
			
			System.out.println("numero: " + contas.get(i).getNumero());
		}
		
		
	}

}
