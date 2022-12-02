
public class TesteGerente {

	public static void main(String[] args) {
		
		Autenticavel referencia = new Cliente();
		 
		Gerente gerente1 = new Gerente();
		gerente1.setNome("Lucas");
		gerente1.setCpf("328-238-322.01");
		gerente1.setSalario(5000);
		
		System.out.println(gerente1.getNome());
		System.out.println(gerente1.getCpf());
		System.out.println(gerente1.getSalario());
		
		gerente1.setSenha(1292);
		boolean autenticou = gerente1.autentica(1292);
		
		System.out.println(autenticou);
		
		System.out.println(gerente1.getBonificacao());

	}

}
