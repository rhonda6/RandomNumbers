/**
 * 
 */
package models;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;

/**
 * @author Rafhael Honda da Silva
 * @author José Roberto Felix da Silva
 *
 */
public class Cassino {

	private ArrayList<ImageIcon> listaImagens = new ArrayList<ImageIcon>();

	private int quantidadeVitorias;

	public int getQuantidadeVitorias() {
		return quantidadeVitorias;
	}

	public void setQuantidadeVitorias(int quantidadeVitorias) {
		this.quantidadeVitorias = quantidadeVitorias;
	}

	private int quantidadeJogadas;

	public int getQuantidadeJogadas() {
		return quantidadeJogadas;
	}

	public void setQuantidadeJogadas(int quantidadeJogadas) {
		this.quantidadeJogadas = quantidadeJogadas;
	}

	private int numero1;

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	private int numero2;

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	private int numero3;

	public int getNumero3() {
		return numero3;
	}

	public void setNumero3(int numero3) {
		this.numero3 = numero3;
	}

	private int numero4;

	public int getNumero4() {
		return numero4;
	}
	
	private int validaRangeGrupoMin;
	
	public int getValidaRangeGrupoMin() {
		return validaRangeGrupoMin;
	}

	public void setValidaRangeGrupoMin(int validaRangeGrupoMin) {
		this.validaRangeGrupoMin = validaRangeGrupoMin;
	}

	private int validaRangeGrupoMax;
	public int getValidaRangeGrupoMax() {
		return validaRangeGrupoMax;
	}

	public void setValidaRangeGrupoMax(int validaRangeGrupoMax) {
		this.validaRangeGrupoMax = validaRangeGrupoMax;
	}

	public void setNumero4(int numero4) {
		this.numero4 = numero4;
	}

	private double saldoCassino;

	public double getSaldoCassino() {
		return saldoCassino;
	}

	public void setSaldoCassino(double saldoCassino) {
		this.saldoCassino = saldoCassino;
	}

	private double saldoJogador;

	public double getSaldoJogador() {
		return saldoJogador;
	}

	public void setSaldoJogador(double saldoJogador) {
		this.saldoJogador = saldoJogador;
	}

	private double premio;

	public double getPremio() {
		return premio;
	}

	public void setPremio(double premio) {
		this.premio = premio;
	}

	private double aposta;

	public double getAposta() {
		return aposta;
	}

	public void setAposta(double aposta) {
		this.aposta = aposta;
	}

	public Cassino() {
		// TODO Auto-generated constructor stub
	}

	public int numeroAleatorio(int min, int max) {
		var random = new Random();
		return random.ints(min, max).findFirst().getAsInt();
	}

	public boolean validaJogada() {		
		
		for (int i = validaRangeGrupoMin; i <= validaRangeGrupoMax; i++) {
			if (this.numero1 == i && this.numero2 == i && this.numero3 == i && this.numero4 == i) {
				quantidadeVitorias++;
				return true;
			}
		}

		/*
		for (int i = 0; i <= 15; i++) {
			if (this.numero1 == i && this.numero2 == i && this.numero3 == i && this.numero4 == i) {
				quantidadeVitorias++;
				return true;
			}
		}
		*/

		return false;
	}

	public ArrayList<ImageIcon> grupoImagens() {
		ArrayList<ImageIcon> resultado = new ArrayList<ImageIcon>();
		ArrayList<Integer[]> grupos = new ArrayList<Integer[]>();

		Integer[] n1 = { 0, 1, 2, 3 };
		grupos.add(n1);

		Integer[] n2 = { 4, 5, 6, 7 };
		grupos.add(n2);

		Integer[] n3 = { 8, 9, 10, 11 };
		grupos.add(n3);

		Integer[] n4 = { 12, 13, 14, 15 };
		grupos.add(n4);		

		int numeroGrupo = numeroAleatorio(0, 3);

		var grupo = grupos.get(numeroGrupo);
		
		this.validaRangeGrupoMin = grupo[0];
		this.validaRangeGrupoMax = grupo[grupo.length - 1];

		//int ini = grupo[0];
		//int max = grupo[grupo.length - 1];

		this.numero1 = numeroAleatorio(validaRangeGrupoMin, validaRangeGrupoMax);
		this.numero2 = numeroAleatorio(validaRangeGrupoMin, validaRangeGrupoMax);
		this.numero3 = numeroAleatorio(validaRangeGrupoMin, validaRangeGrupoMax);
		this.numero4 = numeroAleatorio(validaRangeGrupoMin, validaRangeGrupoMax);

		var image1 = obtemImagemIcon(this.numero1);
		var image2 = obtemImagemIcon(this.numero2);
		var image3 = obtemImagemIcon(this.numero3);
		var image4 = obtemImagemIcon(this.numero4);

		resultado.add(image1);
		resultado.add(image2);
		resultado.add(image3);
		resultado.add(image4);

		return resultado;

	}

	public void carregaImagens() {
		this.listaImagens.add(carregaImagemIcon("Banana.png"));
		this.listaImagens.add(carregaImagemIcon("Cherry.png"));
		this.listaImagens.add(carregaImagemIcon("Plum.png"));
		this.listaImagens.add(carregaImagemIcon("Watermelon.png"));

		this.listaImagens.add(carregaImagemIcon("Chip-5.png"));
		this.listaImagens.add(carregaImagemIcon("Chip-25.png"));
		this.listaImagens.add(carregaImagemIcon("Chip-50.png"));
		this.listaImagens.add(carregaImagemIcon("Chip-100.png"));

		this.listaImagens.add(carregaImagemIcon("Diamond.png"));
		this.listaImagens.add(carregaImagemIcon("Gold.png"));
		this.listaImagens.add(carregaImagemIcon("Coin.png"));
		this.listaImagens.add(carregaImagemIcon("Money.png"));

		this.listaImagens.add(carregaImagemIcon("Bar.png"));
		this.listaImagens.add(carregaImagemIcon("Bell.png"));
		this.listaImagens.add(carregaImagemIcon("Seven.png"));
		this.listaImagens.add(carregaImagemIcon("Trollface.png"));

		// this.listaImagens.add(carregaImagemIcon("Clover.png"));
	}

	public ImageIcon carregaImagemIcon(String imageName) {
		return new ImageIcon(getClass().getResource("/images/" + imageName));
	}

	public ImageIcon obtemImagemIcon(int number) {
		return this.listaImagens.get(number);
	}

}
