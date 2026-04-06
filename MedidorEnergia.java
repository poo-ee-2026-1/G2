package energia;

import java.util.ArrayList;

public class MedidorEnergia {

    private ArrayList<DispositivoEletrico> dispositivos;
    private double tarifaEnergia;

    public MedidorEnergia(double tarifaEnergia) {
        this.tarifaEnergia = tarifaEnergia;
        dispositivos = new ArrayList<>();
    }

    public void adicionarDispositivo(DispositivoEletrico d) {
        dispositivos.add(d);
    }

    public double calcularConsumoTotal() {

        double total = 0;

        for (DispositivoEletrico d : dispositivos) {
            total += d.calcularConsumo();
        }

        return total;
    }

    public double calcularCustoTotal() {

        return calcularConsumoTotal() * tarifaEnergia;
    }

    public void listarDispositivos() {

        for (DispositivoEletrico d : dispositivos) {
            d.exibirInformacoes();
        }
    }
}
