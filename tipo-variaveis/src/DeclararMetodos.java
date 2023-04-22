public class DeclararMetodos {
    /**
     * <h1>DeclararMetodos</h1>
     * Esta classe foi criada durante o curso java-basico (DIO) para
 * demonstrar na prática a utilidade dos métodos 
 * <p>
 * <b>Note:</b> Os comentários adicionados para melhor fixar os resultados 
 * e padrões de nomenclatura. Alguns exercícios podem conter alterações propositais
 * Sinta-se a vontade para praticar de acordo com suas expectativas e criatividade
 * 
 * @author Thiago Ferrer
 * @version 1.0
 * @since 21/04/2023
 */ 
public static void main (String [] args){ /* Método main. Reconmenda-se que apenas uma
                                           * classe possua o método main
                                           */                                     

    String primeiroNome = "Thiago";
    String segundoNome = "Henrique";

    String nomeCompleto = nomeCompleto (primeiroNome,segundoNome); 
    // O valor desta variável "nomeCompleto" 
    // recebe como valor um método com mesmo nome
    
    System.out.println(nomeCompleto);
}
public static String nomeCompleto (String primeiroNome, String segundoNome) {
    /**
     * @param primeiroNome inicializado com valor do tipo string
     * @param segundoNome inicializado com valor também do tipo string
     * @return string imprime o produto da concatenação dos 2 parâmetros
     *  como resultado deste método
    */
    return  primeiroNome.concat(" ").concat(segundoNome);
    // outra forma de concatenar:
    // return  "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
}

}
