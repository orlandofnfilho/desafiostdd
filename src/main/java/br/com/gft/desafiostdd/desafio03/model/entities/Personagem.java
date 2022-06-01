package br.com.gft.desafiostdd.desafio03.model.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Personagem {

	private String nome;
	private int vida;
	private int mana;
	private float xp;
	private int inteligencia;
	private int forca;
	private int level;

	private static Integer sequence = 0;

	public Personagem() {

	}

	public Personagem(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		this.nome = nome;
		this.vida = vida;
		this.mana = mana;
		this.xp = xp;
		this.inteligencia = inteligencia;
		this.forca = forca;
		this.level = level;
		sequence++;
	}

	public static Integer getSequence() {
		return sequence;
	}

	public void lvlUp() {
		level++;
	}

}
