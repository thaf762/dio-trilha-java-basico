/**
 * <h1>UsoOperadores</h1>
 * A classe UsoOperadores, criada durante o curso java-basico (DIO)
 * demonstra na prática o uso de operadores. 
 * <p>
 * <b>Note:</b> Os comentários adicionei para melhor fixar os resultados 
 * e padrões de nomenclatura. Alguns exercícios podem conter alterações propositais
 * Sinta-se a vontade para praticar de acordo com suas expectativas e criatividade
 * 
 * @author Thiago Ferrer
 * @version 1.0
 * @since 21/04/2023
 */

public class UsoOperadores {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);
       
      /**
       * <h2>OPERADOR DE ATRIBUIÇÃO</h2>
       * Nesta declaração da variável "nomeCompleto" do tipo String,
       * foi <b>atribuído</> pelo símbolo de igualdade "=", o valor resultante da
       *  concatenação de duas string ("LINGUAGEM" e "JAVA").
       * 
       * <p>
       * <h3>A seguir alguns exmplos deste tipo de operadore</h3>
       */

       double soma = 10.5 + 15.7;
       System.out.println(soma);

       int subtracao = 113 - 25;
       System.out.println(subtracao);

       int multiplicacao = 20 * 7;
       System.out.println(multiplicacao);
    
       int divisao = 15 / 3;
       System.out.println(divisao);

       int modulo = 18 % 3;
       System.out.println(modulo);

       double resultadoUm = (10 * 7) + (20/4);
       System.out.println(resultadoUm);


     //Qual o resultado das expressoes abaixo?
String concatenacao ="?"; 

concatenacao = 1+1+1+"1"; // Opera os valores Aritméticos e depois concatena
System.out.println(concatenacao);

concatenacao = 1+"1"+1+1; //O cálculo dos operadores identificou uma string no  meio 
System.out.println(concatenacao); // Portanto resulta em concatenação

concatenacao = 1+"1"+1+"1";
System.out.println(concatenacao); // Apenas Concatena

concatenacao = "1"+1+1+1;
System.out.println(concatenacao);

concatenacao = "1"+(1+1+1); // O operador imprime a string e concatena 
System.out.println(concatenacao); // com resultado de operação aritmética em evidência()


    //OPERADORES UNÁRIOS
 
int numero = 5;
System.out.println(- numero);   // Operador Unário de negação: nega valor aritmético
                                // ou expressão aritmética 
System.out.println(numero);

numero ++; // Operador Unário de incremento: adciona 1 ao valor da variável "numero"
            // Decremento  -- 
System.out.println(numero);
System.out.println(- numero);

boolean verdadeiro = true;
System.out.println(verdadeiro);
System.out.println(!verdadeiro); 

/**
 * Operador Unário Lógico de Negação
 * nega (inverte) valor de expressão booleana
 * 
 * OPERADORES TERNÁRIOS "?" e ":" são operadores condicionais 
 * podem substituir if else
 * <Expressão Condicional>`` ?``<Caso condição seja true>``: ``<Caso condição seja false>
 */

int x, y;
x = 5;
y = 5;

String resultado = (x==y) ? "verdadeiro" : "false";
System.out.println(resultado);
/**
 * OPERADORES RELACIONAIS
 * usados para avaliar a relação entre 2 variáveis ou expressões
 * <operandoEsquerda> <operadorRelacional> <operandoDieita>
 * Retorna um valor booleano como resultado.
 * São muito utilizados nas condições IF ELSE
 */
 
int numero1 = 1;
int numero2 = 2;
boolean simNao = numero1 == numero2; 

// variavel simNao recebe valor da relação de
// igualdade entre numero1 e numero2
 
if (numero1 == numero2) {
    System.out.println("Esta nossa condição é verdadeira!" );
}
System.out.println("numeroUm é igual numeroDois: " + simNao);

simNao = numero1 != numero2;
System.out.println("numeroUm é diferente de numeroDois? " + simNao);

simNao = numero1 > numero2;
System.out.println("numeroUm é maior que numeroDois? " + simNao);

simNao = numero1 < numero2;
System.out.println("numeroUm é menor que numeroDois: " + simNao);


String nomeUm = "THIAGO";
String nomeDois = "THIAGO";

System.out.println(nomeUm == nomeDois); 
/**
* Esta saída resulta em true ou false 
* deacordo com o resultado da expressão que 
* verifica a relacção entre as duas variáveis (nomeUm e nomeDois) do tipo string
*/
System.out.println(nomeUm.equals(nomeDois)); 
    /** 
    * Para comparar conteúdos 
    * entre objetos ou texto mais comum utilizar equals e
    * para comparar numeros pode-se utilizar os operadores relacionais
    */

    /**
     * OPERADORES LÓGICOS
     * Nos permite criar expressões lógicas a partir de 2 ou mais expressões
     */

boolean condicao1 = true;

boolean condicao2 = false;

if(condicao1 && condicao2) //Se condicao1 "E" condicao2 forem verdadeiras, executar código
        System.out.println("OS dois valores precisam ser verdadeiros");

if(condicao1 || condicao2)
        System.out.println("Um dos valores precisa ser verdadeiro");

int numero01 = 1;
int numero02 = 1;

if(numero01==2 & numero02 ++ == 2)
    System.out.println("As 2 condições são verdadeiras");


}

}
