import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tent = 0;
        int valor = new Random().nextInt(100);

        System.out.println("Jogo de adivinhação");

        for (int i = 1; i < 6; i++){


            System.out.println("Sua tentativa: ");
            tent = ler.nextInt();

            if (tent == valor) {
                System.out.println("Parabens! a resposta esta certa " + valor + "!");
                break;
            } else if (tent != valor){
                System.out.println("Resposta errada! tente novamente ");

            } /*else (tent != valor || tent >= 5) {
                System.out.println("Infelizmente você não conseguiu acertar, o numero era: " + valor);*/

            }

            if (tent != valor || tent >= 5){
                System.out.println("Infelizmente você não conseguiu acertar, o numero era: " + valor);
    }







    }


}







