import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        int hour;
        try (Scanner idk = new Scanner(System.in)) {
            System.out.print("Digite a hora na qual você chegou aqui: ");
            hour = idk.nextInt();
        }
        if (hour <= 0 | hour > 24 ) {
            System.out.println("Horário fora do intervalo válido.");
            return;
        }
        if (hour == 15) {
            System.out.println("Você chegou no horário correto!");
        } else if (hour < 15) {
            System.out.printf("Você chegou adiantado!");
        } else {
            System.out.printf("Você chegou atrasado!");
        }
    }
}