package personagens;

public class Personagem {

	private String name;
	private double hp, mp;
	private double forca, constituicao, inteligencia, sorte;
//	private int pStatus, pSkill;

	public Personagem() {
	}
	
	public Personagem(String name, double hp, double mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	public Personagem(String name, double hp, double mp, int forca, int constituicao, int inteligencia, int sorte) {
		super();
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.forca = forca;
		this.constituicao = constituicao;
		this.inteligencia = inteligencia;
		this.sorte = sorte;
	}

	//encapsulamento
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		this.hp = hp;
	}

	public double getMp() {
		return mp;
	}

	public void setMp(double mp) {
		this.mp = mp;
	}

	public double getForca() {
		return forca;
	}

	public void setForca(double forca) {
		this.forca = forca;
	}

	public double getConstituicao() {
		return constituicao;
	}

	public void setConstituicao(double constituicao) {
		this.constituicao = constituicao;
	}

	public double getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(double inteligencia) {
		this.inteligencia = inteligencia;
	}

	public double getSorte() {
		return sorte;
	}

	public void setSorte(double sorte) {
		this.sorte = sorte;
	}
	
	

	//metodos
	public String ataqueBase1() {
		return "usando ataque basico";
	}

	public String ataqueBase2() {
		return "usando outro ataque basico";
	}

	public String ataqueEspecial1() {
		return "usando ataque especial";
	}

	public String ataqueEspecial2() {
		return "usando outro ataque especial";
	}
	
	public String toString() {
		return "Perfil: Nome: "+ name + ", HP: " + hp + ", MP: " + mp;
	}

}
