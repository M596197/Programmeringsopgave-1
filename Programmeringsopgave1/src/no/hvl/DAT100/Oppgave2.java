package no.hvl.DAT100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class Oppgave2 {

	public static void main(String[] args) {
		
		int antkar = 10;//antall det skal gjennomføres
		
		for(int i=1; i<=antkar; i++) { 
		
		String svar = showInputDialog("Skriv inn hvilke poengsum du fikk"); 
		int poeng = parseInt(svar);
		String karakter;
		
		if (poeng>100 || poeng < 0) {
			karakter = "Gyldige verdier er fra 0 til 100";
		}else 
		
		{
		if (poeng <= 39) {
			karakter = "F. Her må det jobbes";
		} else if (poeng >39 && poeng <=49) {
			karakter = "E. Akkurat ståkarakter";
		} else if (poeng >49 && poeng <=59) {
			karakter = "D. Du har fått karakteren D";
		}else if (poeng >59 && poeng <=79 ){
			karakter = "C. Du har fått karakteren C";
		}else if (poeng >79 && poeng <=89) {
			karakter = "B. Du har fått karakteren B. Bra jobbet";
		}else {
			karakter ="A. Gratulerer. Du har fått A!!";
		}
		}
		
		showMessageDialog(null, karakter);
		}
		
	}

}
