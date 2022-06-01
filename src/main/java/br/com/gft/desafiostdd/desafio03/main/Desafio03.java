package br.com.gft.desafiostdd.desafio03.main;

import java.util.Locale;

import br.com.gft.desafiostdd.desafio03.model.entities.Guerreiro;
import br.com.gft.desafiostdd.desafio03.model.entities.Mago;
import br.com.gft.desafiostdd.desafio03.model.entities.Personagem;

public class Desafio03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try {
			Mago m1 = Mago.magobuilder().nome("Exeqt0r").vida(3000).mana(5000).xp(90).inteligencia(125).forca(40)
					.level(80).build();

			m1.aprenderMagia("Wind vortex");
			m1.aprenderMagia("Hurricane");
			m1.aprenderMagia("Silence");

			Guerreiro g1 = Guerreiro.guerreiroBuilder().nome("DeathSmell").vida(9000).mana(1500).xp(70).inteligencia(35)
					.forca(135).level(80).build();

			g1.aprenderHabilidade("Triple Sonic Slash");
			g1.aprenderHabilidade("Battle Roar");
			g1.aprenderHabilidade("Duelist Spirit");

			System.out.println();
			System.out.println("-----------Desafio 3-----------");
			System.out.println(m1);
			m1.lvlUp();
			System.out.println(m1);

			System.out.println(g1);
			g1.lvlUp();
			System.out.println(g1);

			System.out.println();
			System.out.println(m1.getNome() + " atacou com: " + m1.attack() + " de dano mágico");
			System.out.println(g1.getNome() + " atacou com: " + g1.attack() + " de dano fisico");

			System.out.println();
			System.out.println("Quantidade de personagens criados: " + Personagem.getSequence());

		} catch (RuntimeException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
