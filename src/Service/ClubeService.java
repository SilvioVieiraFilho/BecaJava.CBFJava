package Service;

import Model.Clube;
import Repository.ClubeRepository;

public class ClubeService {
	
	


		public Clube getClube() {

			ClubeRepository clube = new ClubeRepository();
		

			return clube.GetPartida();
		}
		

	  
		public void  setClube(Clube clube) {
			
			ClubeRepository clube1 = new ClubeRepository();
			
			clube1.setListaDeClube(clube);
			
			
			
			
		}
		
	}



