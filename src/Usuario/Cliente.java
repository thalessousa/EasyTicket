package Usuario;

public class Cliente extends Usuario implements Menu, Comprar, Autenticavel {

	private static String nome,email;
	private int cpf;

   
        public Cliente() {
    }

    public Cliente(String nome, int cpf, int senha, int login, String email) {
        super(senha, login);
        Cliente.nome = nome;
        this.cpf = cpf;
        Cliente.email = email;
    }

        @Override
	public void compraringresso() {

	}

        @Override
	public void comprardiscovinil() {

	}

        @Override
	public void comprardiscocompacto() {

	}

        @Override
	public void comprardiscodvd() {

	}

        @Override
	public boolean checarautorizacao() {
		return false;
	}
    @Override
    public void menu (){
        
    }
}
