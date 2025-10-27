import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public interface SobreEUu {
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sue altura:");
        double altura = scanner.nextDouble();


        System.out.println("Olá, eu sou " + nome.toUpperCase()+ " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade +" anos");
        System.out.println("Minha autura é "+altura+"cm");
            scanner.close();
    }
    catch (InputMismatchException e){
        System.out.println("Idade e altura precisam ser numéricos.");
    }
    }
}
