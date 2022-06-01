package br.com.gft.desafiostdd.desafio01.model.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.gft.desafiostdd.desafio01.model.entities.Veiculo;
import br.com.gft.desafiostdd.desafio01.model.exceptions.VeiculoException;

class VeiculoTest {

	private Veiculo veiculo;

	@BeforeEach
	public void setup() {
		veiculo = Veiculo.builder().marca("Honda").modelo("Civic").placa("KFJ-6624").cor("Preto").km(10000)
				.isLigado(false).litrosCombustivel(0).velocidade(0).preco(70000.0).build();
	}

	@Test
	@DisplayName("Deve ligar o veiculo isLigado => true")
	public void deveLigarOVeiculoRetornaTrue() {
		veiculo.ligar();
		Assertions.assertTrue(veiculo.isLigado());
	}

	@Test
	@DisplayName("Deve ligar o veiculo ligado => VeiculoLigadoExcpetion")
	public void deveLigaroVeiculoLigadoRetornaVeiculoException() {
		veiculo.ligar();
		Assertions.assertThrows(VeiculoException.class, () -> veiculo.ligar());
	}

	@Test
	@DisplayName("Deve desligar o veiculo isLigado => false")
	public void deveDesligarOVeiculoRetornaFalse() {
		veiculo.setLigado(true);
		veiculo.desligar();
		Assertions.assertFalse(veiculo.isLigado());
	}

	@Test
	@DisplayName("Deve desligar o veiculo desligado => Exception")
	public void deveDesligarOVeiculoDesligadoRetornaVeiculoException() {
		Assertions.assertThrows(VeiculoException.class, () -> veiculo.desligar());
	}

	@Test
	@DisplayName("Deve desligar o veiculo em movimento => VeiculoEmMovimentoException")
	public void deveDesligarOVeiculoEmMovimentoRetornaVeiculoException() {
		veiculo.ligar();
		veiculo.abastecer(30);
		veiculo.acelerar();
		Assertions.assertThrows(VeiculoException.class, () -> veiculo.desligar());

	}

	@Test
	@DisplayName("Deve pintar o veiculo com uma nova cor => true")
	public void devePintarOVeiculoRetornaNovaCor() {
		veiculo.pintar("Azul");
		Assertions.assertTrue("azul".equalsIgnoreCase(veiculo.getCor()));
	}

	@Test
	@DisplayName("Deve abastecer o veiculo => 40")
	public void deveAbastecerOVeiculoComUmCombustivel() {
		veiculo.abastecer(40);
		int combustivel = veiculo.getLitrosCombustivel();
		Assertions.assertEquals(40, combustivel);
	}

	@Test
	@DisplayName("Deve abastecer mais que a capacidade => QtdCombustivelException")
	public void deveAbastercerMaisQueACapacidadeRetornaQdtCombustivelException() {
		Assertions.assertThrows(VeiculoException.class, () -> veiculo.abastecer(70));
	}

	@Test
	@DisplayName("Deve abastecer mais do que a capacidade => TanqueCheioException")
	public void deveChecarACapacidadeDoTanqueRetornaVeiculoException() {
		veiculo.setLitrosCombustivel(60);
		Assertions.assertThrows(VeiculoException.class, () -> veiculo.abastecer(10));
	}

	@Test
	@DisplayName("Deve incrementar a velocidade do veiculo => 20")
	public void deveAcelerarOVeiculo() {
		veiculo.ligar();
		veiculo.abastecer(30);
		veiculo.acelerar();
		int velocidade = veiculo.getVelocidade();
		Assertions.assertEquals(20, velocidade);

	}

	@Test
	@DisplayName("Deve acelerar sem combustivel => VeiculoSemCombustivelException")
	public void deveAcelerarSemCombustivelRetornaVeiculoException() {
		veiculo.ligar();
		Assertions.assertThrows(VeiculoException.class, () -> veiculo.acelerar());
	}

	@Test
	@DisplayName("Deve acelerar o veiculo desligado => VeiculoDesligadoException")
	public void deveAcelerarOVeiculoDesligadoRetornaVeiculoException() {
		Assertions.assertThrows(VeiculoException.class, () -> veiculo.acelerar());
	}

	@Test
	@DisplayName("Deve decrementar a velocidade => 0")
	public void deveFrearOVeiculoDecrementandoAVelocidade() {
		veiculo.ligar();
		veiculo.abastecer(30);
		veiculo.acelerar();
		veiculo.frear();
		int velocidade = veiculo.getVelocidade();
		Assertions.assertEquals(0, velocidade);
	}

	@Test
	@DisplayName("Deve frear o veiculo ligado => VeiculoParadoException")
	public void deveFrearOVeiculoParadoRetornaVeiculoException() {
		veiculo.ligar();
		Assertions.assertThrows(VeiculoException.class, () -> veiculo.frear());
	}

	@Test
	@DisplayName("Deve frear o veiculo desligado => VeiculoDesligadoException")
	public void deveFrearOVeiculoDesligadoRetornaVeiculoException() {
		Assertions.assertThrows(VeiculoException.class, () -> veiculo.frear());
	}

}
