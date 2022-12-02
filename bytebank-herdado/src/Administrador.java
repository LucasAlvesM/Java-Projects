
public class Administrador extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;

	public double getBonificacao() {
		return super.getSalario();
	}

	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		boolean autenticou = this.autenticador.autentica(senha);
		return autenticou;
	
    }
}  
