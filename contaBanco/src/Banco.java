public class Banco {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        System.out.println("Nome do cliente: " + cliente.getNome());
        System.out.println("Agência: " + cliente.getAgencia());
        System.out.println("Número da conta: " + cliente.getConta());
        System.out.println("Saldo: " + cliente.getSaldo());

        System.out.println("Conta criada com sucesso!");
    }
}
