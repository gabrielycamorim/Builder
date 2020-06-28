package builder;

public class Manga {
	 private final int capitulo;
	    private int episodio;
	    private boolean inicio;

	    public Manga(int capitulo, int episodio) {
	        this.capitulo = capitulo;
	        this.episodio = episodio;
	    }

	    public void on() {
	        inicio = true;
	    }

	    public void off() {
	        inicio = false;
	    }

	    public boolean eInicio() {
	        return inicio;
	    }

	    public void go(double episodio) {
	        if (inicio) {
	            this.episodio += episodio;
	        } else {
	            System.err.println("Coloque o anime primeiro");
	        }
	    }

	    public double getCapitulo() {
	        return capitulo;
	    }

	    public double getEpisodio() {
	        return episodio;
	    }
	}

