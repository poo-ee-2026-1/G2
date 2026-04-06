package energia;

public class Geladeira extends DispositivoEletrico {

    private double capacidadeLitros;

    public Geladeira(String nome, double potenciaWatts, double capacidadeLitros) {
        super(nome, potenciaWatts);
        this.setCapacidadeLitros(capacidadeLitros);
    }

    @Override
    public double calcularConsumo() {
        return super.calcularConsumo();
    }

	public double getCapacidadeLitros() {
		return capacidadeLitros;
	}

	public void setCapacidadeLitros(double capacidadeLitros) {
		this.capacidadeLitros = capacidadeLitros;
	}
}
