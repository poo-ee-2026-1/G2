package sistema;

import java.util.Date;

public class Reclamacao {
    private String descricao;
    private Date data;

    public Reclamacao(String descricao) {
        this.descricao = descricao;
        this.data = new Date();
    }

    @Override
    public String toString() {
        return data + " - " + descricao;
    }
}
