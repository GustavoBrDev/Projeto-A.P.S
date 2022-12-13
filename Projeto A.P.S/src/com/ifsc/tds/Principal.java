package com.ifsc.tds;

import java.util.Scanner;

public class Principal {
	
	private static int qtdeClientes=0;
	
	private static Cliente clientesVetor [];

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
	

	public static  void cadastrarCliente() {
		Scanner teclado = new Scanner(System.in);
		int contTipoPessoa;
		String nome;
		Endereco endereco;
		int clienteId;
		int tipoCliente=0;
		String documento;
		Cliente cliente;
		
		
		for (contTipoPessoa =0; contTipoPessoa != 1;) {
			System.out.println("Selecione o tipo do cadastro a ser realizado: ");
			System.out.println("\n\t1 - Pessoa Fisíca ");
			System.out.println("\n\t2 - Pessoa Jurídica");
			
			System.out.println("\n\nInforme o número correspodente: ");
			tipoCliente = teclado.nextInt();
			
			if (tipoCliente == 1 || tipoCliente ==2) {
				contTipoPessoa =1;
			}
			else {
				System.out.println("\n\nSELEÇÃO INVÁLIDA...");
				System.out.println("\nTENTANDO NOVAMENTE...");
			}
		}
		System.out.println("\nInforme o nome");
		nome = teclado.next();
		endereco = cadastrarEndereco();
		
		if (tipoCliente ==1) {
			System.out.println("\nInforme o CPF: ");
			documento = teclado.next();
			
			clienteId = qtdeClientes;
			qtdeClientes++;
			
			cliente = new PessoaFisica(clienteId, nome, endereco, documento );
		}
		else {
			System.out.println("\nInforme o CPJ: ");
			documento = teclado.next();
			
			clienteId = qtdeClientes;
			
			cliente = new PessoaJuridica(clienteId, nome, endereco, documento );
		}
		clientesVetor[qtdeClientes] = cliente;
		qtdeClientes++;
		teclado.close();
	}
	
	public static void cadastrarUC() {
		
	}
	
	public static void fazerLeitura () {
		
	}
	public static void faturarConsumo () {
		
	}
	public static void exibirRelatorios () {
		
	}
	public static Endereco cadastrarEndereco () {
		Scanner teclado = new Scanner(System.in);
		String rua;
		String cidade;
		String estado;
		int numero;
		String cep;
		
		System.out.println("\nInforme o estado: ");
		estado = teclado.next();
		
		System.out.println("\nInforme a cidade: ");
		cidade = teclado.next();
		
		System.out.println("\nInforme a rua: ");
		rua = teclado.next();
		
		System.out.println("\nInforme o cep: ");
		cep = teclado.next();
		
		System.out.println("\nInforme o número: ");
		numero = teclado.nextInt();
		
		teclado.close();
		
		Endereco endereco = new Endereco(rua, numero, cep, cidade, estado);
		return  endereco;
	}
}
