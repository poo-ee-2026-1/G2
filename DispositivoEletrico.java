package sistema;

public abstract class Dispositivo {
    protected String nome;
    protected double potencia;
    protected double horasUso;

    public Dispositivo(String nome, double potencia, double horasUso) {
        this.nome = nome;
        this.potencia = potencia;
        this.horasUso = horasUso;
    }

    public double calcularConsumo() {
        return (potencia * horasUso) / 1000;
    }
}

class Eletrodomestico extends Dispositivo {
    public Eletrodomestico(String nome, double potencia, double horasUso) {
        super(nome, potencia, horasUso);
    }
}

class Eletronico extends Dispositivo {
    public Eletronico(String nome, double potencia, double horasUso) {
        super(nome, potencia, horasUso);
    }
}

class EquipamentoIndustrial extends Dispositivo {
    public EquipamentoIndustrial(String nome, double potencia, double horasUso) {
        super(nome, potencia, horasUso);
    }
}

class EquipamentoComercial extends Dispositivo {
    public EquipamentoComercial(String nome, double potencia, double horasUso) {
        super(nome, potencia, horasUso);
    }
}
