package sistema;

public class Fatura {
    private double consumo;
    private double valor;
    private boolean paga;

    public Fatura(double consumo, double valor) {
        this.consumo = consumo;
        this.valor = valor;
        this.paga = false;
    }

    public void pagar() {
        paga = true;
    }

    @Override
    public String toString() {
        return "Consumo: " + consumo + " kWh | Valor: R$ " + valor +
                " | Status: " + (paga ? "PAGA" : "PENDENTE");
    }
}
