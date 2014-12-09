package Usuario;

import java.util.ArrayList;

public class Moderador extends Usuario implements Menu {
    
    public static ArrayList<Cliente> listacliente = new ArrayList<>();
    public static ArrayList<Administrador> listaadm = new ArrayList<>();

    public Moderador() {
        this.senha = 4154;
    }

    public Moderador(int senha, int login) {
        super(senha);
        
    }

    public void criarcliente(Cliente novo){
        listacliente.add(novo);
        
    }
    public void criaradm(Administrador adm){
        listaadm.add(adm);
        
    }
    @Override
    public int menu (){
        return 0;  
    }
}
