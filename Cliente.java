package sistema;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente extends Pessoa {

    protected UnidadeConsumidora unidade;
    protected List<Fatura> faturas = new ArrayList<>();
    protected List<Reclamacao> reclamacoes = new ArrayList<>();

    public Cliente(String nome, String email, UnidadeConsumidora unidade) {
        super(nome, email);
        this.unidade = unidade;
    }

    public abstract double getTarifa();

    public void gerarFatura() {
        double consumo = unidade.calcularConsumoTotal();
        double valor = consumo * getTarifa();

        faturas.add(new Fatura(consumo, valor));
    }

    public void listarFaturas() {
        if (faturas.isEmpty()) {
            System.out.println("Nenhuma fatura.");
            return;
        }

        for (Fatura f : faturas) {
            System.out.println(f);
        }
    }

    public void registrarReclamacao(String texto) {
        reclamacoes.add(new Reclamacao(texto));
    }

    public void listarReclamacoes() {
        if (reclamacoes.isEmpty()) {
            System.out.println("Nenhuma reclamação.");
            return;
        }

        for (Reclamacao r : reclamacoes) {
            System.out.println(r);
        }
    }
}

class ClienteResidencial extends Cliente {
    public ClienteResidencial(String nome, String email, UnidadeConsumidora unidade) {
        super(nome, email, unidade);
    }

    public double getTarifa() {
        return 0.75;
    }
}

class ClienteComercial extends Cliente {
    public ClienteComercial(String nome, String email, UnidadeConsumidora unidade) {
        super(nome, email, unidade);
    }

    public double getTarifa() {
        return 0.95;
    }
}

class ClienteIndustrial extends Cliente {
    public ClienteIndustrial(String nome, String email, UnidadeConsumidora unidade) {
        super(nome, email, unidade);
    }

    public double getTarifa() {
        return 1.20;
    }
}
