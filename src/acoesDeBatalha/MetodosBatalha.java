package acoesDeBatalha;

import personagens.InimigoTeste;
import personagens.Personagem;

public class MetodosBatalha {
	
	private Personagem personagem;
    private InimigoTeste inimigo;
    
    public MetodosBatalha(Personagem personagem, InimigoTeste inimigo) {
        this.personagem = personagem;
        this.inimigo = inimigo;
    }
    
    public void ataquePersonagem() {
        double dano = personagem.getForca() - (inimigo.getConstituicao() * 0.37);
        inimigo.setHp(inimigo.getHp() - dano);
        personagem.setHp(personagem.getHp() - inimigo.getForca());
        System.out.println("O inimigo levou " + dano + " de dano");
        System.out.println("O personagem levou " + inimigo.getForca() + " de dano");
    }
}