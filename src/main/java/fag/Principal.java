package main.java.fag;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=== ATIVIDADE JAVA BÁSICO - 10 QUESTÕES ===\n");
		
		// Executar todas as questões
		//questao1_Scanner(scan);
		//questao2_Print();
		//questao3_For();
		//questao4_If(scan);
		//questao5_While(scan);
		//questao6_Metodos();
		//questao7_ScannerIf(scan);
		//questao8_ForPrint();
		//questao9_WhileScanner(scan);
		questao10_MetodosFor();
		
		scan.close();
	}
	
	// ========================================
	// QUESTÃO 1 - SCANNER (Entrada de Dados)
	// ========================================
	// TODO: Crie um programa que leia o nome e a idade de uma pessoa
	// e exiba uma mensagem de boas-vindas personalizada
	// Exemplo: "Olá João! Você tem 20 anos. Seja bem-vindo(a)!"
	public static void questao1_Scanner(Scanner scan) {
		System.out.println("Informe seu nome: ");
		String nome = scan.nextLine();
		System.out.println("Informe sua idade: ");
		int idade = scan.nextInt();
		System.out.printf("Olá %s! Você tem %d anos. Seja bem-vindo(a)!", nome, idade);
	}
	
	// ========================================
	// QUESTÃO 2 - PRINT (Saída de Dados)
	// ========================================
	// TODO: Crie um programa que exiba uma tabela de multiplicação do 5 (de 1 a 10)
	// Formate a saída de forma organizada
	// Exemplo: "5 x 1 = 5", "5 x 2 = 10", etc.
	public static void questao2_Print() {
		System.out.println("=== QUESTÃO 2 - PRINT ===");
		 int numero = 5;
		    for (int i = 1; i <= 10; i++) {
		        int resultado = numero * i;
		        System.out.println(numero + " x " + i + " = " + resultado);
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
			int soma = 0;
			int num;
			for (int i=0; i<=100; i++) {
				soma = soma + i;
			}
		System.out.printf("%d", soma);
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
		if (nota>=7) {
			System.out.println("Parabéns! Você foi APROVADO!");
		}
		if (nota >= 4 && nota < 7) {
			System.out.println("Você está em RECUPERAÇÃO. Estude mais!");
		}
		if (nota<=3) {
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
		 int soma = 0;
		    int numero;
		    do {       
		        numero = scan.nextInt();
		        soma += numero; 
		        
		    } while (numero != 0); 
		    
		    System.out.println("A soma de todos os números é: " + soma);
		System.out.println();
	}
	
	// ========================================
	// QUESTÃO 6 - MÉTODOS (Função)
	// ========================================
	// TODO: Crie um método que receba dois números e retorne o maior entre eles
	// Teste o método com diferentes valores
	// Dica: Use o método encontrarMaior() que está declarado abaixo
		public static void questao6_Metodos() {
		    System.out.println("=== QUESTÃO 6 - MÉTODOS ===");
		    
		    int maior1 = encontrarMaior(10, 20);
		    int maior2 = encontrarMaior(15, 8);
		    int maior3 = encontrarMaior(5, 5);
		    
		    System.out.println("Maior entre 10 e 20: " + maior1);
		    System.out.println("Maior entre 15 e 8: " + maior2);
		    System.out.println("Maior entre 5 e 5: " + maior3);
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
	// TODO: Crie um programa que leia um número e informe se ele é par ou ímpar
	// Use o operador % (módulo) para verificar o resto da divisão por 2
	public static void questao7_ScannerIf(Scanner scan) {
		System.out.println("=== QUESTÃO 7 - SCANNER + IF ===");
		System.out.println("Digite um nummero inteiro:");
		int numero = scan.nextInt();
	   
	    if ( numero % 2 == 0) {
	        System.out.println("O número " + numero + " é PAR");
	    } else {
	        System.out.println("O número " + numero + " é IMPAR");
	    }
		
		System.out.println();
	}
	
	// ========================================
	// QUESTÃO 8 - FOR + PRINT
	// ========================================
	// TODO: Crie um programa que exiba todos os números pares de 2 até 20
	// Exiba um número por linha
	public static void questao8_ForPrint() {
		System.out.println("=== QUESTÃO 8 - FOR + PRINT ===");
		System.out.println("Numeros pares de 2 a 20;");
		   for (int i = 2; i <= 20; i += 2) {
		       System.out.println(i);
		       ;
		   }
	}
	
	// ========================================
	// QUESTÃO 9 - WHILE + SCANNER
	// ========================================
	// TODO: Crie um programa que leia números até que o usuário digite um número negativo
	// e conte quantos números positivos foram digitados
	public static void questao9_WhileScanner(Scanner scan) {
		System.out.println("=== QUESTÃO 9 - WHILE + SCANNER ===");
		System.out.println("Digite números (digite um número negativo para parar):");
		int contap = 0;
		   int numero = 0;
		   do {
		       System.out.print("Digite um número: ");
		       numero = scan.nextInt();
		       scan.nextLine(); 
		       if (numero > 0) {
		           contap++;
		       }  
		   } while (numero >= 0); 
		    
		   System.out.println("Total de números positivos digitados: " + contap);
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
		 long fatorial5 = calcularFatorial(5);
		    long fatorial7 = calcularFatorial(7);
		    
		    System.out.println("Fatorial de 5: " + fatorial5);
		    System.out.println("Fatorial de 7: " + fatorial7);
		}

		public static long calcularFatorial(int n) {
		    long resultado = 1;
		    
		    for (int i = 1; i <= n; i++) {
		        resultado *= i;
		    }
		    
		    return resultado;
	}
	
	// ========================================
	// MÉTODO PARA QUESTÃO 6
	// ========================================
	// TODO: Implemente este método para retornar o maior entre dois números
	public static int encontrarMaior(int a, int b) {
		// SEU CÓDIGO AQUI
		return 0; // Remova esta linha e implemente a lógica
	}
	
	// ========================================
	// MÉTODO PARA QUESTÃO 10
	// ========================================
	// TODO: Implemente este método para calcular o fatorial de um número
	// Use um laço for para fazer o cálculo
	public static long calcularFatorial(int n) {
		// SEU CÓDIGO AQUI
		return 0; // Remova esta linha e implemente a lógica
	}
}