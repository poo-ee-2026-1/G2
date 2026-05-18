package sistema;

import java.util.ArrayList;
import java.util.List;

public class MedidorEnergia {
    private List<LeituraConsumo> leituras = new ArrayList<>();

    public void registrarLeitura(double consumo) {
        leituras.add(new LeituraConsumo(consumo));
    }

    public double getConsumoTotal() {
        double total = 0;

        for (LeituraConsumo l : leituras) {
            total += l.getConsumo();
        }

        return total;
    }
}
