package Pessoa;

public class Musico extends Pessoa {

	protected String nomeartistico;
	protected String genero;
	protected enum instrumentos{GUITARRA,VIOLAO,MICROFONE,TECLADO,BATERIA}
	protected String gravadora;
	private instrumentos instrumentos;  

	public Musico() {

	}
	public Musico(String nomeartistico, String estilo, Enum instrumentos) {

	}
}
