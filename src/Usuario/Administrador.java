package Usuario;

import Espaço.Show;
import Pessoa.Banda;
import javax.swing.JOptionPane;


public class Administrador extends Usuario implements Menu, Autenticavel {
    private int opcao;
        
    public Administrador() {
        this.senha = 5540;
    }
 
    public Administrador(int senha) {
        super(senha);
        this.senha = 5540;
    }
        
	public static void adicionarbanda(Banda nova) {
            nova.setAtributos();
            listabandas.add(nova);
	}
        
        public static void adicionarshow(Show novo) {
            novo.setAtributos();
            listashows.add(novo);
	}
      
        @Override
        public void imprimirlistabandas(){
            super.imprimirlistabandas();
        }
        
        @Override
        public void imprimirlistashows(){
             super.imprimirlistashows();
        }
       
        @Override
	public boolean checarautorizacao() {
            if(senha==this.senha);
	    return true;
	}   
        
        public int menu (Administrador adm,Banda banda,Show show){
            int aux,opcao = 0;
        int senha=Integer.parseInt(JOptionPane.showInputDialog(null,"digite a senha do administrador ou 0 para sair"));
        
            do{
                senha=Integer.parseInt(JOptionPane.showInputDialog(null,"Insira novamente a senha do administrador ou 0 para sair"));
            }
            while(senha!=this.senha);
                checarautorizacao();
                do{
            aux = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a quantidade de integrantes da banda "));
              while(aux<0)
               aux = Integer.parseInt(JOptionPane.showInputDialog("Valor incorreto, insira novamente"));
               this.opcao= aux;
                switch(opcao){
                case 0: break;
                case 1: Administrador.adicionarbanda(banda);
                case 2: Administrador.adicionarshow(show);
                case 3: adm.imprimirlistabandas();
                case 4: adm.imprimirlistashows();
                }
        }
          while(senha!=0);
          JOptionPane.showMessageDialog(null, "Saiu da administração");
        return 0;
    }
}
