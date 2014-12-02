package Pessoa;

public class Banda extends Musico {

	private int integrantes;
	private int quantidadedediscos;   
        protected enum instrumentos{GUITARRA,VIOLAO,MICROFONE,TECLADO,BATERIA}
	protected instrumentos instrumento;  

    public Banda() {
    }

    public Banda(int integrantes, int quantidadedediscos, instrumentos instrumento, String nomeartistico, String genero, String gravadora, String nome, int idade, String sexo) {
        super(nomeartistico, genero, gravadora, nome, idade, sexo);
        this.integrantes = integrantes;
        this.quantidadedediscos = quantidadedediscos;
        this.instrumento = instrumento;
    }


}