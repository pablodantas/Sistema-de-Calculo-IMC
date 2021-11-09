package entities;

import java.io.Serializable;

public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private Double altura;
	private Double peso;
	public String Bann = "";

	public Product() {

	}

	public Product(String name, Double altura, Double peso) {
		super();
		this.name = name;
		this.altura = altura;
		this.peso = peso;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public double total() {
		return peso/(altura*altura);
	}

	@Override

	public String toString() {
		return Bann + String.format("Nome Completo:%s%n", name) + String.format("Altura:%.2f %n", altura)
				+ String.format("Peso:%.2f%n", peso)
				+ String.format("IMC ideal:%.2f%n", total());
	}

}
