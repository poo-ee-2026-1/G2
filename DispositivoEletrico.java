abstract class DispositivoEletrico {
    protected String nome;
    protected double potenciaWatts;
    protected double horasUsoPorDia;

    public DispositivoEletrico(String nome, double potenciaWatts, double horasUsoPorDia) {
        this.nome = nome;
        this.potenciaWatts = potenciaWatts;
        this.horasUsoPorDia = horasUsoPorDia;
    }

    public double calcularConsumoDiario() {
        return (potenciaWatts * horasUsoPorDia) / 1000; // kWh
    }

    public abstract String getTipo();
}

class Lampada extends DispositivoEletrico {
    public Lampada(String nome, double potencia, double horas) {
        super(nome, potencia, horas);
    }

    @Override
    public String getTipo() {
        return "Iluminação";
    }
}

class ArCondicionado extends DispositivoEletrico {
    public ArCondicionado(String nome, double potencia, double horas) {
        super(nome, potencia, horas);
    }

    @Override
    public String getTipo() {
        return "Climatização";
    }
}

class Televisao extends DispositivoEletrico {
    public Televisao(String nome, double potencia, double horas) {
        super(nome, potencia, horas);
    }

    @Override
    public String getTipo() {
        return "Entretenimento (linha marrom)";
    }
}
