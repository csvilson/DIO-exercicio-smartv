package com.dio.minhaSmartv;

public class Usuario {
	
	public static void main(String[] args) {
		
		Smartv smartv = new Smartv();
		
		System.out.println("Minha SmarTV se encontra: " + smartv.ligado);
		
		System.out.println("Atual volume da minha TV: " + smartv.volume);
		
		System.out.println("Atual canal da minha TV: " + smartv.canal);
	
		System.out.println("-----------------------------");
		
		smartv.ligar();
		System.out.println("Agora minha TV está: " + smartv.ligado);
		
		smartv.aumentarVolume();
		smartv.aumentarVolume();
		smartv.aumentarVolume();
		smartv.aumentarVolume();
		smartv.diminuirVolume();
		System.out.println("Novo volume da minha TV: " + smartv.volume);

		smartv.novoCanal(29);
		smartv.mudarCanalAumentando();
		smartv.mudarCanalAumentando();
		smartv.mudarCanalAumentando();
		smartv.mudarCanalDiminuindo();
		System.out.println("Novo canal da minha TV: " + smartv.canal);
	
	
	}//main

}//Usuario
