package br.com.gft.desafiostdd.desafio03.model.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Guerreiro extends Personagem {

	private List<String> habilidade = new ArrayList<>();

	private static Random r = new Random();

	public Guerreiro() {

	}

	@Builder(builderMethodName = "guerreiroBuilder")
	public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
	}

	public List<String> getHabilidade() {
		return habilidade;
	}

	public int attack() {
		int ataqueFisico = 0;
		ataqueFisico = getForca() * getLevel() + r.nextInt(301);
		return ataqueFisico;

	}

	public void aprenderHabilidade(String habilidade) {
		this.habilidade.add(habilidade);
	}

	@Override
	public void lvlUp() {
		super.lvlUp();
		this.setVida(getVida() + 600);
		this.setMana(getMana() + 200);
		this.setForca(getForca() + 10);
		this.setInteligencia(getInteligencia() + 1);

	}

	@Override
	public String toString() {
		return "Guerreiro [habilidade=" + habilidade + ", nome=" + getNome() + ", vida=" + getVida() + ", mana="
				+ getMana() + ", xp=" + getXp() + ", inteligencia=" + getInteligencia() + ", forca=" + getForca()
				+ ", level=" + getLevel() + "]";
	}

}
