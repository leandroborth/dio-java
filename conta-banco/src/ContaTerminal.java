import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner contaBancaria = new Scanner(System.in).useLocale(Locale.US);

        String nomeCliente = "Leandro Borth";
        double saldoConta = 1135.67;

        System.out.println("Por favor, digite o número de sua agência sem o dígito (3 números): ");
        String numeroAgencia = contaBancaria.next();

        System.out.println("Agora, digite o dígito de sua agência (1 número): ");
        String digitoAgencia = contaBancaria.next();

        System.out.println("Digite o número de sua conta (6 números): ");
        String numeroConta = contaBancaria.next();

        System.out.println("Olá " + nomeCliente + ", obrigado por ser um cliente Prime Dio Bank!");
        System.out.println("Sua agênca é " + numeroAgencia + "-" + digitoAgencia + ", e sua conta " + numeroConta + ".");
        System.out.println("Seu saldo atual é de R$ " + saldoConta + " e já está disponível para saques.");

    }

}