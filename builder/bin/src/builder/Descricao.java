package builder;

public class Descricao {
	
	private final Tipo tipo;
    private final int fillers;
    private final Manga manga;
    private final Escritor escritor;
    private final Finalizado finalizado;
  

	    public Descricao(Tipo tipo, int fillers, Manga manga, Escritor escritor,
	               Finalizado finalizado) {
	    	this.tipo = tipo;
	        this.fillers = fillers;
	        this.manga = manga;
	        this.escritor = escritor;
	        this.finalizado = finalizado;
	       
	    }

	    public String print() {
	        String info = "";
	        info += "Tipo de anime: " + tipo + "\n";
	        info += "Quantidade de fillers: " + fillers + "\n";
	        info += "Manga: capitulo- " + manga.getCapitulo() + "; episodio - " + manga.getEpisodio() + "\n";
	        info += "Escritor: "+ escritor + "\n";
	        if (this.finalizado != null) {
	            info += "Finalizado: Sim" + "\n";
	        } else {
	            info += "Finalizado: Nao" + "\n";
	        }
	        
	        return info;
	    }
	}

