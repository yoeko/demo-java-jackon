package presentation;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import metier.Employe;

public class Lanceur {

	public static void main(String[] args) throws IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		Employe employe = new Employe("Ba", "Amadou");
		
		//Objet vers fichier Json
		File resultFile = new File("employe.json");
		mapper.writeValue(resultFile, employe);
		
	}

}
