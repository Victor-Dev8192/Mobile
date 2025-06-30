import java.util.Scanner;

public class App3 {
    
    public static void main(String[] args) {
    try (Scanner Entrada = new Scanner(System.in)) {

      String Tudo1;
      String Tudo2;

      System.out.println("Escolha entre um Bolo e uma Banana, depois disso, pressione Enter para descobrir o seu destino...");

      Tudo1 = Entrada.nextLine();

      if (Tudo1.equalsIgnoreCase("Bolo")) {
        System.out.println("Você sentou no bolo para comer a Banana...");
      }
      else if (Tudo1.equalsIgnoreCase("Banana")) {
        System.out.println("Você sentou na Banana para comer o Bolo...");
      }
      else if (Tudo1.equalsIgnoreCase("Easter Egg One")) {
        System.out.println("Você sentou no chão para comer o Bolo...");
      }
      else if (Tudo1.equalsIgnoreCase("Easter Egg Two")) {
        System.out.println("Você sentou no chão para comer a Banana...");
      }
      else {
        System.out.println("Eu não entendi o que você disse. Aprenda a ler e escrever antes de escolher entre um Bolo e uma Banana novamente...");
      }

      Tudo2 = Entrada.nextLine();

      if (Tudo2.equalsIgnoreCase("Bolo = 0, Banana = N/A")) {
        System.out.println("Ótima escolha...");
      } else if (Tudo2.equalsIgnoreCase("Bolo = N/A, Banana = 0")) {
        System.out.println("Escolha extremamente homosexual...");
      } else if (Tudo2.equalsIgnoreCase("Bolo = 0, Banana = 1")) {
        System.out.println("Você gostou mais do Bolo em relação a Banana? Ou será que não?");
      } else if (Tudo2.equalsIgnoreCase("Bolo = 1, Banana = 0")) {
        System.out.println("Você gostou mais da Banana em relação ao Bolo? Isso faz você se encaixar perfeitamente na descrição de um Homem Homosexual...");
      }
      else {
        System.out.println("Novamente, eu não entendi o que você disse. Realmente, é uma ótima idéia você seguir o que eu disse anteriormente: 'Aprenda a ler e escrever antes de escolher entre um Bolo e uma Banana novamente'");
      }
    }
  }
}