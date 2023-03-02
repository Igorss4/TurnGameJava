package personagens;

public class BasePersonagem {

	public String name;
	public double hp, mp, exp;
	public int forca, constituicao, inteligencia, sorte;
	public int pStatus, pSkill;

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

}
