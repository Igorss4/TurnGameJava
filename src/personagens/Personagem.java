package personagens;

public class Personagem {
    private String nome;
    private int vida;
    private int mana;
    private int forca;
    private int defesa;
    private int nivel;
    private int experiencia;
    
    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;
        this.mana = 50;
        this.forca = 15;
        this.defesa = 10;
        this.nivel = 1;
        this.experiencia = 0;
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



	public int getMana() {
		return mana;
	}



	public void setMana(int mana) {
		this.mana = mana;
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



	public int getNivel() {
		return nivel;
	}



	public void setNivel(int nivel) {
		this.nivel = nivel;
	}



	public int getExperiencia() {
		return experiencia;
	}



	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}



	public void atacar(Monstro monstro) {
        int dano = this.forca - monstro.getDefesa();
        if (dano > 0) {
           
            System.out.println(this.nome + " atacou " + monstro.getNome() + " causando " + dano + " de dano!");
        } else {
            System.out.println(this.nome + " atacou " + monstro.getNome() + " mas não causou dano!");
        }
        monstro.receberDano(dano);
    }
    
    public void defender() {
        this.defesa += 2;
        System.out.println(this.nome + " está defendendo!");
    }
    
//    public void usarPoção(Poção poção) {
//        int vidaRecuperada = poção.getEfeito();
//        this.vida += vidaRecuperada;
//        System.out.println(this.nome + " usou uma poção de cura e recuperou " + vidaRecuperada + " de vida!");
//    }
    
    public void receberDano(int dano) {
        this.vida -= dano;
        System.out.println(this.nome + " recebeu " + dano + " de dano!");
        if (this.vida <= 0) {
            System.out.println(this.nome + " foi derrotado!");
        }
    }
    
    public void ganharExperiencia(int experiencia) {
        this.experiencia += experiencia;
        System.out.println(this.nome + " ganhou " + experiencia + " de experiência!");
        if (this.experiencia >= this.nivel * 100) {
            this.subirNivel();
        }
    }
    
    private void subirNivel() {
        this.nivel++;
        this.experiencia = 0;
        this.vida += 10;
        this.mana += 5;
        this.forca += 2;
        this.defesa += 1;
        System.out.println(this.nome + " subiu para o nível " + this.nivel + "!");
    }



	@Override
	public String toString() {
		return "Personagem [nome=" + nome + ", vida=" + vida + ", mana=" + mana + ", forca=" + forca + ", defesa="
				+ defesa + ", nivel=" + nivel + ", experiencia=" + experiencia + "]";
	}
    
   
}