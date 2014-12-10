package Usuario;

import javax.swing.JOptionPane;

public class Moderador extends Usuario implements Menu, Autenticavel {

    private static final int SENHAFINAL = 4500;

    public Moderador() {

    }

    public void criarcliente(Cliente cliente) {
        Cliente.setCliente();
        listacliente.add(cliente);

    }

    @Override
    public boolean checarautorizacao() {
        return SENHAFINAL == this.senha;
    }

    public int menu(Moderador moderador, Cliente cliente) {

        int aux, opcao = 0;
        do {
            senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira novamente a senha do moderador ou 0 para sair"));
            if (senha == 0) {
                return 0;
            }
        } while (checarautorizacao() == false);
        JOptionPane.showMessageDialog(null, "Login efetuado!");
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "0 - Sair\n1 - Criar cliente  "));
            switch (opcao) {
                case 0:
                    break;
                case 1:
                    moderador.criarcliente(cliente);
                    break;
            }
        } while (opcao != 0);
        JOptionPane.showMessageDialog(null, "Saiu da moderação ");
        return 0;
    }

}
