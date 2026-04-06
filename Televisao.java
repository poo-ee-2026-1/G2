package energia;

public class Televisao extends DispositivoEletrico {

    private int tamanhoPolegadas;

    public Televisao(String nome, double potenciaWatts, int tamanhoPolegadas) {
        super(nome, potenciaWatts);
        this.setTamanhoPolegadas(tamanhoPolegadas);
    }

    @Override
    public double calcularConsumo() {
        return super.calcularConsumo();
    }

	public int getTamanhoPolegadas() {
		return tamanhoPolegadas;
	}

	public void setTamanhoPolegadas(int tamanhoPolegadas) {
		this.tamanhoPolegadas = tamanhoPolegadas;
	}
}
