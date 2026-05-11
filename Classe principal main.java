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
                    System.out.println("Tipo de cliente: 1-Residencial, 2-Comercial, 3-Industrial");
                    int tipo = sc.nextInt();
                    if (tipo == 2) cliente = new ClienteComercial(nome, email, uc);
                    else if (tipo == 3) cliente = new ClienteIndustrial(nome, email, uc);
                    else cliente = new ClienteResidencial(nome, email, uc);
                    clientes.add(cliente);
                    System.out.println("✅ Cliente cadastrado!");
                    break;
                case 2:
                    if (clientes.isEmpty()) { System.out.println("Vazio."); break; }
                    for (int i = 0; i < clientes.size(); i++) System.out.println(i + " - " + clientes.get(i).nome);
                    int indice = sc.nextInt();
                    if (indice >= 0 && indice < clientes.size()) clienteAtual = clientes.get(indice);
                    break;
                case 3:
                    if (clienteAtual == null) break;
                    System.out.print("Nome: "); String nD = sc.nextLine();
                    System.out.print("W: "); double p = sc.nextDouble();
                    System.out.print("H: "); double h = sc.nextDouble();
                    clienteAtual.unidade.adicionarDispositivo(new Eletrodomestico(nD, p, h));
                    break;
                case 4:
                    if (clienteAtual != null) System.out.println(clienteAtual.unidade.calcularConsumoTotal() + " kWh");
                    break;
                case 5:
                    if (clienteAtual != null) System.out.println("R$ " + SistemaEnergia.calcularCusto(clienteAtual));
                    break;
                case 6: if (clienteAtual != null) clienteAtual.gerarFatura(); break;
                case 7: if (clienteAtual != null) clienteAtual.listarFaturas(); break;
                case 8:
                    System.out.print("Texto: ");
                    if (clienteAtual != null) clienteAtual.registrarReclamacao(sc.nextLine());
                    break;
                case 9: if (clienteAtual != null) clienteAtual.listarReclamacoes(); break;
                case 10: if (clienteAtual != null) SistemaEnergia.detectarAnomalia(clienteAtual); break;
                case 11: SistemaEnergia.sugerirEconomy(); break;
                case 12: if (clienteAtual != null) EmailService.enviar(clienteAtual.email, "Fatura disponível."); break;
                case 13: GraficoTexto.exibir(SimuladorConsumo.gerarConsumoMensal()); break;
                case 0: System.out.println("Saindo..."); break;
            }
        } while (opcao != 0);
        sc.close();
    }
}
