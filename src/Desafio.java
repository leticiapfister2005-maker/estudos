import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int saldo = 1000;
        //int opc para teste while
        int opc = 0;
        String intro = """
                --------------------
                   Dados bancarios
                
                 Nome: Neru
                 Saldo atual: 
                """;
        String introOpc = """
                ------------
                Selecione sua Opção:
                
                1 - consultar saldo
                2 - receber valor
                3 - transferir valor
                4 - sair
                """;

        System.out.println(intro + saldo);


        //tentatativa 1 (for )
//        for (int i = 0; i < 5; i++) {
//
//            System.out.println(introOpc);
//            int opc = ler.nextInt();
//
//            if (opc == 1) {
//                System.out.println("Saldo atual de: " + saldo);
//
//            } else if (opc == 2) {
//                System.out.println("Digite o valor a Receber: ");
//                int valorRec = ler.nextInt();
//                saldo = saldo + valorRec;
//                System.out.println("Saldo atual de: " + saldo);
//
//            } else if (opc == 3) {
//                System.out.println("Digite o valor a Transferir: ");
//                int valorTran = ler.nextInt();
//
//                if (saldo < valorTran){
//                    System.out.println("Saldo negativo, transação invalida");
//                    System.out.println("Saldo atual de: " + saldo);
//                }else {
//                    saldo = saldo - valorTran;
//                    System.out.println("Saldo atual de: " + saldo);
//                }
//
//
//            } else if (opc == 4) {
//                System.out.println("Encerrando");
//                break;
//            } else {
//                System.out.println("Opção invalida");
//            }
//
//
//        }



        //teste 2 (while do)
//          System.out.println(introOpc);
//          int opc = 0;

        while (opc != 4){
            System.out.println(introOpc);
            opc = ler.nextInt();

            if (opc == 1) {
                System.out.println("Saldo atual de: " + saldo);

            } else if (opc == 2) {
                System.out.println("Digite o valor a Receber: ");
                int valorRec = ler.nextInt();
                saldo = saldo + valorRec;
                System.out.println("Saldo atual de: " + saldo);

            } else if (opc == 3) {
                System.out.println("Digite o valor a Transferir: ");
                int valorTran = ler.nextInt();

                if (saldo < valorTran){
                    System.out.println("Saldo negativo, transação invalida");
                    System.out.println("Saldo atual de: " + saldo);
                }else {
                    saldo = saldo - valorTran;
                    System.out.println("Saldo atual de: " + saldo);
                }

            }else if (opc == 4) {
                System.out.println("Encerrando");
            }else {
                System.out.println("Opção invalida");
            }
        }


    }
}
