import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
public static void main(String [] args){

    Locale brasil = new Locale ("pt","BR");

    Scanner scanner = new Scanner (System.in).useLocale(brasil);

    System.out.println("Por favor, digite o seu Nome: ");
    String nome = scanner.nextLine();

    System.out.println("Por favor, digite o número da Agência !");
    String agencia= scanner.nextLine();

    System.out.println("Por favor, digite o numero da conta: ");
    int conta= scanner.nextInt();

    System.out.println("Por favor, digite o Saldo (separar com virgula para separação decimal !!!) ");
    Double saldo = scanner.nextDouble(); 

    System.out.printf("Olá %s obrigado por criar uma conta em nosso banco, sua agência é %s, %d e seu saldo R$ %.2f já está disponível para saque",nome, agencia , conta, saldo);

    scanner.close();
}    
}