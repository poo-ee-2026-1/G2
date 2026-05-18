package sistema;

public class EmailService {
    public static void enviar(String email, String mensagem) {
        System.out.println("📧 Email enviado para " + email);
        System.out.println("Mensagem: " + mensagem);
    }
}
