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
		return 0;
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
