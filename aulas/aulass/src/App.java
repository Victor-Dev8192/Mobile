public class App {  
    public static void main(String[] args) {
        String x;
        double y = (Math.round(Math.random())*10);
        if(y<=5){
        x = "O revolver não atirou e sua cabeça ficou 100% intacta, você sobreviveu com sucesso!";}
        else{
        x = "O revolver atirou e explodiu a sua cabeça, morte lenta e dolorosa para você!";}
        System.out.println("Resultado: " + x);
    }
}