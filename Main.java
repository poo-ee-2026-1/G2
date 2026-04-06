package energia;

public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario(
                "João",
                "Rua A");

        MedidorEnergia medidor =
                new MedidorEnergia(0.75);

        Geladeira geladeira =
                new Geladeira(
                        "Geladeira Brastemp",
                        150,
                        400);

        Televisao tv =
                new Televisao(
                        "TV Samsung",
                        100,
                        50);

        ArCondicionado ar =
                new ArCondicionado(
                        "Ar Split",
                        1200,
                        9000);

        geladeira.setHorasUso(24);
        tv.setHorasUso(5);
        ar.setHorasUso(8);

        medidor.adicionarDispositivo(geladeira);
        medidor.adicionarDispositivo(tv);
        medidor.adicionarDispositivo(ar);

        medidor.listarDispositivos();

        double consumo =
                medidor.calcularConsumoTotal();

        double custo =
                medidor.calcularCustoTotal();

        RelatorioConsumo relatorio =
                new RelatorioConsumo();

        relatorio.gerarRelatorio(consumo, custo);

        relatorio.exibirRelatorio();
        usuario.visualizarRelatorio();
    }
}
