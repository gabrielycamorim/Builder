package builder;

import builder.Tipo;

public interface Builder {
	void setTipo(Tipo tipo);
    void setFillers(int fillers);
    void setManga(Manga manga);
    void setEscritor(Escritor escritor);
    void setFinalizado(Finalizado finalizado);

	
	
   
}
