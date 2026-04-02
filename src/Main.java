void main() {
    Scanner scanner = new Scanner(System.in);
    double saldo = 2500;
    int decisao = 0;
    System.out.println("Infome seu nome: ");
    String nome = scanner.nextLine();
    System.out.printf("""
                
                
                ***************
                DADOS DO CLIENTE
                ***************
                Nome do cliente: %s
                Tipo de conta: Corrente
                Saldo inicial: R$ %.2f
                
                
                """, nome, saldo);

    while(decisao != 4) {
        System.out.println("""
                
                
                Operações:
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                
                
                """);
        decisao = scanner.nextInt();
        switch (decisao) {
            case 1: {
                System.out.printf("""
                            Opção 1: Consulta de Saldo.
                            Saldo em conta: %.2f
                            """, saldo);
                break;
            }
            case 2: {
                System.out.println("""
                            Opção 2: Receber valor
                            Digite o valor a receber:
                            """);
                saldo += scanner.nextDouble();
                System.out.printf("""
                            Saldo em conta: %.2f
                            """, saldo);
                break;
            }
            case 3: {
                System.out.println("""
                            Opção 2: Transferir valor
                            Digite o valor a transferir:
                            """);
                double verificacao = scanner.nextDouble();
                if (saldo < verificacao) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= verificacao;
                    System.out.printf("""
                                Saldo em conta: %.2f
                                """, saldo);
                }
                break;
            }
            default: {
                System.out.println("Informe um número válido");
                break;
            }
        }
    }
    System.out.println("Serviço finalizado");

}


