package sistema;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class SimuladorConsumo {

    public static Map<String, Double> gerarConsumoMensal() {
        Map<String, Double> dados = new LinkedHashMap<>();

        String[] meses = {
                "Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
                "Jul", "Ago", "Set", "Out", "Nov", "Dez"
        };

        Random rand = new Random();

        for (String mes : meses) {
            double valor = 200 + rand.nextDouble() * 300;
            dados.put(mes, valor);
        }

        return dados;
    }
}
