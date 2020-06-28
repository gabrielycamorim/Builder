package builder;

public class AnimeBuilder {
	private Tipo tipo;
    private int fillers;
    private Manga manga;
    private Escritor escritor;
    private Finalizado finalizado;
   

   
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    
    public void setFillers(int fillers) {
        this.fillers = fillers;
    }

   
    public void setManga(Manga manga) {
        this.manga = manga;
    }

  
    public void setEscritor(Escritor escritor) {
        this.escritor = escritor;
    }

    
    public void setFinalizado(Finalizado finalizado) {
        this.finalizado = finalizado;
    }


    public Anime getResult() {
        return new Anime(tipo, fillers, manga, escritor, finalizado);
    }
}

