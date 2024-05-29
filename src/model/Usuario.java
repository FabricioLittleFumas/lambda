package model;

public class Usuario {
	
	private double pontos;
	private String nome;
	private boolean moderador;
	
	
	public double getPontos() {
		return pontos;
	}
	public void setPontos(double pontos) {
		this.pontos = pontos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isModerador() {
		return moderador;
	}
	public void setModerador(boolean moderador) {
		this.moderador = moderador;
	}
	public Usuario(double pontos, String nome, boolean moderador) {
		this.pontos = pontos;
		this.nome = nome;
		this.moderador = moderador;
	}
	@Override
	public String toString() {
		return "Usuario [pontos=" + pontos + ", nome=" + nome + ", moderador=" + moderador + "]";
	}
	
	

}
