package energia;

public class ArCondicionado extends DispositivoEletrico {

    private int btus;

    public ArCondicionado(String nome, double potenciaWatts, int btus) {
        super(nome, potenciaWatts);
        this.setBtus(btus);
    }

    @Override
    public double calcularConsumo() {
        return super.calcularConsumo();
    }

	public int getBtus() {
		return btus;
	}

	public void setBtus(int btus) {
		this.btus = btus;
	}
}

