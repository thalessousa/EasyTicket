package Usuario;


public class Administrador extends Usuario implements Menu, Autorizavel {

	public void adicionarshow() {

	}

	public void adicionarbanda() {

	}


	/**
	 * @see Principal.Usuario.Autorizavel#checarautorizacao()
	 */
	public boolean checarautorizacao() {
		return false;
	}

}
