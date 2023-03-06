
package com.dio.minhaSmartv;

/** 
 *  <h2>Class SmarTV<h2>
 	Desafio da DIO - criar controle de SmarTV com as seguintes características:
	>Ligar e desligar
	>Aumentar ou diminuir o volume em +1 ou -1
	>Mudar de canal de 1 em 1 ou inserindo um número específico
	@autor Vilson Sousa
	@version 1.0
	@since 06/03/2023
*/
public class Smartv {
	
	public boolean ligado = false;
	public int volume = 25;
	public int canal = 1;
	
	/**
	 * Método ligar possui a finalidade de ligar a TV
	 */
	public void ligar() {
		this.ligado = true;
	}
	/**
	 * Método desligar possui a finalidade de desligar a TV
	 */
	public void desligar() {
		this.ligado = false;
	}
	
	/**
	 * Método aumentarVolume possui a finalidade de aumentar o volume da TV
	 */
	public void aumentarVolume() {
		volume++;
		System.out.println("Aumentando volume para: " + volume);
	}
	
	public void diminuirVolume() {
		volume--;
		System.out.println("Diminuindo volume para: " + volume);
	}
	
	/**
	 * Método novoCanal possui a finalidade de mudar de canal a partir de um número específico
	 * @param outroCanal 
	 */
	public void novoCanal(int outroCanal) {
		canal = outroCanal;
	}
	
	public void mudarCanalAumentando() {
		canal++;
	}
	
	public void mudarCanalDiminuindo() {
		canal--;
	}
	
	
	

}//Smartv
