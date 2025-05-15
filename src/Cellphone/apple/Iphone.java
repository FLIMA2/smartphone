package Cellphone.apple;

import funcionalidades.internet.Internet;
import funcionalidades.musica.Musica;
import funcionalidades.telefone.Telefone;

public class Iphone implements Internet,Musica,Telefone {

	public void navegador() {
		System.out.println("Acessando a internet no Iphone.");		
	}

	public void ouvir() {
		System.out.println("Ouvindo música no Iphone.");	
	}

	public void ligar() {
		System.out.println("Ligando para 9999-9999 no Iphone.");	
	}

}
