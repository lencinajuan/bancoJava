import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        //Dados da conta, inicialização do cliente do Banco
        String nome = "Juan Lencina";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("********************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n********************");

        //Menu de opções
        String menu = """
                ** Digite sua opção:
                1 - Consultar saldo
                2 - Transferência
                3 - Depositar
                4 - Sair
                """;

        //Sistema do menu de opções, com o while rodando enquanto a opção 4 não é selecionada
        Scanner leitura = new Scanner(System.in);
        while(opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if(opcao == 1){
                System.out.println("O saldo atualizado é: " + saldo);
            }else if(opcao == 2){
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();

                if(valor > saldo){
                    System.out.println("Não há saldo para realizar a transferência");
                }else{
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo salvo: " + saldo);
            }else if(opcao != 4){
                System.out.println("Opção Inválida");
            }
        }
    }
}
