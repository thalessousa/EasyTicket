package Produto;

public abstract class Disco extends Produto {

	protected int numeromusicas;
	protected String estilo;
        
	public Disco(){
        }

    public Disco(int numeromusicas, String estilo, String nome) {
        super(nome);
        this.numeromusicas = numeromusicas;
        this.estilo = estilo;
    }

}
