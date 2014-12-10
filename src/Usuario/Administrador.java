package Usuario;

import Espaço.Show;
import Pessoa.Banda;
import Produto.Ingresso;
import javax.swing.JOptionPane;

public class Administrador extends Usuario implements Menu, Autenticavel {

    private int opcao;
    private static final int SENHAFINAL = 5540;

    public Administrador() {

    }

    public Administrador(Administrador copia) {
        super(copia);
        this.opcao = copia.opcao;
    }
    public Administrador(int opcao, int senha) {
        super(senha);
        this.opcao = 0;
    }
    

    public static void adicionarbanda(Banda banda) {
        int f = 0;
        banda.setAtributos();
        listabandas.add(f, banda);
        f++;
    }

    public static void adicionarshow(Show show,Ingresso ingresso) {
        int j = 0;
        show.setAtributos(ingresso);
        listashows.add(j, show);
        j++;
    }

    @Override
    public void imprimirlistabandas() {
        super.imprimirlistabandas();
    }

    @Override
    public void imprimirlistashows() {
        super.imprimirlistashows();
        
    }

    @Override
    public boolean checarautorizacao() {
        return SENHAFINAL == this.senha;
    }

    public int menu(Administrador adm, Banda banda, Show show,Ingresso ingresso) {
        int aux, opcao = 0;

        do {
            senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a senha do administrador ou 0 para sair"));
            if (senha == 0) {
                return 0;
            }
        } while (checarautorizacao() == false);
        JOptionPane.showMessageDialog(null, "Login efetuado!");

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "0 - Sair\n1 - Adicionar nova banda\n2 - Adicionar novo show\n3 - Imprimir a lista de bandas\n4 - Imprimir a lista de shows\n "));
            switch (opcao) {
                case 0:
                    break;
                case 1:
                    Administrador.adicionarbanda(banda);
                    break;
                case 2:
                    Administrador.adicionarshow(show,ingresso);
                    break;
                case 3:
                    adm.imprimirlistabandas();
                    break;
                case 4:
                    adm.imprimirlistashows();
                    break;
            }
        } while (opcao != 0);
        JOptionPane.showMessageDialog(null, "Saiu da administração");
        return 0;
    }
}
