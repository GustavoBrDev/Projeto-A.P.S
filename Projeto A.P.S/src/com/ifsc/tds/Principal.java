package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int contEscolha;
		Scanner teclado = new Scanner(System.in);
		
		for (contEscolha = 0; contEscolha != 1;) {

			System.out.println("Bem vindo usuário, selecione sua necessidade: ");

			System.out.println("=============================================================");
			System.out.println("1 - CADASTRAR CLIENTE\r\n" + "\r\n" + "2 - CADASTRAR UNIDADES CONSUMIDORAS\r\n" + "\r\n"
					+ "3 - FAZER LEITURA\r\n" + "\r\n" + "     3.1 - Informar a leitura atual\r\n" + "\r\n"
					+ "4 - FATURAR CONSUMO\r\n" + "\r\n" + "5 - EXIBIR RELATÓRIOS\r\n" + "\r\n"
					+ "      5.1 - Todos os clientes\r\n" + "\r\n" + "      5.2 -  Faturar pendentes\r\n" + "\r\n"
					+ "      5.3 - Faturas de um cliente específico (cpf/cnpj)\r\n" + "\r\n"
					+ "      5.4 - Todas as faturas de um mês em específico");
			System.out.println("\n=============================================================");

			System.out.println("Selecione a área da sua necessidade (1,2,3,4,5): ");
			int escolha = teclado.nextInt();

			switch (escolha) {
				case 1:
					cadastrarCliente();
					contEscolha=1;
					break;
				case 2:
					cadastrarUC();
					contEscolha =1;
					break;
				case 3:
					fazerLeitura();
					contEscolha =1;
					break;
				case 4:
					faturarConsumo();
					contEscolha=1;
					break;
				case 5:
					exibirRelatorios();
					contEscolha=1;
					break;
				default:
					System.out.println("\n\nSELEÇÃO INVÁLIDA...");
					System.out.println("\nTENTANDO NOVAMENTE...");
			}
		}
		teclado.close();
	}
	

	public static void cadastrarCliente() {

	}
	
	public static void cadastrarUC() {
		
	}
	
	public static void fazerLeitura () {
		
	}
	public static void faturarConsumo () {
		
	}
	public static void exibirRelatorios () {
		
	}
}
