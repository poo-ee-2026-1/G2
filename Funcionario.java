package sistema;

public abstract class Funcionario extends Pessoa {
    public Funcionario(String nome, String email) {
        super(nome, email);
    }
}

class Atendente extends Funcionario {
    public Atendente(String nome, String email) {
        super(nome, email);
    }

    public void atenderCliente(Cliente c) {
        System.out.println("Atendendo cliente: " + c.nome);
    }
}

class TecnicoCampo extends Funcionario {
    public TecnicoCampo(String nome, String email) {
        super(nome, email);
    }

    public void verificarUnidade() {
        System.out.println("Verificação realizada.");
    }
}
