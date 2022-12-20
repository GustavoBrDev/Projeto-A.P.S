package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	private static int qtdeClientes = 0;

	private static Cliente clientesVetor[];

	private static int qtdeUC = 0;

	private static UC ucVetor[];

	private static int qtdeFaturas = 0;

	private static Fatura faturasVetor[];

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
				contEscolha = 1;
				break;
			case 2:
				cadastrarUC();
				contEscolha = 1;
				break;
			case 3:
				fazerLeitura();
				contEscolha = 1;
				break;
			case 4:
				faturarConsumo();
				contEscolha = 1;
				break;
			case 5:
				exibirRelatorios();
				contEscolha = 1;
				break;
			default:
				System.out.println("\n\nSELEÇÃO INVÁLIDA...");
				System.out.println("\nTENTANDO NOVAMENTE...");
			}
		}
		teclado.close();
	}

	public static Cliente cadastrarCliente() {
		Scanner teclado = new Scanner(System.in);
		int contTipoPessoa;
		String nome;
		Endereco endereco;
		int clienteId;
		int tipoCliente = 0;
		String documento;
		Cliente cliente;

		for (contTipoPessoa = 0; contTipoPessoa != 1;) {
			System.out.println("Selecione o tipo do cadastro a ser realizado: ");
			System.out.println("\n\t1 - Pessoa Fisíca ");
			System.out.println("\n\t2 - Pessoa Jurídica");

			System.out.println("\n\nInforme o número correspodente: ");
			tipoCliente = teclado.nextInt();

			if (tipoCliente == 1 || tipoCliente == 2) {
				contTipoPessoa = 1;
			} else {
				System.out.println("\n\nSELEÇÃO INVÁLIDA...");
				System.out.println("\nTENTANDO NOVAMENTE...");
			}
		}
		System.out.println("\nInforme o nome");
		nome = teclado.next();
		endereco = cadastrarEndereco();

		if (tipoCliente == 1) {
			System.out.println("\nInforme o CPF: ");
			documento = teclado.next();

			clienteId = qtdeClientes;
			qtdeClientes++;

			cliente = new PessoaFisica(clienteId, nome, endereco, documento);
		} else {
			System.out.println("\nInforme o CPJ: ");
			documento = teclado.next();

			clienteId = qtdeClientes;

			cliente = new PessoaJuridica(clienteId, nome, endereco, documento);
		}
		clientesVetor[qtdeClientes] = cliente;
		qtdeClientes++;
		teclado.close();
		return cliente;
	}

	public static void cadastrarUC() {
		int leituraAtual;
		int leituraAnterior;
		int ucId;
		Cliente cliente = null;
		Endereco endereco = null;
		int escolhaCliente = 0;
		int escolhaEndereco = 0;
		int idEscolhido;
		Scanner teclado = new Scanner(System.in);

		System.out.println("\nInforme a leitura atual da Unidade Consumidora: ");
		leituraAtual = teclado.nextInt();

		System.out.println("\nInforme a leitura anterior da Unidade Consumidora: ");
		leituraAnterior = teclado.nextInt();

		// Seleção ou cadastro do cliente

		for (int contEscolhaCliente = 0; contEscolhaCliente != 1;) {
			System.out.println("\n\nSelecione uma das opções abaixo para o cliente: ");
			System.out.println("\n 1 - Cadastrar novo cliente ");
			System.out.println("\n 2 - Utilizar um cliente já cadastrado");
			System.out.println("\n\nInforme o número da seleção correspodente: ");
			escolhaCliente = teclado.nextInt();

			switch (escolhaCliente) {
			case 1:
				cliente = cadastrarCliente();
				contEscolhaCliente = 1;
				break;
			case 2:
				imprimirClientes();

				System.out.println("\n\nInforme o ID do cliente selecionado: ");
				idEscolhido = teclado.nextInt();

				if (idEscolhido >= 0 && idEscolhido < qtdeClientes) {
					cliente = clientesVetor[idEscolhido];
					contEscolhaCliente = 1;
				} else {
					System.out.println("\n\nSELEÇÃO INVÁLIDA... ");
					System.out.println("\nTENTE NOVAMENTE...");
				}
				break;
			default:
				System.out.println("\n\nSELEÇÃO INVÁLIDA... ");
				System.out.println("\nTENTE NOVAMENTE...");
			}
		}

		// Utilização ou cadastro do endereço

		for (int contEscolhaEndereco = 0; contEscolhaEndereco != 1;) {
			System.out.println("\n\nSelecione uma das opções abaixo para o endereco: ");
			System.out.println("\n 1 - Cadastrar novo endereco ");
			System.out.println("\n 2 - Utilizar o endereco do cliente");
			System.out.println("\n\nInforme o número da seleção correspodente: ");

			escolhaEndereco = teclado.nextInt();

			switch (escolhaEndereco) {
			case 1:
				endereco = cadastrarEndereco();
				contEscolhaEndereco = 1;
				break;
			case 2:
				endereco = cliente.getEndereco();
				contEscolhaEndereco = 1;
			default:
				System.out.println("\n\nSELEÇÃO INVÁLIDA... ");
				System.out.println("\nTENTE NOVAMENTE...");
			}
		}
		ucId = qtdeUC;
		UC uc = new UC(ucId, cliente, leituraAnterior, leituraAtual, endereco);
		ucVetor[qtdeUC] = uc;
		qtdeUC++;

		teclado.close();
	}

	public static void fazerLeitura() {
		// Fatorar a UC
		// Primeiramente, realizar o cadastro do UC
	}

	public static void faturarConsumo() {

	}

	public static void exibirRelatorios() {
		int escolha;
		Scanner teclado = new Scanner(System.in);

		for (int contEscolha = 0; contEscolha != 1;) {
			System.out.println("\n\n============ EXIBIR RELATÓRIOS ============\n");
			System.out.println("\r 1 - Todos os clientes\r\n" + "\r\n" + "      2 -  Faturar pendentes\r\n" + "\r\n"
					+ "      3 - Faturas de um cliente específico (cpf/cnpj)\r\n" + "\r\n"
					+ "      4 - Todas as faturas de um mês em específico (informado pelo usuário)");

			System.out.println("\n\nInforme o número correspodente a sua seleção: ");
			escolha = teclado.nextInt();

			switch (escolha) {
			case 1:
				imprimirClientes();
				contEscolha = 1;
				break;
			case 2:
				faturasPendente();
				contEscolha = 1;
				break;
			case 3:
				faturaPorCliente();
				contEscolha = 1;
				break;
			case 4:
				faturaPorMes();
				contEscolha = 1;
				break;
			default:
				System.out.println("\n\nSELEÇÃO INVÁLIDA...");
				System.out.println("\nTENTANDO NOVAMENTE...");
			}
		}
		teclado.close();
	}

	public static void imprimirClientes() {

		if (qtdeClientes == 0) {
			System.out.println("\nNÃO HÁ NADA PARA IMPRIMIR");
		} else {
			System.out.println("\n\n======== CLIENTES CADASTRADOS ======= ");
			for (int contImpressao = 0; contImpressao < qtdeClientes; contImpressao++) {
				System.out.println("\n\n" + (contImpressao + 1) + "° Cliente\n\n");
				clientesVetor[contImpressao].toString();
			}
		}
	}

	public static void faturasPendente() {
		int encontrado = 0;
		if (qtdeFaturas == 0) {
			System.out.println("\nNÃO HÁ NADA PARA IMPRIMIR");
		} else {
			System.out.println("\n\n======== FATURAS PENDENTES ======= ");
			for (int contImpressao = 0; contImpressao < qtdeFaturas; contImpressao++) {
				if (!faturasVetor[contImpressao].isPago()) {
					System.out.println("\n\n" + (encontrado + 1) + "° Fatura Pendente\n\n");
					faturasVetor[contImpressao].toString();
					encontrado++;
				}
			}
		}
		if (encontrado == 0) {
			System.out.println("\n\nNÃO HÁ FATURAS PENDENTES ");
			System.out.println("\nNÍNGUEM ESTÁ NO SERASA");
		}
	}

	public static void faturaPorCliente() {
		int encontrado = 0;
		int idEscolhido = 0;
		Scanner teclado = new Scanner(System.in);
		Cliente cliente = null;

		if (qtdeFaturas == 0) {
			System.out.println("\nNÃO HÁ NADA PARA IMPRIMIR");
		} else {
			for (int selecaoCliente = 0; selecaoCliente != 1;) {
				imprimirClientes();

				System.out.println("\n\nInforme o ID do cliente selecionado: ");
				idEscolhido = teclado.nextInt();

				if (idEscolhido >= 0 && idEscolhido < qtdeClientes) {
					cliente = clientesVetor[idEscolhido];
					selecaoCliente =1;
				} else {
					System.out.println("\n\nSELEÇÃO INVÁLIDA... ");
					System.out.println("\nTENTE NOVAMENTE...");
				}
			}
			System.out.println("\n\n======== FATURAS DO CLIENTE ======= ");
			for (int contImpressao = 0; contImpressao < qtdeFaturas; contImpressao++) {
				if (faturasVetor[contImpressao].getCliente() == cliente) {
					System.out.println("\n\n" + (encontrado + 1) + "° Fatura\n\n");
					faturasVetor[contImpressao].toString();
					encontrado++;
				}
			}
		}
		if (encontrado == 0) {
			System.out.println("\n\nO CLIENTE NÃO HÁ FATURAS ");
		}
		teclado.close();
	}

	public static void faturaPorMes() {
		int encontrado = 0;
		int mesEscolhido=0;
		Scanner teclado = new Scanner(System.in);
		if (qtdeFaturas == 0) {
			System.out.println("\nNÃO HÁ NADA PARA IMPRIMIR");
		} else {
			System.out.println("\n\nInforme o mês a ser pesquisado: ");
			mesEscolhido = teclado.nextInt();
			
			System.out.println("\n\n======== FATURAS NO MÊS " + mesEscolhido + " ======= ");
			for (int contImpressao = 0; contImpressao < qtdeFaturas; contImpressao++) {
				if (faturasVetor[contImpressao].getMesAno() == mesEscolhido ) {
					System.out.println("\n\n" + (encontrado + 1) + "° Fatura do Mes\n\n");
					faturasVetor[contImpressao].toString();
					encontrado++;
				}
			}
		}
		if (encontrado == 0) {
			System.out.println("\n\nNÃO HÁ FATURAS NESTE MÊS ");
		}
		teclado.close();
	}

	public static Endereco cadastrarEndereco() {
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
		return endereco;
	}
}
