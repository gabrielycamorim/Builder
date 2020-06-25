package builder;

import builder.Tipo;
//import refactoring_guru.builder.example.cars.Type;
//import refactoring_guru.builder.example.components.Engine;
//import refactoring_guru.builder.example.components.GPSNavigator;
//import refactoring_guru.builder.example.components.Transmission;
//import refactoring_guru.builder.example.components.TripComputer;

public interface Builder {
	void setTipo(Tipo tipo);
    void setFillers(int fillers);
    void setManga(Manga manga);
    void setEscritor(Escritor escritor);
    void setFinalizado(Finalizado finalizado);

	
	
   
}
