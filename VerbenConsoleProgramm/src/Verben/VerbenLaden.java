package Verben;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class VerbenLaden {
	File file = new File("src/Dateien/Verben.txt");
	String[][] verbenTabelle;
	
	public String[][] dateiLaden() throws FileNotFoundException,IOException{
		BufferedReader inputStream = new BufferedReader(new FileReader(file));
		String aux="";
		int row=0;
		
		//Sprawdzenie liczby linijek w pliku
		int lines=0;

		while (inputStream.readLine()!=null)lines++;
		inputStream = new BufferedReader(new FileReader(file));

		//System.out.println(lines);
		verbenTabelle = new String[lines][4];
		//System.out.println(verbenTabelle.length);
		while ((aux=inputStream.readLine())!=null){
			
			String [] auxSplit=aux.split(";");
			//System.out.println(Arrays.toString(auxSplit));
			verbenTabelle[row]=auxSplit;
			
			row++;
		}
		
		return verbenTabelle;
	}
	public VerbenLaden(){
		
		
		
	}

}
