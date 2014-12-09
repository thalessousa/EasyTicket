package Pessoa;

import javax.swing.JOptionPane;

public class Banda {

    private int integrantes;
    private int quantidadedediscos;
    private String genero, gravadora, nome;

    public Banda() {
        this.integrantes = 0;
        this.quantidadedediscos = 0;
        this.genero = "null";
        this.gravadora = "null";
        this.nome = "null";
    }

    public Banda(int integrantes, int quantidadedediscos, String genero, String gravadora, String nome) {
        this.integrantes = integrantes;
        this.quantidadedediscos = quantidadedediscos;
        this.genero = genero;
        this.gravadora = gravadora;
        this.nome = nome;
    }

    public void setAtributos() {

        int aux=0;

        this.nome = JOptionPane.showInputDialog(null, "Insira o nome da banda ");
        while (this.nome.contains("[0123456789]")) {
            this.nome = JOptionPane.showInputDialog(null, "Nome da banda invalido,insira novamente");
        }
        this.gravadora = JOptionPane.showInputDialog(null, "Insira a gravadora da banda ");
        while (this.gravadora.contains("[0123456789]")) {
            this.gravadora = JOptionPane.showInputDialog(null, "Nome de gravadora invalido,insira novamente");
        }
        this.genero = JOptionPane.showInputDialog(null, "Insira o genero da banda ");
        while (this.genero.contains("[0123456789]")) {
            this.genero = JOptionPane.showInputDialog(null, "Genero invalido,insira novamente");
        }
        aux = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de integrantes da banda "));
        while (aux <= 0) {
            aux = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor incorreto, insira novamente"));
            this.integrantes = aux;
        }
        aux = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de discos lançados da banda "));
        while (aux <= 0) {
            aux = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor incorreto, insira novamente"));
            this.quantidadedediscos = aux;
        }
    }

    public void imprimirdados() {
        JOptionPane.showMessageDialog(null, " " + this.toString());

    }

    @Override
    public String toString() {
        return "Banda{" + "Nome = " + nome + ",\n Quantida de Discos = " + quantidadedediscos + ",\n Genero = " + genero + ",\n Gravadora = " + gravadora + ",\n Integrantes = " + integrantes + '}';
    }
}