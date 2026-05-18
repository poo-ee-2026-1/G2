package sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Cliente> clientes = new ArrayList<>();
        Cliente clienteAtual = null;

        int opcao;

        do {

            System.out.println("\n========= SISTEMA DE ENERGIA =========");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Selecionar cliente");
            System.out.println("3 - Adicionar dispositivo");
            System.out.println("4 - Ver consumo total");
            System.out.println("5 - Calcular custo");
            System.out.println("6 - Gerar fatura");
            System.out.println("7 - Listar faturas");
            System.out.println("8 - Registrar reclamação");
            System.out.println("9 - Ver reclamações");
            System.out.println("10 - Detectar anomalia");
            System.out.println("11 - Sugestão de economia");
            System.out.println("12 - Enviar email");
            System.out.println("13 - Ver gráfico de consumo");
            System.out.println("0 - Sair");

            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    System.out.print("Rua: ");
                    String rua = sc.nextLine();

                    System.out.print("Cidade: ");
                    String cidade = sc.nextLine();

                    System.out.print("Estado: ");
                    String estado = sc.nextLine();

                    Endereco endereco = new Endereco(rua, cidade, estado);
                    UnidadeConsumidora uc = new UnidadeConsumidora(clientes.size() + 1, endereco);

                    System.out.println("Tipo de cliente:");
                    System.out.println("1 - Residencial");
                    System.out.println("2 - Comercial");
                    System.out.println("3 - Industrial");

                    int tipo = sc.nextInt();
                    sc.nextLine();

                    Cliente cliente;

                    if (tipo == 2) {
                        cliente = new ClienteComercial(nome, email, uc);
                    } else if (tipo == 3) {
                        cliente = new ClienteIndustrial(nome, email, uc);
                    } else {
                        cliente = new ClienteResidencial(nome, email, uc);
                    }

                    clientes.add(cliente);

                    System.out.println("✅ Cliente cadastrado com sucesso!");
                    break;

                case 2:

                    if (clientes.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado.");
                        break;
                    }

                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println(i + " - " + clientes.get(i).nome);
                    }

                    System.out.print("Escolha o cliente: ");
                    int indice = sc.nextInt();
                    sc.nextLine();

                    if (indice >= 0 && indice < clientes.size()) {
                        clienteAtual = clientes.get(indice);
                        System.out.println("Cliente selecionado: " + clienteAtual.nome);
                    } else {
                        System.out.println("Cliente inválido.");
                    }

                    break;

                case 3:

                    if (clienteAtual == null) {
                        System.out.println("Selecione um cliente primeiro.");
                        break;
                    }

                    System.out.print("Nome do dispositivo: ");
                    String nomeDisp = sc.nextLine();

                    System.out.print("Potência (W): ");
                    double potencia = sc.nextDouble();

                    System.out.print("Horas de uso por dia: ");
                    double horas = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Tipo:");
                    System.out.println("1 - Eletrodoméstico");
                    System.out.println("2 - Eletrônico");
                    System.out.println("3 - Equipamento Industrial");
                    System.out.println("4 - Equipamento Comercial");

                    int tipoDisp = sc.nextInt();
                    sc.nextLine();

                    Dispositivo d;

                    switch (tipoDisp) {
                        case 1:
                            d = new Eletrodomestico(nomeDisp, potencia, horas);
                            break;
                        case 3:
                            d = new EquipamentoIndustrial(nomeDisp, potencia, horas);
                            break;
                        case 4:
                            d = new EquipamentoComercial(nomeDisp, potencia, horas);
                            break;
                        default:
                            d = new Eletronico(nomeDisp, potencia, horas);
                    }

                    clienteAtual.unidade.adicionarDispositivo(d);
                    System.out.println("✅ Dispositivo adicionado!");
                    break;

                case 4:

                    if (clienteAtual == null) {
                        System.out.println("Selecione um cliente primeiro.");
                        break;
                    }

                    double consumo = clienteAtual.unidade.calcularConsumoTotal();
                    System.out.println("🔌 Consumo total: " + consumo + " kWh");
                    break;

                case 5:

                    if (clienteAtual == null) {
                        System.out.println("Selecione um cliente primeiro.");
                        break;
                    }

                    double custo = SistemaEnergia.calcularCusto(clienteAtual);
                    System.out.println("💰 Custo estimado: R$ " + custo);
                    break;

                case 6:

                    if (clienteAtual == null) {
                        System.out.println("Selecione um cliente primeiro.");
                        break;
                    }

                    clienteAtual.gerarFatura();
                    System.out.println("✅ Fatura gerada!");
                    break;

                case 7:

                    if (clienteAtual == null) {
                        System.out.println("Selecione um cliente primeiro.");
                        break;
                    }

                    clienteAtual.listarFaturas();
                    break;

                case 8:

                    if (clienteAtual == null) {
                        System.out.println("Selecione um cliente primeiro.");
                        break;
                    }

                    System.out.print("Digite a reclamação: ");
                    String texto = sc.nextLine();

                    clienteAtual.registrarReclamacao(texto);
                    System.out.println("✅ Reclamação registrada!");
                    break;

                case 9:

                    if (clienteAtual == null) {
                        System.out.println("Selecione um cliente primeiro.");
                        break;
                    }

                    clienteAtual.listarReclamacoes();
                    break;

                case 10:

                    if (clienteAtual == null) {
                        System.out.println("Selecione um cliente primeiro.");
                        break;
                    }

                    SistemaEnergia.detectarAnomalia(clienteAtual);
                    break;

                case 11:
                    SistemaEnergia.sugerirEconomia();
                    break;

                case 12:

                    if (clienteAtual == null) {
                        System.out.println("Selecione um cliente primeiro.");
                        break;
                    }

                    EmailService.enviar(clienteAtual.email, "Sua fatura está disponível.");
                    break;

                case 13:

                    Map<String, Double> dados = SimuladorConsumo.gerarConsumoMensal();
                    GraficoTexto.exibir(dados);
                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
