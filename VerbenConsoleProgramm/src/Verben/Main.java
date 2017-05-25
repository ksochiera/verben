package Verben;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		VerbenLaden verbenLaden = new VerbenLaden();
		//tabelle.hashCode();
		try {
			VerbenPruefung verbenPruefung =new VerbenPruefung(verbenLaden.dateiLaden());
		} catch (FileNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
