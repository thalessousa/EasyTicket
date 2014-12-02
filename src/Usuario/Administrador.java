package Usuario;


public class Administrador extends Usuario implements Menu, Autorizavel {

	public void adicionarshow() {

	}

	public void adicionarbanda() {

	}

       @Override
	public boolean checarautorizacao() {
		return true;
	}

}
