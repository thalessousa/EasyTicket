package Pessoa;

import javax.swing.JOptionPane;

public class Banda {

    private int integrantes;
    private int quantidadedediscos;
    private String genero, gravadora, nome;

    public Banda() {
        this.integrantes = 0;
        this.quantidadedediscos = 0;
        this.genero = "";
        this.gravadora = "";
        this.nome = "";
    }

    public Banda(int integrantes, int quantidadedediscos, String genero, String gravadora, String nome) {
        this.integrantes = integrantes;
        this.quantidadedediscos = quantidadedediscos;
        this.genero = genero;
        this.gravadora = gravadora;
        this.nome = nome;
    }

    public void setAtributos() {

        int aux = 0;

        this.nome = JOptionPane.showInputDialog(null, "Insira o nome da banda ");
        while (validar_nome(nome) == false) {
            this.nome = JOptionPane.showInputDialog(null, "Nome da banda invalido,insira novamente");
        }
        this.gravadora = JOptionPane.showInputDialog(null, "Insira a gravadora da banda ");
        while (validar_nome(gravadora) == false) {
            this.gravadora = JOptionPane.showInputDialog(null, "Nome de gravadora invalido,insira novamente");
        }
        this.genero = JOptionPane.showInputDialog(null, "Insira o genero da banda ");
        while (validar_nome(genero) == false) {
            this.genero = JOptionPane.showInputDialog(null, "Genero invalido,insira novamente");
        }
        aux = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de integrantes da banda "));
        this.integrantes = aux;

        aux = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de discos lançados da banda "));
        this.quantidadedediscos = aux;
    }

    public boolean validar_nome(String arg3) {
        return arg3.matches("[a-zA-Z]{1,10}(\\s)[a-zA-Z]{1,10}");
    }

    public void imprimirdados() {
        JOptionPane.showMessageDialog(null, " " + this.toString());

    }

    @Override
    public String toString() {
        return "Banda\n" + "Nome = " + nome + ",\n Quantida de Discos = " + quantidadedediscos + ",\n Genero = " + genero + ",\n Gravadora = " + gravadora + ",\n Integrantes = " + integrantes + '}';
    }
}