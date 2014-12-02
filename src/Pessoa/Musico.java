package Pessoa;

public class Musico extends Pessoa {

	protected String nomeartistico;
	protected String genero;
	protected String gravadora;

    public Musico() {
    }

    public Musico(String nomeartistico, String genero, String gravadora, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.nomeartistico = nomeartistico;
        this.genero = genero;
        this.gravadora = gravadora;
    }

}
