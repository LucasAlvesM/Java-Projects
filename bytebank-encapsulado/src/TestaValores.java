
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(123,1839);
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(1231);
		
		Conta conta2 = new Conta(1231, 23443);
		Conta conta3 = new Conta(1231, 33443);
		
		System.out.println(Conta.getTotal());
	}
}
