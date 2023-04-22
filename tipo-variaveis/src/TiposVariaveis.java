/**
 * <h1>TiposVariaveis</h1>
 * Classe criada durante o curso sintaxe java DIO para
 * demonstrar na prática os tipos de variáveis. 
 * <p>
 * <b>Note:</b> Comentários adicionados para melhor fixar os resultados 
 * e padrões de nomenclatura. Alguns exercícios podem conter alterações propositais
 * Sinta-se a vontade para praticar de acordo com suas expectativas e criatividade
 * 
 * @author Thiago Ferrer
 * @version 1.0
 * @since 21/04/2023
 */
public class TiposVariaveis {
            
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        /**
         * Regras para declarar variáveis com valor imutável 
         * Uso da palavra reservada "final" 
         */                                 
       final String BR = "Brasil"; // Aqui há uma declaração de variável com valor imutável
        BR = "Brazil"; 
        System.out.println(BR);   
                /**
                * ERRO! Proposital (Comentar linha 24 para executar o restante do código)
                * pois variável "final" não pode ter seu valor alterado
                */
       double PI = 3.14;         // Variável do tipo primitivo double (recebe valores fracionados)
       System.out.println(PI);

       int ano = 2021;      // Variável 'ano' recebe atriuição de valor do tipo inteiro
       System.out.println(ano);
       ano = 2022;         // Variável 'ano' teve seu valor alterado
       
        int ESTADOS_BRASILEIROS = 27; // Variáveis escritas com todas as letras
        System.out.println(ESTADOS_BRASILEIROS);

        int ANO_2000 = 2000;         // MAIÚSCULAS indica que é uma variável "final"
        System.out.println(ANO_2000);
        /**
         * DECLARAÇÕES DE VARIÁVEIS 
         * POSSÌVEIS e ACEITAVEIS pela CONVENÇÂO PADRÂO de NOMENCLATURA 
         */
        int i = 0;
        int numeroMatricula = i;
        System.out.println(numeroMatricula);

        double cadastro_data = 2023.01;
        System.out.println(cadastro_data);

        boolean $protocolo_Abril2023 =  false;
        System.out.println($protocolo_Abril2023);
        
        String _nome = "Thiago";
        System.out.println(_nome);

        int numero1 = 10;
        System.out.println(numero1);

        int numero$um = numero1 + 4;
        int numeroum = numero$um + 4;
        System.out.println(numeroum);     

        double altura = 1.67;
        System.out.println(altura);

        int longo = 1;  // Esta declaração está correta. Mas ATENÇÂO! Não podedmos usar 
                        // palavras reservadas
        System.out.println(longo);
    }

}
