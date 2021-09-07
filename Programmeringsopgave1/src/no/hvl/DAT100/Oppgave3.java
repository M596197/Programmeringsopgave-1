package no.hvl.DAT100;
import static javax.swing.JOptionPane.*;
public class Oppgave3 {
 
	public static void main(String[] args) {
		String tallTxt = showInputDialog("Skriv inn et tall");
		int tall = Integer.parseInt(tallTxt);
		int total=1;
		int førsteTall=tall;
		
		if(tall<=0) {
			System.out.println("Skriv inn et tall som er over 0");
		}else {
		while(tall>1){
		   total *=tall;
		   tall--; 
		}
		System.out.println("Summen av " + førsteTall + "! er " + total);
		}
	}
	
}
