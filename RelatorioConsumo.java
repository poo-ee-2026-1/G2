package energia;

public class RelatorioConsumo {

    private double consumoTotal;
    private double custoTotal;

    public void gerarRelatorio(double consumoTotal, double custoTotal) {

        this.consumoTotal = consumoTotal;
        this.custoTotal = custoTotal;
    }

    public void exibirRelatorio() {

        System.out.println("===== RELATÓRIO =====");
        System.out.println("Consumo Total: " + consumoTotal + " kWh");
        System.out.println("Custo Total: R$ " + custoTotal);
    }
}
