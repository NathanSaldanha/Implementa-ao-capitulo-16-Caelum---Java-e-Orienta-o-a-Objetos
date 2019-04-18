import java.util.HashMap;
import java.util.Map;

public class TestaMapa {

	public static void main(String[] args) {
		
		Conta c1 = new Corrente();
		c1.deposita(1000.0);
		
		Conta c2 = new Corrente();
		c2.deposita(3000.0);
		
		// cria o mapa
		Map<String, Conta> mapaDeContas = new HashMap<>();
		
		// adiciona duas chaves e seus valores
		mapaDeContas.put("Professor", c1);
		mapaDeContas.put("Coordenador", c2);
		
		Conta cProfessor = (Conta) mapaDeContas.get("Professor");
		System.out.println(cProfessor.getSaldo());
	}
}
