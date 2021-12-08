import java.util.Scanner;

/**
Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B atribuindo o seu resultado na variável X. Imprima X conforme exemplo apresentado abaixo. Não apresente mensagem alguma além daquilo que está sendo especificado e não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

Entrada
A entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "X = " (letra X maiúscula) seguido pelo valor da variável X e pelo final de linha. Cuide para que tenha um espaço antes e depois do sinal de igualdade, conforme o exemplo abaixo.

Exemplos de Entrada	Exemplos de Saída
10
9

X = 19

-10
4

X = -6

15
-7

X = 8

*/

public class J1001 {
    public static void main(String[] args) {

        int a;
        int b;
        int x;        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        a = input.nextInt();

        System.out.println("Digite outro numero: ");
        b = input.nextInt();
        input.close();

        x = a + b;

        System.out.println("X = " + x);
    }
}