import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Conta corrente\n");
        
        System.out.println("Digite o nome: ");
        String nomeCC = leitor.nextLine();

        System.out.println("Digite a idade: ");
        int idadeCC = leitor.nextInt();

        System.out.println("Digite o numero da conta: ");
        int numeroCC = leitor.nextInt();

        System.out.println("Digite o saldo: ");
        double saldoCC = leitor.nextDouble();

       
        Cliente clienteCC = new Cliente(nomeCC,idadeCC);
        Conta contaCC = new Conta(saldoCC, numeroCC, clienteCC);
        
        leitor.close();

        System.out.format("\nConta corrente\nCliente: %s\nIdade: %d\nConta:%d\nSaldo: %.2f\n",contaCC.cliente.nome,
        contaCC.cliente.idade,contaCC.numero ,contaCC.saldo);
    };

}
