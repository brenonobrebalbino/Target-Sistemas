package Fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        // Criar um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que informe um número
        System.out.print("Informe um número: ");
        int number = scanner.nextInt();

        // Fechar o scanner
        scanner.close();

        // Verificar se o número pertence à sequência de Fibonacci
        if (isFibonacci(number)) {
            System.out.println(number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(number + " não pertence à sequência de Fibonacci.");
        }
    }

    /**
     * Verifica se um número pertence à sequência de Fibonacci.
     *
     * @param num O número a ser verificado.
     * @return true se o número pertence à sequência de Fibonacci, caso contrário false.
     */
    public static boolean isFibonacci(int num) {
        if (num < 0) {
            return false; // Números negativos não estão na sequência de Fibonacci
        }

        // Inicializa os primeiros dois números da sequência de Fibonacci
        int a = 0;
        int b = 1;

        // Verifica se o número é 0 ou 1, que são os primeiros números da sequência de Fibonacci
        if (num == a || num == b) {
            return true;
        }

        // Calcula os próximos números na sequência até que o número fornecido seja encontrado ou excedido
        while (b <= num) {
            int next = a + b; // Próximo número da sequência
            if (next == num) {
                return true;
            }
            // Atualiza os valores para o próximo número
            a = b;
            b = next;
        }

        // Se o número não foi encontrado na sequência, retorna false
        return false;
    }
}
