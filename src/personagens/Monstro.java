package personagens;

public class Monstro {
	private String nome;
	private int vida;
	private int forca;
	private int defesa;

	public Monstro(String nome, int vida, int forca, int defesa) {
		this.nome = nome;
		this.vida = vida;
		this.forca = forca;
		this.defesa = defesa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public void atacar(Personagem personagem) {
		int dano = this.forca - personagem.getDefesa();
		if (dano > 0) {
			System.out.println(this.nome + " atacou " + personagem.getNome() + " causando " + dano + " de dano!");
		} else {
			System.out.println(this.nome + " atacou " + personagem.getNome() + " mas não causou dano!");
		}
		personagem.receberDano(dano);
	}

	public void receberDano(int dano) {
		this.vida -= dano;
		System.out.println(this.nome + " recebeu " + dano + " de dano!");
		if (this.vida <= 0) {
			System.out.println(this.nome + " foi derrotado!");
		}
	}

	@Override
	public String toString() {
		return "Monstro [nome=" + nome + ", vida=" + vida + ", forca=" + forca + ", defesa=" + defesa + "]";
	}

	// getters e setters
}