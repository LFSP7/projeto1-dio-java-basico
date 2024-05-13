import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite seu nome: ");
        String nome = scanner.next();
        
        System.out.println("Por favor, digite o número da sua agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número de sua conta conta");
        int conta = scanner.nextInt();
        
        System.out.println("Digite o valor a ser depositado em sua conta: ");
        double saldo = scanner.nextDouble();

        
        //Dados obtidos pelo usuario
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia);
        System.out.println("Conta número: " + conta + "");
        System.out.println("E seu saldo: " + saldo + ", já está disponível para saque.");    
    }
}

