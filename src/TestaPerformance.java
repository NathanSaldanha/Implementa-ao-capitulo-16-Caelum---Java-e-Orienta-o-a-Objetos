import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {
		System.out.println("Iniciando...");
		Collection<Integer> t1 =new HashSet<>();
		
		long inicio = System.currentTimeMillis();
		
		int ttl = 30000;
		
		for (int i = 0; i < ttl; i++) {
			t1.add(i);
		}
		for (int i = 0; i < ttl; i++) {
			t1.contains(i);
		}
		
		long end = System.currentTimeMillis();
		long time = end - inicio;
		System.out.println("Tempo gasto: "+time);
	}

}
