package principal;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import model.Usuario;

public class Principal {

	public static void main(String[] args) {

		Usuario usuario = new Usuario(1.0,"Fabricio Junior", true);
		Usuario usuario1 = new Usuario(10.0,"Luiz de Campos", false);
		Usuario usuario2 = new Usuario(20.0,"Bianca Caroline", true);
		Usuario usuario3 = new Usuario(5.0,"Fabiana Caroline", false);
		Usuario usuario4 = new Usuario(119.0,"Vanda Valle", false);
		
		List<Usuario> usuarios = Arrays.asList(usuario, usuario1, usuario2, usuario3, usuario4);
		
		// jeito comum de percorrer uma lista
		
		for (Usuario usuario5 : usuarios) {
			System.out.println(usuario5);
		}
		
		usuarios.forEach(u -> System.out.println(u.getNome()));
		
		Consumer<Usuario> consumer =  u -> System.out.println(u.getPontos());
		
		usuarios.forEach(consumer);
		
		usuarios.forEach(u -> u.isModerador());
		
	}

}
