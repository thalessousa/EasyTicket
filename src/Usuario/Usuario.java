package Usuario;

import Pessoa.Banda;
import java.util.ArrayList;

public abstract class Usuario {

	protected int senha;
	protected int login;
        public static ArrayList<Banda> listabandas= new ArrayList<>();

	public Usuario() {

	}

    public Usuario(int senha, int login) {
        this.senha = senha;
        this.login = login;
    }

    
    public void imprimirlista(){
            for (int i = 0; i < listabandas.size(); i++) {
                System.out.println(listabandas.get(i));
            }
            }
}