package Usuario;

import Pessoa.Banda;
import java.util.ArrayList;
import Espaço.Show;
import javax.swing.JOptionPane;

public abstract class Usuario implements Menu {

	protected int senha;
        public static ArrayList<Banda> listabandas = new ArrayList<>();
        public static ArrayList<Show> listashows = new ArrayList<>();

	public Usuario() {

	}

        public Usuario(int senha) {
           this.senha = senha;
        }

        public void imprimirlistabandas(){
            for (int i = 0; i < listabandas.size(); i++) {
                System.out.println(listabandas.get(i));
            }
            }
        public void imprimirlistashows(){
            for (int i = 0; i < listashows.size(); i++) {
                System.out.println(listashows.get(i));
            }
            }
        public static void adicionarshow(Show novo) {
            novo.setAtributos();
            listashows.add(novo);

	    }
	public static void adicionarbanda(Banda nova) {
            nova.setAtributos();
            listabandas.add(nova);
	    }
        public static void login(){
            
            }
        public int menu(){
            return 0; 
        }   
}