package Usuario;

public class Cliente extends Usuario implements Menu, Comprar, Autorizavel {

	private String nome;
	private int cpf;

   
        public Cliente() {
    }

    public Cliente(String nome, int cpf, int senha, int login) {
        super(senha, login);
        this.nome = nome;
        this.cpf = cpf;
    }

	public void compraringresso() {

	}

	public void comprardiscovinil() {

	}

	public void comprardiscocompacto() {

	}

	public void comprardiscodvd() {

	}

	public boolean checarautorizacao() {
		return false;
	}

}
