
public class TesteSistema {
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(2222);
		
		SistamaInterno si = new SistamaInterno();
		si.autentica(g);
		si.autentica(cliente);
	}
}
