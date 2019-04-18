import java.util.LinkedList;
import java.util.List;

public class AdicionarNaPrimeiraPosicao {

	public static void main(String[] args) {
		
		// trocar depois por ArrayList
		List<Integer> teste = new LinkedList<>();
		
		System.out.println("Iniciando...");
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 30000; i++) {
			teste.add(0, i);
		}
		long end = System.currentTimeMillis();
		double tempo = (end - start) / 1000.0;
		System.out.println("Tempo gasto: " + tempo);
	}
}
