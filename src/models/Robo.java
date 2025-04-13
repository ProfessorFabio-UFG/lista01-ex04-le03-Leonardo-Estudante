package models;

public class Robo {
	private double id;
	private String status;
	private int posicaoX;
	private int posicaoY;
	private int qtdPo;
	private int limitePo;

	// Construtor
	public Robo(double id, int limitePo) {
		super();
		this.id = id;
		this.status = "desligado";
		this.posicaoX = 0;
		this.posicaoY = 0;
		this.qtdPo = 0;
		this.limitePo = limitePo;
	}

	// Getters and Setters
	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getPosicaoX() {
		return posicaoX;
	}

	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}

	public int getQtdPo() {
		return qtdPo;
	}

	public void setQtdPo(int qtdPo) {
		this.qtdPo = qtdPo;
	}

	public int getLimitePo() {
		return limitePo;
	}

	public void setLimitePo(int limitePo) {
		this.limitePo = limitePo;
	}

	// Métodos
	public void ligar() {
		setStatus("ligado");
	}

	public void desligar() {
		setStatus("desligado");
	}

	public void andar(int posX, int posY) {
		if (getStatus().equalsIgnoreCase("ligado")) {
			this.posicaoX += posX;
			this.posicaoY += posY;
			setStatus("andando");
		} else {
			return;
		}
	}

	public void aspirar(int qtdPo) {
		if (getStatus().equalsIgnoreCase("ligado") || getStatus().equalsIgnoreCase("andando")) {
			this.qtdPo += qtdPo;
			if (getQtdPo() > getLimitePo()) {
				setStatus("desligado");
				System.out.println("ERRO - Ultrapassou o limite");
			}
		} else {
			return;
		}
	}

	public void parar() {
		setStatus("parado");
	}

	@Override
	public String toString() {
		return "Robo [id=" + id + ", status=" + status + ", posicaoX=" + posicaoX + ", posicaoY=" + posicaoY
				+ ", qtdPo=" + qtdPo + ", limitePo=" + limitePo + "]";
	}

}
