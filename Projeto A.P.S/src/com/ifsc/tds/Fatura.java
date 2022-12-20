package com.ifsc.tds;

public class Fatura {
	
	public Fatura (int faturaId, int MesAno, UC unidadeConsumidora, int consumo, boolean pago, Cliente cliente) {
		this.faturald = faturaId;
		this.MesAno = MesAno;
		this.unidadeConsumidora = unidadeConsumidora;
		this.consumo = consumo;
		this.pago = pago;
		this.cliente= cliente;
	}
	
	private int faturald;
	
	private int MesAno;
	
	private UC unidadeConsumidora ;
	
	private int consumo;
	
	private boolean pago;
	
	private Cliente cliente;
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getFaturald() {
		return faturald;
	}

	public void setFaturald(int faturald) {
		this.faturald = faturald;
	}

	public int getMesAno() {
		return MesAno;
	}

	public void setMesAno(int mesAno) {
		MesAno = mesAno;
	}

	public UC getUnidadeConsumidora() {
		return unidadeConsumidora;
	}

	public void setUnidadeConsumidora(UC unidadeConsumidora) {
		this.unidadeConsumidora = unidadeConsumidora;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}
	
	public double calcularValorFatura () {
		Tarifa tarifa = new Tarifa();
		Double valor= (double) 0;
		
		if (this.cliente.tipoCliente() == 0) { //Pessoa Fisíca
			if (consumo <= 200) {
				valor += consumo * tarifa.getTarResidencial1();
			}
			else {
				valor += consumo * tarifa.getTarResidencial2();
			}
		}
		else { //Pessoa Juridca (1)
			if (consumo <= 500) {
				valor += consumo * tarifa.getTarComercial1();
			}
			else {
				valor += consumo * tarifa.getTarComercial2();
			}
		}
		
		valor += tarifa.getIcms();
		valor += tarifa.getTaxalluminacaoPublica();
		
		return valor;
	}
	public String toString () {
		String texto = "";
		texto = "-----------------------------------"
				+"\n fatura: " + getFaturald()
				+ "\n Mes e Ano" + getMesAno()
				+ "\n unidade Consumidora" + getUnidadeConsumidora().toString()
				+ "\n consumo" + getConsumo()
				+ "\n pago" + isPago();
		return texto;
	}
	
	public void imprimirFatura (Fatura vetor[]) {
		System.out.println(vetor);
	}
	

}
