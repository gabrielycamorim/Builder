package builder;

public class Anime {
	private final Tipo tipo;
    private final int fillers;
    private final Manga manga;
    private final Escritor escritor;
    private final Finalizado finalizado;
    private double pedido = 0;

    public Anime(Tipo tipo, int fillers, Manga manga, Escritor escritor,
               Finalizado finalizado) {
        this.tipo = tipo;
        this.fillers = fillers;
        this.manga = manga;
        this.escritor = escritor;
        this.finalizado = finalizado;
      
    }

    public Tipo getTipo() {
        return tipo;
    }

    public double getPedido() {
        return pedido;
    }

    public void setPedido(double pedido) {
        this.pedido = pedido;
    }

    public int getFillers() {
        return fillers;
    }

    public Manga getManga() {
        return manga;
    }

    public Escritor getEscritor() {
        return escritor;
    }

    public Finalizado getFinalizado() {
        return finalizado;
    }

    
}

