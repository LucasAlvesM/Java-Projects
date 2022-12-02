
public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 22665);
		
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Dev Jr");
		
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		System.out.println(titularDaConta.getProfissao());
	}
}
