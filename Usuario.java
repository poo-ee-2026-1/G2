package energia;

public class Usuario {

    private String nome;
    private String endereco;

    public Usuario(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void visualizarRelatorio() {

        System.out.println("Usuário: " + nome);
        System.out.println("Endereço: " + endereco);
    }
}
