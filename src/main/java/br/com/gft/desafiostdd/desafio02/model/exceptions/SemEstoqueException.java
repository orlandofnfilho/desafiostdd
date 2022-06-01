package br.com.gft.desafiostdd.desafio02.model.exceptions;

public class SemEstoqueException extends RuntimeException {

	private static final long serialVersionUID = 7753868804134138497L;

	public SemEstoqueException(String msg) {
		super(msg);
	}

}
