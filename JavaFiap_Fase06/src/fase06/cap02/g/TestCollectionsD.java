package fase06.cap02.g;

import java.util.HashMap;
import java.util.Map;

public class TestCollectionsD {

	public static void main(String[] args) {
		
		Map<String, String> caixa = new HashMap<String, String>();
		caixa.put("M225", "Fernando");
		caixa.put("M226", "Maria");
		caixa.put("M227", "Soraia");
		
		System.out.println(caixa.isEmpty());
		System.out.println(caixa.size());
		System.out.println(caixa.containsKey("M225"));
		System.out.println(caixa);
		
	}

}
