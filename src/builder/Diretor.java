package builder;

public class Diretor {
	 public void criarAnimeNaruto(AnimeBuilder builder) {
	        builder.setTipo(Tipo.Shounen);
	        builder.setFillers(3);
	        builder.setManga(new Manga(700, 702));
	        builder.setEscritor(Escritor.Masashi);
	        builder.setFinalizado(new Finalizado());
	       
	    }

	    public void criarAnimeBokuNoHero(AnimeBuilder builder) {
	        builder.setTipo(Tipo.Shounen);
	        builder.setFillers(12);
	        builder.setManga(new Manga(240, 100));
	        builder.setEscritor(Escritor.Kohei);
	        builder.setFinalizado(new Finalizado());
	       
	    }

	    public void criarAnimeEvangelion(AnimeBuilder builder) {
	        builder.setTipo(Tipo.Mecha);
	        builder.setFillers(6);
	        builder.setManga(new Manga(96, 26));
	        builder.setEscritor(Escritor.Hideaki);
	        builder.setFinalizado(new Finalizado());
	    }

		
	}

