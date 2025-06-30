import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        try (Scanner Entrada = new Scanner(System.in)) {
                
            String Compra;
            double LivroLinux;
            double LivroJava;

            System.out.println("Entre com o preço do Livro Linux:");

            LivroLinux = Entrada.nextDouble();

            System.out.println("Entre com o preço do Livro Java:");

            LivroJava = Entrada.nextDouble();

            System.out.println("O preço do Livro Linux é: R$" + LivroLinux);
            System.out.println("O preço do Livro Java é: R$" + LivroJava);

            double Total = LivroLinux + LivroJava;
            System.out.println("O preço total é: R$" + Total);

            if (LivroLinux<=10){
                System.out.println("O livro saiu quase de graça!");
            }
            
            else{
                System.out.println("O preço da picanha é mais baixo do que o preço do Livro sobre Linux!");
            }

            if (Total<=120){
                System.out.println("O preço está bom!");
            }

            else{
                System.out.println("O preço total está maravilhoso, ao ponto que nem mesmo com todo o dinheiro que a maior rede de transporte de narcotráfico mexicano ganha por ano, ainda não seria o suficiente para comprar ambos os livros, mas...");
            }

            System.out.println("Você realmente quer comprar ambos os livros?");

            Compra = Entrada.next();
            
            if ("Sim".equalsIgnoreCase(Compra)) {
                System.out.println("Parabéns! Você acabou de comprar ambos os livros por " + Total + "!");
            }
            
            else if ("Nao".equalsIgnoreCase(Compra)){
                System.out.println("Que pena! Espero que na próxima vez você realmente compre algo da nossa livraria online >:(");
            }

            else{
                System.out.println("Digite direito com o seu teclado, seu analfabeto disfuncional!");
            }
        }
    }
}