package sistema;

import java.util.Map;

public class GraficoTexto {

    public static void exibir(Map<String, Double> dados) {

        System.out.println("\n📊 CONSUMO MENSAL");

        for (String mes : dados.keySet()) {

            int barras = (int) (dados.get(mes) / 10);

            System.out.print(mes + " | ");

            for (int i = 0; i < barras; i++) {
                System.out.print("█");
            }

            System.out.printf(" %.2f kWh\n", dados.get(mes));
        }
    }
}
