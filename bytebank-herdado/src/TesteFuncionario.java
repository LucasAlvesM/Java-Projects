
public class TesteFuncionario {
	
	 public static void main(String[] args) {
		 
		 Gerente func = new Gerente();
		 func.setNome("Alves");
		 func.setCpf("123-432-432.90");
		 func.setSalario(4980);
		 
		 System.out.println(func.getNome());
		 System.out.println(func.getBonificacao());
	 }
}
