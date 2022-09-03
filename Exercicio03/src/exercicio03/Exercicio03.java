
package exercicio03;

import java.util.Scanner;

/**
 *
 * @author wellington F
 */
public class Exercicio03 {

    public static void main(String[] args) {
    String nome;
    float salario;
    float valorVendas;
    double totSalario;
    Scanner leitor = new Scanner(System.in);
    
        System.out.print("Informe o seu nome: ");
        nome = leitor.nextLine();
        System.out.print("Informe o valor do seu salário fixo: ");
        salario = leitor.nextFloat();
        System.out.print("Informe o valor total de vendas: ");
        valorVendas = leitor.nextFloat();
        
        totSalario = (valorVendas * 0.15) + salario;
        
        System.out.println("O vendedor " + nome + " recebe um salário fixo de " +
                salario + " e com a comissão ele vai receber um salário total de "
        + totSalario);
        
    }
    
}
