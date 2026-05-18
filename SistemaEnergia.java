package sistema;

public class SistemaEnergia {

    public static double calcularCusto(Cliente cliente) {
        double consumo = cliente.unidade.calcularConsumoTotal();
        return consumo * cliente.getTarifa();
    }

    public static void detectarAnomalia(Cliente cliente) {
        double consumo = cliente.unidade.calcularConsumoTotal();

        if (consumo > 500) {
            System.out.println("⚠️ Consumo muito alto detectado!");
        } else {
            System.out.println("✅ Consumo normal.");
        }
    }

    public static void sugerirEconomia() {
        System.out.println("💡 Sugestão: desligar aparelhos fora de uso.");
    }
}
