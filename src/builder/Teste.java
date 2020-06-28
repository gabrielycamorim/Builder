package builder;

public class Teste {
	

	    public static void main(String[] args) {
	        Diretor diretor = new Diretor();

	        AnimeBuilder builder = new AnimeBuilder();
	        diretor.criarAnimeNaruto(builder);

	        Anime anime = builder.getResult();
	        System.out.println("Tipo de anime:\n" + anime.getTipo());

	        AnimeDescricaoBuilder descricao = new AnimeDescricaoBuilder();
	        
	        diretor.criarAnimeNaruto(builder);
	        Descricao animeDescricao = descricao.getResult();
	        System.out.println("\nCar manual built:\n" + animeDescricao.print());
	    }

	}

