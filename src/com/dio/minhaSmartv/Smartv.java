
/*DESAFIO: Criar controle de SmarTV com as seguintes características:
	>Ligar e desligar
	>Aumentar ou diminuir o volume em +1 ou -1
	>Mudar de canal de 1 em 1 ou inserindo um número específico
*/
package com.dio.minhaSmartv;

public class Smartv {
	
	public boolean ligado = false;
	public int volume = 25;
	public int canal = 1;
	
	
	public void ligar() {
		this.ligado = true;
	}
	
	public void desligar() {
		this.ligado = false;
	}
	
	public void aumentarVolume() {
		volume++;
		System.out.println("Aumentando volume para: " + volume);
	}
	
	public void diminuirVolume() {
		volume--;
		System.out.println("Diminuindo volume para: " + volume);
	}
	
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
