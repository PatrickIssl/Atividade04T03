package main.java.fag;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=== ATIVIDADE JAVA BÁSICO - 10 QUESTÕES ===\n");
		
		// Executar todas as questões
//		questao1_Scanner(scan);
//		questao2_Print();
//		questao3_For();
//		questao4_If(scan);
//		questao5_While(scan);
//			questao6_Metodos();
//	questao7_ScannerIf(scan);
//		questao8_ForPrint();
//	questao9_WhileScanner(scan);
		questao10_MetodosFor();
//		
		scan.close();
	}
	
	// ========================================
	// QUESTÃO 1 - SCANNER (Entrada de Dados)
	// ========================================
	// TODO: Crie um programa que leia o nome e a idade de uma pessoa
	// e exiba uma mensagem de boas-vindas personalizada
	// Exemplo: "Olá João! Você tem 20 anos. Seja bem-vindo(a)!"
	public static void questao1_Scanner(Scanner scan) {
		System.out.println("Digite qual é o seu nome");
			String nome = scan.nextLine();
			System.out.println("Quantos anos você tem?");
			int idade = scan.nextInt();
			System.out.printf("Olá %s! Você tem %d anos. Seja bem-vindo(a)!", nome,idade);
	}
	
	// ========================================
	// QUESTÃO 2 - PRINT (Saída de Dados)
	// ========================================
	// TODO: Crie um programa que exiba uma tabela de multiplicação do 5 (de 1 a 10)
	// Formate a saída de forma organizada
	// Exemplo: "5 x 1 = 5", "5 x 2 = 10", etc.
	public static void questao2_Print() {
		System.out.println("=== QUESTÃO 2 - PRINT ===");
		int i;
			System.out.println("A tabela de multiplicação de 5 é:");
		for(i=1;i<11;i++) {
			System.out.println("5 x " +i+ " = " + i*5);
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
		int i,num=0;
		for(i=1;i<101;i++) {
			num += i;	
		}
		System.out.printf("%d", num);
		
		System.out.println();
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
		float nota = scan.nextFloat();
			if(nota>=7) {
				System.out.println("Parabéns! Você foi APROVADO!");
			}else 
				if((nota <7) && (nota>=4)) {
					System.out.println("Você está em RECUPERAÇÃO. Estude mais!");
				}
				else {
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
		float soma=0,num;
		System.out.println("Digite números inteiros (digite 0 para parar):");
		num = scan.nextFloat();
			soma += num;
		while(num!=0) {
			System.out.println("Digite números inteiros (digite 0 para parar):");
			num = scan.nextFloat();
			soma += num;
		}
		
		System.out.printf("A soma de todos os numeros digitados é: %f", soma);
	}
	
	// ========================================
	// QUESTÃO 6 - MÉTODOS (Função)
	// ========================================
	// TODO: Crie um método que receba dois números e retorne o maior entre eles
	// Teste o método com diferentes valores
	// Dica: Use o método encontrarMaior() que está declarado abaixo
	public static void questao6_Metodos() {
		System.out.println("=== QUESTÃO 6 - MÉTODOS ===");
		
		encontrarMaior(5,10);
		
		
	}
	
	// ========================================
	// QUESTÃO 7 - SCANNER + IF
	// ========================================
	// TODO: Crie um programa que leia um número e informe se ele é par ou ímpar
	// Use o operador % (módulo) para verificar o resto da divisão por 2
	public static void questao7_ScannerIf(Scanner scan) {
		System.out.println("=== QUESTÃO 7 - SCANNER + IF ===");
		float par,impar;
		System.out.println("Digite um número inteiro:");
		float num = scan.nextFloat();
		if(num %2 == 0) {
			System.out.println("O numero é PAR!");
		}
		else {
			System.out.println("O numero é IMPAR!");
		}
	
		
	}
	
	// ========================================
	// QUESTÃO 8 - FOR + PRINT
	// ========================================
	// TODO: Crie um programa que exiba todos os números pares de 2 até 20
	// Exiba um número por linha
	public static void questao8_ForPrint() {
		System.out.println("=== QUESTÃO 8 - FOR + PRINT ===");
		int i;
		int par=0;
		System.out.printf("todos os números pares de 2 até 20 são:");
		for(i=2;i<21;i++) {
				if(i %2 == 0) {
					par = i;
				}
				System.out.printf("%d\n", par);
		}
		
	}
	
	// ========================================
	// QUESTÃO 9 - WHILE + SCANNER
	// ========================================
	// TODO: Crie um programa que leia números até que o usuário digite um número negativo
	// e conte quantos números positivos foram digitados
	public static void questao9_WhileScanner(Scanner scan) {
		System.out.println("=== QUESTÃO 9 - WHILE + SCANNER ===");
		int cont=0;
		int num=0;
		System.out.println("Digite números (digite um número negativo para parar):");
		num = scan.nextInt();
		cont++;
		while(num>0) {
		System.out.println("Digite números (digite um número negativo para parar):");
		num = scan.nextInt();
		cont++;
		}
		
		System.out.printf("A quantidade de numeros positivos é: %d ", cont - 1);
		
	}
	
	// ========================================
	// QUESTÃO 10 - MÉTODOS + FOR
	// ========================================
	// TODO: Crie um método que receba um número e retorne o fatorial desse número
	// Teste o método com os valores 5 e 7
	// Dica: Use o método calcularFatorial() que está declarado abaixo
	// Fatorial de 5 = 5! = 5 x 4 x 3 x 2 x 1 = 120
	public static void questao10_MetodosFor() {
		System.out.println("=== QUESTÃO 10 - MÉTODOS + FOR ===");
		// SEU CÓDIGO AQUI
		
		System.out.println(calcularFatorial(5));
	}
	
	// ========================================
	// MÉTODO PARA QUESTÃO 6
	// ========================================
	// TODO: Implemente este método para retornar o maior entre dois números
	public static int encontrarMaior(int a, int b) {
		if(a>b) {
			return a;
		}
		else {
		return b;
		}// Remova esta linha e implemente a lógica
	}
	
	// ========================================
	// MÉTODO PARA QUESTÃO 10
	// ========================================
	// TODO: Implemente este método para calcular o fatorial de um número
	// Use um laço for para fazer o cálculo
	public static long calcularFatorial(int n) {
		int num=1;
		for(int i=n;i>=1;i--) {
		num=num*i;
		}
		return(num);
	}
}