package Usuario;

import javax.swing.JOptionPane;

public class Moderador extends Usuario implements Menu, Autenticavel {

    public Moderador() {
        this.senha = 4154;
    }

    public Moderador(int senha, int login) {
        super(senha);

    }

    public void criarcliente(Cliente cliente) {
        Cliente.setCliente();
        listacliente.add(cliente);

    }

    @Override
    public boolean checarautorizacao() {
        if (senha != this.senha) {
            return false;
        } else {
            return true;
        }
    }

    public int menu(Moderador moderador, Cliente cliente) {

        int aux, opcao = 0;

        do {
            senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a senha do moderador ou 0 para sair"));
        } while (checarautorizacao() == false);
        
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