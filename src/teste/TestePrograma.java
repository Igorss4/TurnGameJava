package teste;

import personagens.InimigoTeste;
import personagens.Personagem;
import acoesDeBatalha.MetodosBatalha;

public class TestePrograma {

	public static void main(String[] args) {
		
		
		
		Personagem p1 = new Personagem("heroi",100,40,10,10,10,10);
		InimigoTeste t1 = new InimigoTeste("Enemy",100,50,10,10);
		MetodosBatalha m1 = new MetodosBatalha();
		
		System.out.println(p1);
		System.out.println(t1);
		System.out.println("");
		
		m1.ataquePersonagem(t1.getHp(),p1.getForca(),t1.getConstituicao());
		
		System.out.println(p1);
		System.out.println(t1);
		
	}

}
