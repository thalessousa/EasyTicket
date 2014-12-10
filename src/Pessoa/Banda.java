package Pessoa;

import javax.swing.JOptionPane;

public class Banda extends Pessoa {

    private int integrantes;
    public int quantidadedediscos;
    private String genero, gravadora;
    private static String nome;

    public Banda() {
        this.integrantes = 0;
        this.quantidadedediscos = 0;
        this.genero = "";
        this.gravadora = "";
        Banda.nome = "";
    }

    public Banda(int integrantes, int quantidadedediscos, String genero, String gravadora, String nome) {
        this.integrantes = integrantes;
        this.quantidadedediscos = quantidadedediscos;
        this.genero = genero;
        this.gravadora = gravadora;
        Banda.nome = nome;
    }

    public Banda(Banda copia) {
        this.integrantes = copia.integrantes;
        this.quantidadedediscos = copia.quantidadedediscos;
        this.genero = copia.genero;
        this.gravadora = copia.gravadora;
        Banda.nome = copia.nome;
    }

    public void setAtributos() {

        int aux = 0;

        Banda.nome = JOptionPane.showInputDialog(null, "Insira o nome da banda\n (Exemplo: Nome1 Nome2) ");
        while (validar_nome2(nome) == false) {
            Banda.nome = JOptionPane.showInputDialog(null, "Nome da banda invalido,insira novamente\n (Exemplo: Nome1 Nome2)");
        }
        this.gravadora = JOptionPane.showInputDialog(null, "Insira a gravadora da banda\n (Exemplo: Nome1 Nome2) ");
        while (validar_nome2(gravadora) == false) {
            this.gravadora = JOptionPane.showInputDialog(null, "Nome de gravadora invalido,insira novamente\n (Exemplo: Nome1 Nome2)");
        }
        this.genero = JOptionPane.showInputDialog(null, "Insira o genero da banda ");

        aux = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de integrantes da banda "));
        this.integrantes = aux;

        aux = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de discos lançados da banda "));
        this.quantidadedediscos = aux;
    }

    public static boolean validar_nome2(String arg3) {
        return arg3.matches("[a-zA-Z]{1,10}(\\s)[a-zA-Z]{1,10}");
    }

    public void imprimirdados() {
        JOptionPane.showMessageDialog(null, " " + this.toString());

    }

    @Override
    public String toString() {
        return "Banda\n" + "Nome = " + nome + ",\n Quantida de Discos = " + quantidadedediscos + ",\n Genero = " + genero + ",\n Gravadora = " + gravadora + ",\n Integrantes = " + integrantes + '}';
    }

    public static String getNome() {
        return nome;
    }
}
