
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setNome("Lucas");
		g.setSalario(5000);
		
		
		EditorVideo ev = new EditorVideo();
		ev.setNome("Alves");
		ev.setSalario(5000);
		
		Designer d = new Designer();
		d.setNome("Alves");
		d.setSalario(5000);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
	}
	
	

}
