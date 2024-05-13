import java.util.Scanner;

public class Cliente {
    private String nome;
    private String agencia;
    private int conta;
    private double saldo;

    public Cliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        this.nome = scanner.nextLine();

        System.out.print("Digite a agência: ");
        this.agencia = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        this.conta = scanner.nextInt();

        System.out.print("Digite o saldo: ");
        this.saldo = scanner.nextDouble();

        scanner.close();
    }

    public String getNome() {
        return nome;
    }

    public String getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }
}
