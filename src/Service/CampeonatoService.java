import Model.Campeonato;
import Model.Ingressos;
import Model.Partida;
import Repository.CampeonatoRepository;
import Repository.IngressosRepository;
import Repository.PartidaRepository;

public class CampeonatoService {

	public Campeonato getCampeonato() {

		CampeonatoRepository ingressos2 = new CampeonatoRepository();
	

		return ingressos2.GetPartida();
	}
	

  
	public void  setIngressoss(Campeonato campeonato) {
		
		CampeonatoRepository campeonato1 = new CampeonatoRepository();
		
		campeonato1.setListaDePartida(campeonato);
		
		
		
		
	}
	
}
