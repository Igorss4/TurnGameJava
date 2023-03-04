package acoesDeBatalha;

import personagens.InimigoTeste;
import personagens.Personagem;

public class MetodosBatalha {
	
	Personagem p1 = new Personagem();
	InimigoTeste t1 = new InimigoTeste();
	
	public String name, msg;
	public double hp, mp;
	public double forca, constituicao, dano;
	
	public double ataquePersonagem(double hp, double forca, double constituicao) {
		
		this.dano = p1.getForca() - (t1.getConstituicao()*0.37);
		t1.setHp(hp -= this.dano);
		System.out.println("inimigo levou " + this.dano + " de dano");
		return hp;
		
	}

}
