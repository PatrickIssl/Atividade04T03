package main.java.fag;

import java.util.Scanner;

import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("=== ATIVIDADE JAVA BÁSICO - 10 QUESTÕES ===\n");

		// Executar todas as questões
		questao1_Scanner(scan);
		questao2_Print();
		questao3_For();
		questao4_If(scan);
		questao5_While(scan);
		questao6_Metodos(scan);
		questao7_ScannerIf(scan);
		questao8_ForPrint();
		questao9_WhileScanner(scan);
		questao10_MetodosFor(scan);

		scan.close();
	}

	// ========================================
	// QUESTÃO 1 - SCANNER (Entrada de Dados)
	// ========================================
	// TODO: Crie um programa que leia o nome e a idade de uma pessoa
	// e exiba uma mensagem de boas-vindas personalizada
	// Exemplo: "Olá João! Você tem 20 anos. Seja bem-vindo(a)!"
	public static void questao1_Scanner(Scanner scan) {
		
		System.out.println("Entre com seu nome: ");
		String nome = scan.nextLine();
		System.out.println("Entre com sua idade: ");
		int idade = scan.nextInt();
		
		System.out.println("Olá "+nome+"! Você tem "+idade+" anos. Seja bem-vindo(a)!");
		
	}
//	
	// ========================================
	// QUESTÃO 2 - PRINT (Saída de Dados)
	// ========================================
	// TODO: Crie um programa que exiba uma tabela de multiplicação do 5 (de 1 a 10)
	// Formate a saída de forma organizada
	// Exemplo: "5 x 1 = 5", "5 x 2 = 10", etc.
	public static void questao2_Print() {
		System.out.println("=== QUESTÃO 2 - PRINT ===");
		// SEU CÓDIGO AQUI
		
		int i;
		int multi = 0;
		System.out.println("Tabuada do 5:");
		for(i=1;i<11;i++) {
			
			
			System.out.println("5 x "+i+" = "+ 5*i );
			
		}
		
	}

	// ========================================
	// QUESTÃO 3 - FOR (Laço de Repetição)
	// ========================================
	// TODO: Crie um programa que calcule e exiba a soma dos números de 1 até 100
	// Use um laço for para fazer o cálculo
	// Resultado esperado: 5050
	public static void questao3_For() {
		System.out.println("=== QUESTÃO 3 - FOR ===");
		// SEU CÓDIGO AQUI
		int i;
		int soma = 0;
		for (i = 1; i < 101; i++) {
			
			System.out.println(i);
			soma += i;

		}

		System.out.println("A soma dos elementos é: "+ soma);
	}

	// ========================================
	// QUESTÃO 4 - IF (Estrutura Condicional)
	// ========================================
	// TODO: Crie um programa que leia uma nota e informe:
	// - Aprovado (nota >= 7): "Parabéns! Você foi APROVADO!"
	// - Recuperação (4 <= nota < 7): "Você está em RECUPERAÇÃO. Estude mais!"
	// - Reprovado (nota < 4): "Infelizmente você foi REPROVADO. Tente novamente!"
	public static void questao4_If(Scanner scan) {
		System.out.println("=== QUESTÃO 4 - IF ===");
		System.out.println("Digite sua nota (0 a 10):");
		// SEU CÓDIGO AQUI
		double nota = 0;
		System.out.println("Entre com sua nota: ");
		nota = scan.nextDouble();
		scan.nextLine();
		
		if(nota >= 7) {
			
			System.out.println("Parabéns! Você foi APROVADO!");
			
		}else if( 4 >= nota && nota <= 7) {
			
			System.out.println("Você está em RECUPERAÇÃO. Estude mais!");
			
		}else if(nota < 4) {
			
			System.out.println("Infelizmente você foi REPROVADO. Tente novamente!");
			
		}
		
	}

	// ========================================
	// QUESTÃO 5 - WHILE (Laço de Repetição)
	// ========================================
	// TODO: Crie um programa que leia números inteiros até que o usuário digite 0
	// e então exiba a soma de todos os números digitados
	public static void questao5_While(Scanner scan) {
		System.out.println("=== QUESTÃO 5 - WHILE ===");
		System.out.println("Digite números inteiros (digite 0 para parar):");
		// SEU CÓDIGO AQUI
		int num = 1;
		int soma = 0;
		System.out.println("Entre com os valores (0 para sair)");
		while(num != 0) {
			
			num = scan.nextInt();
			soma += num;
		}
		if(num == 0) {
			
			System.out.println("A soma dos numeros digitados é de: "+soma);
			
		}
	}

	// ========================================
	// QUESTÃO 6 - MÉTODOS (Função)
	// ========================================
	// TODO: Crie um método que receba dois números e retorne o maior entre eles
	// Teste o método com diferentes valores
	// Dica: Use o método encontrarMaior() que está declarado abaixo
	public static void questao6_Metodos(Scanner scan) {
		System.out.println("=== QUESTÃO 6 - MÉTODOS ===");
		// SEU CÓDIGO AQUI
		int num_1;
		int num_2;
		System.out.println("Entre com o primeiro valor: ");
		num_1 = scan.nextInt();
		scan.nextLine();
		System.out.println("Entre com o segundo valor: ");
		num_2 = scan.nextInt();
		scan.nextLine();
		
		encontrarMaior(num_1, num_2);
		
	}

	// ========================================
	// QUESTÃO 7 - SCANNER + IF
	// ========================================
	// TODO: Crie um programa que leia um número e informe se ele é par ou ímpar
	// Use o operador % (módulo) para verificar o resto da divisão por 2
	public static void questao7_ScannerIf(Scanner scanner) {
		System.out.println("=== QUESTÃO 7 - SCANNER + IF ===");
		System.out.println("Digite um número inteiro:");
		// SEU CÓDIGO AQUI
		int num;
		num = scanner.nextInt();
		scanner.nextLine();
		if(num %2 == 0) {
			
			System.out.println("O numero "+num+" é PAR");
			
		}else {
			
			System.out.println("O numero "+num+" é ÍMPAR");
			
		}
	}

	// ========================================
	// QUESTÃO 8 - FOR + PRINT
	// ========================================
	// TODO: Crie um programa que exiba todos os números pares de 2 até 20
	// Exiba um número por linha
	public static void questao8_ForPrint() {
		System.out.println("=== QUESTÃO 8 - FOR + PRINT ===");
//		// SEU CÓDIGO AQUI
		int i;
		int par;
		System.out.println("Numeros pares de 2 até 20: ");
		for(i=2;i<21;i++) {
			
			if(i %2 == 0) {
				par = i;
				System.out.println(par);
				
			}
			
			
		}
	}

	// ========================================
	// QUESTÃO 9 - WHILE + SCANNER
	// ========================================
	// TODO: Crie um programa que leia números até que o usuário digite um número
	// negativo
	// e conte quantos números positivos foram digitados
	public static void questao9_WhileScanner(Scanner scan) {
		System.out.println("=== QUESTÃO 9 - WHILE + SCANNER ===");
		System.out.println("Digite números (digite um número negativo para parar):");
		// SEU CÓDIGO AQUI
		int num = 1;
		while(num >= 0) {
		num = scan.nextInt();
		}
	}

	// ========================================
	// QUESTÃO 10 - MÉTODOS + FOR
	// ========================================
	// TODO: Crie um método que receba um número e retorne o fatorial desse número
	// Teste o método com os valores 5 e 7
	// Dica: Use o método calcularFatorial() que está declarado abaixo
	// Fatorial de 5 = 5! = 5 x 4 x 3 x 2 x 1 = 120
	public static void questao10_MetodosFor(Scanner scanner) {
		System.out.println("=== QUESTÃO 10 - MÉTODOS + FOR ===");
		// SEU CÓDIGO AQUI
		double numero;
		  System.out.println("Entre com o valor do fatorial: ");
		  numero = scanner.nextInt();
        System.out.println("Fatorial de 5: " + calcularFatorial(numero));

    }

	

	// ========================================
	// MÉTODO PARA QUESTÃO 6
	// ========================================
	// TODO: Implemente este método para retornar o maior entre dois números
	public static int encontrarMaior(int num_1, int num_2) {
		// SEU CÓDIGO AQUI
	int maior;
		
		if(num_2 > num_1){
			
			maior = num_2;
			
		}else {
			
			maior = num_1;
			
		}
		System.out.println("O maior valor é o "+ maior);
		return maior;
		
	}

	// ========================================
	// MÉTODO PARA QUESTÃO 10
	
	 	
	// ========================================
	// TODO: Implemente este método para calcular o fatorial de um número
	// Use um laço for para fazer o cálculo
	public static long calcularFatorial(double numero) {
		// SEU CÓDIGO AQUI
		   int fatorial = 1;
	        for (int i = 1; i <= numero; i++) {
	            fatorial *= i;
	        }
	        return fatorial;
	    }

	}
