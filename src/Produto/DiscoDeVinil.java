package Produto;

public class DiscoDeVinil extends Disco {

	private String capacidade;

    public DiscoDeVinil() {
    }

    public DiscoDeVinil(String capacidade, int numeromusicas, String estilo, String nome) {
        super(numeromusicas, estilo, nome);
        this.capacidade = capacidade;
    }
         
}
