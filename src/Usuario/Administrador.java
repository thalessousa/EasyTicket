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

    public static void adicionarbanda(Banda banda) {
        banda.setAtributos();
        listabandas.add(banda);
    }

    public static void adicionarshow(Show show) {
        show.setAtributos();
        listashows.add(show);
    }

    @Override
    public void imprimirlistabandas() {
        super.imprimirlistabandas();
    }

    public void imprimirlistashows(Banda banda) {
        super.imprimirlistashows();
        banda.imprimirdados();
    }

    @Override
    public boolean checarautorizacao() {
        if (senha == this.senha) {
            return true;
        } else {
            return false;
        }
    }

    public int menu(Administrador adm, Banda banda, Show show) {
        int aux, opcao = 0;

        do {
            senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a senha do administrador ou 0 para sair"));
        } while (checarautorizacao() == false);

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "0 - Sair\n1 - Adicionar nova banda\n2 - Adicionar novo show\n3 - Imprimir a lista de bandas\n4 - Imprimir a lista de shows\n "));
            switch (opcao) {
                case 0:
                    break;
                case 1:
                    Administrador.adicionarbanda(banda);
                    break;
                case 2:
                    Administrador.adicionarshow(show);
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