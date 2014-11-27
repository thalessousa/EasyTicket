package Principal.Usuario;

public class Cliente extends Usuario implements Menu, Comprar, Autorizavel {

	private String nome;

	private int cpf;

	public Cliente() {

	}

	public Cliente(String nome) {

	}


	/**
	 * @see Principal.Usuario.Comprar#compraringresso()
	 */
	public void compraringresso() {

	}


	/**
	 * @see Principal.Usuario.Comprar#comprardiscovinil()
	 */
	public void comprardiscovinil() {

	}


	/**
	 * @see Principal.Usuario.Comprar#comprardiscocompacto()
	 */
	public void comprardiscocompacto() {

	}


	/**
	 * @see Principal.Usuario.Comprar#comprardiscodvd()
	 */
	public void comprardiscodvd() {

	}


	/**
	 * @see Principal.Usuario.Autorizavel#checarautorizacao()
	 */
	public boolean checarautorizacao() {
		return false;
	}

}
