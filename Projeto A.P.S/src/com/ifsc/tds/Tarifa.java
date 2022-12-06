package com.ifsc.tds;

public class Tarifa {
	private double tarResidencial1 = 0.3879 ;
	
	private double tarResidencial = 0.4500 ;
	
	private double tarComercial1 = 0.42550 ;
	
	private double tarComercial2 = 0.45113 ;
	
	private double icms = 27;
	
	private double taxalluminacaoPublica = 7.8;

	public double getTarResidencial1() {
		return tarResidencial1;
	}

	public void setTarResidencial1(double tarResidencial1) {
		this.tarResidencial1 = tarResidencial1;
	}

	public double getTarResidencial() {
		return tarResidencial;
	}

	public void setTarResidencial(double tarResidencial) {
		this.tarResidencial = tarResidencial;
	}

	public double getTarComercial1() {
		return tarComercial1;
	}

	public void setTarComercial1(double tarComercial1) {
		this.tarComercial1 = tarComercial1;
	}

	public double getTarComercial2() {
		return tarComercial2;
	}

	public void setTarComercial2(double tarComercial2) {
		this.tarComercial2 = tarComercial2;
	}

	public double getIcms() {
		return icms;
	}

	public void setIcms(double icms) {
		this.icms = icms;
	}

	public double getTaxalluminacaoPublica() {
		return taxalluminacaoPublica;
	}

	public void setTaxalluminacaoPublica(double taxalluminacaoPublica) {
		this.taxalluminacaoPublica = taxalluminacaoPublica;
	}
}
