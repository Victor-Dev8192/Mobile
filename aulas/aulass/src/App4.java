
import java.util.Scanner;

public class App4 {
    
    public static void main(String[] args) {
        
        try (Scanner Entrada = new Scanner(System.in)) {

        int options;
        
        while (true) { 
    
        System.out.println("Digite um número entre 1 e 4.");

        options = Entrada.nextInt();

        switch (options) {
            case 1 -> System.out.println("Abra A Sua Conta.");
            case 2 -> System.out.println("Fatura Do Cartão.");
            case 3 -> System.out.println("Crédito Imobiliário.");
            case 4 -> System.out.println("Operação Cancelada.");
            default -> System.out.println("Escolha Uma Opção Válida");
            }
          }
        }
    }
}