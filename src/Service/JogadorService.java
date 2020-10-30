import Model.Jogador;
import Model.Partida;
import Repository.JogadorRepository;
import Repository.PartidaRepository;

public class JogadorService {

	public Jogador getJogadorr() {

		JogadorRepository jogador = new JogadorRepository();
	

		return jogador.GetJogador();
		
	}
	

  
	public void  setJogadorr(Jogador jogador) {
		
		JogadorRepository jogador1 = new JogadorRepository();
		
		jogador1.setListaDeJogador(jogador);
		
		
	}
	
}
	