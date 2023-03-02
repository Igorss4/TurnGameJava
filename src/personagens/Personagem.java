package personagens;

public class Personagem {

	private String name;
	private double hp, mp;
//	private int forca, constituicao, inteligencia, sorte;
//	private int pStatus, pSkill;

	public Personagem() {
	}
	
	public Personagem(String name, double hp, double mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
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
		return "alguma coisa";
	}

}
