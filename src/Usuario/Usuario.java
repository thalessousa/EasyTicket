package Usuario;

import Pessoa.Banda;
import java.util.ArrayList;
import Espaço.Show;
import Produto.Ingresso;
import javax.swing.JOptionPane;

public abstract class Usuario implements Menu,Autenticavel,Comprar {

	protected int senha;
        public static ArrayList<Banda> listabandas = new ArrayList<>();
        public static ArrayList<Show> listashows = new ArrayList<>();
        public static ArrayList<Cliente> listacliente = new ArrayList<>();

	public Usuario() {

	}

        public Usuario(int senha) {
           this.senha = 0;
        }
        public Usuario(Usuario copia){
            this.senha = copia.senha;
        }

        public void imprimirlistabandas(){
            for (int i = 0; i < listabandas.size(); i++) {
                JOptionPane.showMessageDialog(null,listabandas.get(i));
            }
            }
        public void imprimirlistashows(){
            for (int i = 0; i < listashows.size(); i++) {
                JOptionPane.showMessageDialog(null,(listashows.get(i)));
            }
            }
        public static void adicionarshow(Show show,Ingresso ingresso) {
            show.setAtributos(ingresso);
            listashows.add(show);

	    }
	public static void adicionarbanda(Banda nova) {
            nova.setAtributos();
            listabandas.add(nova);
	    }
        public static void login(){
            
            }
        @Override
        public int menu(){
            return 0; 
        }   

    @Override
    public boolean checarautorizacao() {
        return true;
    }

    @Override
    public void compraringresso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comprardiscovinil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comprardiscocompacto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comprardiscodvd() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}