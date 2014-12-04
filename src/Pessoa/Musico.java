package Pessoa;

public class Musico extends Pessoa {

	private int integrantes;
	private int quantidadedediscos;
        private String genero,gravadora;

    public Musico() {
    }

    public Musico(int integrantes, int quantidadedediscos, String genero, String gravadora, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.integrantes = integrantes;
        this.quantidadedediscos = quantidadedediscos;
        this.genero = genero;
        this.gravadora = gravadora;
    }
}
