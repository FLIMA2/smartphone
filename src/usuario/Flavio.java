package usuario;

import Cellphone.apple.Iphone;
import funcionalidades.internet.Internet;
import funcionalidades.musica.Musica;
import funcionalidades.telefone.Telefone;

public class Flavio {
	public static void main(String[] args) {
		Iphone celular = new Iphone();

		Musica musica = celular;
		Internet internet = celular;
		Telefone telefone = celular;
		
		telefone.ligar();
		internet.navegador();
	    musica.ouvir();
		
	}

}
