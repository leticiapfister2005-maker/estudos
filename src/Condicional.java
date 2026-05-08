public class Condicional {
    public static void main(String[] args) {

       String info = """
                
                Bem vindo a BOO!
                Aqui estão algumas infos sobre o filme:
                "A Noiva Cadáver"
                """;
       System.out.println(info);

       int lancamento = 2005;
       boolean inclusoNoPlano = true;
       double nota = 8.5;
       String planoTipo = "Plus";

       if (lancamento >= 2020){
           System.out.println("Lançado recentemente em: " + lancamento);
       } else {
           System.out.println("Filme considerado mais antigo lançado em: " + lancamento);
       }

        //== significa comparativo, mais ou menos a mesma coisa com o .equals
        //|| significa OU, no sentido de (deve atender essa condição OU essa condição)
        //&& significa E para condições, sendo rodado o if somente se ambas as condições forem true
       if (inclusoNoPlano == true || planoTipo.equals("Plus")) {
           System.out.println("Filme liberado para assistir");
        } else {
           System.out.println("Filme bloqueado");
        }




    }
}


























