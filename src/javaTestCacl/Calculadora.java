package javaTestCacl;

/*
 * Criação da classe calculadora
 */

public class Calculadora {
	/*
	 * Criação do metodo somar e definindo os parametros A e B
	 */
	
	public int somar(int a,int b) {
        return a + b;
    }
	/*
	 * Criação do método subtrair e definindo os parametros A e B
	 */
    
	
    public int subtrair(int a ,int b) {
        return a - b;
    }
    /*
     * Criação do método multiplicar e definindo os parametros A e B
     */
    
    public int multiplicar(int a ,int b) {
        return a * b;
    }
    
    /*
     * Criação do método divisao e definindo os parametros A e B
     * E criando um exceção de caso B seja igual a zero exibirá e mensagem: "O deniminador não pode ser igual a zero"
     */
    public float  divisao(int a ,int b) {
        if(b == 0) {
            throw new IllegalArgumentException("O denominador não pode ser igual a zero.");
        }
        float div = a / b;
        return div;
        
    }
}
