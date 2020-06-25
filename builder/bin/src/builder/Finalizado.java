package builder;

public class Finalizado {

    private Anime anime;

    public void setAnimeFinal1(Anime anime) {
        this.anime = anime;
    }

    public void mostraPedido() {
        System.out.println("Pedidos: " + anime.getPedido());
    }

    public void mostraStatus() {
        if (this.anime.getManga().eInicio()) {
            System.out.println("Anime est� listado ");
        } else {
            System.out.println("Anime n�o est� listado");
        }
    }



	public void setAnimeFinal11(Anime anime2) {
		// TODO Auto-generated method stub
		
	}
}

