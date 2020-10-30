import Model.Ingressos;
import Model.Partida;
import Repository.IngressosRepository;
import Repository.PartidaRepository;

public class IngressosService {

	public Ingressos getIngressos() {

		IngressosRepository ingressos = new IngressosRepository();
	

		return ingressos.GetIngressos();
	}
	

  
	public void  setIngressoss(Ingressos ingressos) {
		
		IngressosRepository ingressos1 = new IngressosRepository();
		
		ingressos1.setListaDeIngressos(ingressos);
		
		
		
		
	}
	
}
