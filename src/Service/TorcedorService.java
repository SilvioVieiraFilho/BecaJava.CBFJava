package Service;

import Model.Partida;
import Model.Torcedor;
import Repository.PartidaRepository;
import Repository.TorcedorRepository;

public class TorcedorService {

	public Torcedor getTorcedor() {

		TorcedorRepository torcedor = new TorcedorRepository();
	

		return torcedor.GetTorcedor();
	}
	

  
	public void  setTorcedorr(Torcedor torcedor) {
	
		TorcedorRepository torcedor1 = new TorcedorRepository();
		
		torcedor1.setListadeTorcedor(torcedor);
		
		
	}
	
	

}
