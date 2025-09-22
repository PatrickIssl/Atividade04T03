package main.java.fag;

import java.util.Scanner;

public class Atividade {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        questao1_Scanner(scan);
        questao2_Print();
        questao3_For();
        questao4_If(scan);
        questao5_While(scan);
        questao6_Metodos();
        questao7_ScannerIf(scan);
        questao8_ForPrint();
        questao9_WhileScanner(scan);
        questao10_MetodosFor();

        scan.close();
    }

     // ========================================
    // QUESTÃO 1 - SCANNER (Entrada de Dados)
    // ========================================
    public static void questao1_Scanner(Scanner scan) {
        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Olá " + nome + "! Você tem " + idade + " anos.");
    }

     // ========================================
    // QUESTÃO 2 - PRINT (Saída de Dados)
    // ========================================
    public static void questao2_Print() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }

    // ========================================
    // QUESTÃO 3 - FOR (Laço de Repetição)
    // ========================================
    public static void questao3_For() {
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma = soma + i;
        }
        System.out.println("Soma de 1 até 100 = " + soma);
    }

     // ========================================
    // QUESTÃO 4 - IF (Estrutura Condicional)
    // ========================================
    public static void questao4_If(Scanner scan) {
        System.out.print("Digite sua nota: ");
        double nota = scan.nextDouble();
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 4) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }

    // ========================================
    // QUESTÃO 5 - WHILE 
    // ========================================
    public static void questao5_While(Scanner scan) {
        int soma = 0;
        int num = 1;
        while (num != 0) {
            System.out.print("Digite um número (0 para parar): ");
            num = scan.nextInt();
            soma = soma + num;
        }
        System.out.println("Soma = " + soma);
    }

    // ========================================
    // QUESTÃO 6 - MÉTODOS
    // ========================================
    public static void questao6_Metodos() {
        System.out.println("Maior entre 10 e 20 = " + encontrarMaior(10, 20));
    }

    public static int encontrarMaior(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // ========================================
    // QUESTÃO 7 - SCANNER + IF
    // ========================================
    public static void questao7_ScannerIf(Scanner scan) {
        System.out.print("Digite um número: ");
        int num = scan.nextInt();
        if (num % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }
    }

     // ========================================
    // QUESTÃO 8 - FOR + PRINT
    // ========================================
    public static void questao8_ForPrint() {
        for (int i = 2; i <= 20; i = i + 2) {
            System.out.println(i);
        }
    }

   // ========================================
    // QUESTÃO 9 - WHILE + SCANNER
    // ========================================
    public static void questao9_WhileScanner(Scanner scan) {
        int num = 0;
        int cont = 0;
        while (true) {
            System.out.print("Digite um número (negativo para parar): ");
            num = scan.nextInt();
            if (num < 0) {
                break;
            }
            cont++;
        }
        System.out.println("Quantidade de números digitados = " + cont);
    }

    // ========================================
    // QUESTÃO 10 - MÉTODOS + FOR
    // ========================================
    public static void questao10_MetodosFor() {
        System.out.println("Fatorial de 5 = " + calcularFatorial(5));
        System.out.println("Fatorial de 7 = " + calcularFatorial(7));
    }

    public static long calcularFatorial(int n) {
        long fat = 1;
        for (int i = 1; i <= n; i++) {
            fat = fat * i;
        }
        return fat;
    }
}
