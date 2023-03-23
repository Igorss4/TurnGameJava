package teste;


import personagens.Monstro;
import personagens.Personagem;


public class TestePrograma {

	public static void main(String[] args) {
		
		Personagem p1 = new Personagem("Guerreiro");
		Monstro m1 = new Monstro("Goblin",100,10,10);
		
		System.out.println(p1);
		System.out.println(m1);
		
		m1.atacar(p1);
		p1.atacar(m1);
		p1.ganharExperiencia(100);
		
		
		System.out.println(p1);
		System.out.println(m1);
	}

}
