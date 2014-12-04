package Usuario;

import Pessoa.Banda;


public class Administrador extends Usuario implements Menu, Autenticavel {
         
	public void adicionarshow() {

	}

	public static void adicionarbanda(Banda nova) {
            nova.setAtributos();
            listabandas.add(nova);
	}
        
       @Override
	public boolean checarautorizacao() {
		return true;
	}
        
        @Override
        public void imprimirlista(){
            super.imprimirlista();
        }
    @Override
    public void menu (){
    }

}
