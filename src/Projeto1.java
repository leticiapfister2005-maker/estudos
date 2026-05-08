public class Projeto1 {
    public static void main(String[] args){

        System.out.println("Bem vindo a BOOteca!");
        String info = """
                A BOOteca é uma biblioteca online onde você pode navegar por dibersos títulos de terror, ler eles online e até pegar o fisico emprestado!
                Interessado? vamos ver alguns titulos! 
                """;
        System.out.println(info);

        //Variaveis
        String coraline = "Coraline";
        String autor = "Neil Gaiman";
        int anolancamento = 2002;
        double avaliacao = 4.9;
        String sinopse = "Coraline descobre uma porta para um mundo alternativo onde tudo parece perfeito, pais afetuosos e desejos realizados. Porém todos têm botões nos olhos, e logo percebe que essa realidade paralela esconde intenções sombrias para mantê-la presa.";

        String mieruko = "Mieruko-chan";
        String autor0 = "Tomoki Izumi";
        int anolancamento0 = 2018;
        double avaliacao0 = 4.7;
        String sinopse0 = "Mieruko-chan é uma história que mistura terror e comédia, centrada em Miko Yotsuya, uma estudante do ensino médio que subitamente ganha a capacidade de ver espíritos e monstros grotescos e aterrorizantes em seu cotidiano.";

        String warren = "Ed e Lorraine Warren";
        String autor1 = "Gerald Brittle";
         int anolancamento1 = 1980;
        double avaliacao1 = 4.9;
        String sinopse1 = "Lançado originalmente em 1980 e escrito por Gerald Brittle com acesso exclusivo ao casal, o livro narra algumas das investigações mais famosas e assustadoras conduzidas pelos demonologistas. Ele explora as origens da Sociedade de Pesquisa Psíquica da Nova Inglaterra, fundada por Ed e Lorraine, e revela detalhes sobre encontros com fantasmas, poltergeists e possessões demoníacas. ";

        //Infos terminal
        System.out.println("Livro: " + warren + ". de: " + autor1);
        System.out.println("Sinopse: " + sinopse1);
        System.out.println("Avaliações: " + avaliacao1);
        System.out.println("Ano de lançamento: " + anolancamento1);

        //if else para avaliar se a data de lançamento é considerada antiga
        if (anolancamento1 <= 2010) {
            System.out.println("Esse livro é considerado antigo");

        } else {
            System.out.println("Esse livro é um pouco mais recente");
        }


    }
}
