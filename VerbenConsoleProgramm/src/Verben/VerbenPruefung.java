package Verben;

import java.awt.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class VerbenPruefung {
	String [][] verbenTabelle;
	Scanner fragenNo=new Scanner(System.in);
	Scanner in = new Scanner(System.in);
	int ergebnis=0;
	
	
	 public void verbenWahl(){
		 ArrayList<Integer> nummer =new ArrayList<Integer>();
		 
		 System.out.println("Ile pytan wybierasz?");
		 int fragenDefaultNummer=fragenNo.nextInt();
		 //in.reset();
		 //in.close();
		 
		 for (int i=0;i<verbenTabelle.length;i++){
			 if (verbenTabelle[i][0]!="null")
					 nummer.add(i);
		 }
		 
		 
		 Random random = new Random();
		 int fragenNummer=0;
		 while (nummer.isEmpty()==false && fragenNummer<fragenDefaultNummer){
			 int randVerbIndex=random.nextInt(nummer.size());
			 int verbIndex=nummer.get(randVerbIndex);
			 String polnischeVerb=verbenTabelle[verbIndex][0];
			 String infinitiv=verbenTabelle[verbIndex][1];
			 String praeteritum=verbenTabelle[verbIndex][2];
			 String partizip2=verbenTabelle[verbIndex][3];
			 nummer.remove(randVerbIndex);
			 int punkt=verbenFrage( polnischeVerb, partizip2,infinitiv,fragenNummer);
			 ergebnis+=punkt;
			 fragenNummer++;
			 
		 }
		 System.out.println(printResult(ergebnis));
	 }
	 public int verbenFrage(String polnischeVerb,String partizip2,String infinitiv, int fragenNummer){
		 System.out.println(String.valueOf(fragenNummer+1)+". Prosze podac 3 forme od wyrazu: "+polnischeVerb+" ("+infinitiv+")");
		 
		 String antwort = in.nextLine();
		 if (antwort.equals(partizip2)){
			 System.out.println("Brawo!");
			 System.out.println("");
			 return 1;
		 }
		 else {
			 System.out.println("Zle. Poprawna odpowiedz: "+partizip2);
			 System.out.println("");
			 return 0;
		 }
	 }
	 
	 public String printResult(int ergebniss){
		 String result="";
		 switch (ergebniss){
		 case 1: 
			 result="Zdobyłeś 1 punkt.";
			 break;
		 case 2:
			 result="Zdobyłeś 2 punkty.";
			 break;
		 case 3:
			 result="Zdobyłeś 3 punkty.";
			 break;
		 case 4:
			 result="Zdobyłeś 4 punkty.";
			 break;
		default:
			result="Zdobyłeś "+String.valueOf(ergebniss)+" punktów.";
			 break;
		 }
		 
		 return result;
	 }
	
	public  VerbenPruefung(String [][] verbenTabelle){
		this.verbenTabelle=verbenTabelle;
		verbenWahl();
	}

}
