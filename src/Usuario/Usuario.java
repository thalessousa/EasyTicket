package Usuario;

public abstract class Usuario {

	protected int senha;
	protected int login;

	public Usuario() {

	}

    public Usuario(int senha, int login) {
        this.senha = senha;
        this.login = login;
    }

}
