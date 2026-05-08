public class Main0 {
    public static void main(String[] args) {
        /*            PRIMEIRAS AULAS             */
        System.out.println("Bem vindo a Boo!");
        System.out.println("Filme: A Noiva Cadáver");


        //int seria a variavel para numeros inteiros
        int anoDeLancamento = 2005;
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        //double seria a variavel que aceita numeros quebrados
        double media = (8.0 + 6.5) /2;
        System.out.println("MEDIA nota do filme: " + media);
        //String é para variaveis de texto
        String sinopse;
        /*variavel = """
         (serve para editar textos da forma que quiser, pulando linhas)
         """ */
        sinopse = """
                
                O Filme de Tim burton conta a historia de um 
                casal arranjado formado por Victor e Victoria...""";
        System.out.println("Sinopse: " + sinopse);

        /*
        //equals() serve para comparar as strings
        String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }
            */

        int classe;
        classe = (int) media/2;
        System.out.println("Media de estrelas: " + classe);

        //conversão Celcios para F
        int tempC = 30;
        int tempF = (int) (tempC * 1.8) + 32;
        System.out.println(String.format("A temperatura %d convertida em Fahrenheit é = " + tempF, tempC));

        //conversão de real para dollar
        double valorR = 10.50;
        double dollar =  5.33;
        double valorD = (valorR / dollar);
        System.out.println(String.format("O valor %.2f em dollar seria: %.2f", valorR, valorD ));


        // Integer.sum para somar



    }
}





















