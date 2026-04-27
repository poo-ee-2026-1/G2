import java.util.ArrayList;
import java.util.List;

// Classe base para todos os aparelhos
class Dispositivo {
    String nome;
    double watts;
    int horas;

    Dispositivo(String nome, double watts) {
        this.nome = nome;
        this.watts = watts;
    }

    void setHorasUso(int horas) {
        this.horas = horas;
    }

    double calcularConsumo() {
        return (watts * horas) / 1000.0;
    }
}

// Subclasses simples (Herança)
class Geladeira extends Dispositivo {
    Geladeira(String n, double w, double l) { super(n, w); }
}

class Televisao extends Dispositivo {
    Televisao(String n, double w, int p) { super(n, w); }
}

class ArCondicionado extends Dispositivo {
    ArCondicionado(String n, double w, int b) { super(n, w); }
}

// Lógica de Medição
class MedidorEnergia {
    double valorKwh;
    List<Dispositivo> lista = new ArrayList<>();

    MedidorEnergia(double valor) { this.valorKwh = valor; }

    void adicionarDispositivo(Dispositivo d) { lista.add(d); }

    double calcularConsumoTotal() {
        double total = 0;
        for (Dispositivo d : lista) total += d.calcularConsumo();
        return total;
    }

    double calcularCustoTotal() {
        return calcularConsumoTotal() * valorKwh;
    }
}

// Classes de Usuário e Relatório
class Usuario {
    String nome;
    Usuario(String n, String e) { this.nome = n; }
    void visualizarRelatorio() { System.out.println("Relatório visualizado por: " + nome); }
}

class RelatorioConsumo {
    void gerarRelatorio(double consumo, double custo) {
        System.out.println("\n--- RESULTADO ---");
        System.out.printf("Consumo: %.2f kWh\nCusto: R$ %.2f\n", consumo, custo);
    }
    void exibirRelatorio() { System.out.println("Fim do Relatório."); }
}

// CLASSE PRINCIPAL (Onde o programa começa)
public class Main {
    public static void main(String[] args) {
        // Criando os objetos
        Usuario usuario = new Usuario("João", "Rua A");
        MedidorEnergia medidor = new MedidorEnergia(0.75);

        Dispositivo geladeira = new Geladeira("Geladeira", 150, 400);
        Dispositivo tv = new Televisao("TV", 100, 50);
        Dispositivo ar = new ArCondicionado("Ar", 1200, 9000);

        // Definindo uso
        geladeira.setHorasUso(24);
        tv.setHorasUso(5);
        ar.setHorasUso(8);

        // Adicionando ao medidor
        medidor.adicionarDispositivo(geladeira);
        medidor.adicionarDispositivo(tv);
        medidor.adicionarDispositivo(ar);

        // Calculando
        double consumo = medidor.calcularConsumoTotal();
        double custo = medidor.calcularCustoTotal();

        // Exibindo
        RelatorioConsumo relatorio = new RelatorioConsumo();
        relatorio.gerarRelatorio(consumo, custo);
        relatorio.exibirRelatorio();
        usuario.visualizarRelatorio();
    }
}
