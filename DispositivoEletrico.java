package energia;

public class DispositivoEletrico {

    protected String nome;
    protected double potenciaWatts;
    protected double horasUso;

    public DispositivoEletrico(String nome, double potenciaWatts) {
        this.nome = nome;
        this.potenciaWatts = potenciaWatts;
        this.horasUso = 0;
    }

    public void setHorasUso(double horasUso) {
        this.horasUso = horasUso;
    }

    public double calcularConsumo() {
        return (potenciaWatts * horasUso) / 1000;
    }

    public void exibirInformacoes() {
        System.out.println("Dispositivo: " + nome);
        System.out.println("Potência: " + potenciaWatts + "W");
        System.out.println("Horas de uso: " + horasUso);
        System.out.println("Consumo: " + calcularConsumo() + " kWh");
    }
}
