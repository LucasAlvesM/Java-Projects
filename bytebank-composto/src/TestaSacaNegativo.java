
public class TestaSacaNegativo {

	public static void main(String[] args) { 
		Conta conta = new Conta();
		conta.deposita(300);
		System.out.println(conta.saca(500));
		
		conta.saca(101);
		
		System.out.println(conta.getSaldo());
	}
}
