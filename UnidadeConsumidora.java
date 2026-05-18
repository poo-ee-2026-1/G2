package sistema;

import java.util.ArrayList;
import java.util.List;

public class UnidadeConsumidora {
    private int id;
    private Endereco endereco;
    private List<Dispositivo> dispositivos = new ArrayList<>();
    private MedidorEnergia medidor = new MedidorEnergia();

    public UnidadeConsumidora(int id, Endereco endereco) {
        this.id = id;
        this.endereco = endereco;
    }

    public void adicionarDispositivo(Dispositivo d) {
        dispositivos.add(d);
    }

    public double calcularConsumoTotal() {
        double total = 0;

        for (Dispositivo d : dispositivos) {
            total += d.calcularConsumo();
        }

        return total;
    }

    public MedidorEnergia getMedidor() {
        return medidor;
    }
}
