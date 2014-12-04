package Usuario;


public class Administrador extends Usuario implements Menu, Autenticavel {

	public void adicionarshow() {

	}

	public void adicionarbanda() {

	}

       @Override
	public boolean checarautorizacao() {
		return true;
	}
    @Override
    public void menu (){
    }

}
