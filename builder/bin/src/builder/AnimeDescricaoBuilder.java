package builder;

public class AnimeDescricaoBuilder implements Builder {
	
	    private Tipo tipo;
	    private int fillers;
	    private Manga manga;
	    private Escritor escritor;
	    private Finalizado finalizado;
	 
	    public void setTipo(Tipo tipo) {
	        this.tipo = tipo;
	    }

	    @Override
	    public void setFillers(int fillers) {
	        this.fillers = fillers;
	    }

	    @Override
	    public void setManga(Manga manga) {
	        this.manga = manga;
	    }

	    @Override
	    public void setEscritor(Escritor escritor) {
	        this.escritor = escritor;
	    }

	    @Override
	    public void setFinalizado(Finalizado finalizado) {
	        this.finalizado = finalizado;
	    }


	    public Descricao getResult() {
	        return new Descricao(tipo, fillers, manga, escritor, finalizado);
	    }
 }

