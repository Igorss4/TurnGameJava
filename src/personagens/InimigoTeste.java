package personagens;

public class InimigoTeste {
	
	private String name;
	private double hp, mp;
	private double forca, constituicao;
	
	
	public InimigoTeste() {
		
	}

	public InimigoTeste(String name, double hp, double mp) {
		super();
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	public InimigoTeste(String name, double hp, double mp, int forca, int constituicao) {
		super();
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.forca = forca;
		this.constituicao = constituicao;
	}

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
	
	
	public String toString() {
		return "Perfil: Nome: "+ name + ", HP: " + hp + ", MP: " + mp;
	}
	
	

}
