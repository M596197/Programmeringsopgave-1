package no.hvl.DAT100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class Oppgave1 {

	public static void main(String[] args) {
		String lønnTxt = showInputDialog("Skriv inn det du tjener for å beregne din skatt");
		int lønn = parseInt(lønnTxt);
		double totSkatt = 0;
		int lønnEn = 164100;
		int lønnTo = 230950;
		int lønnTre = 580650;
		int lønnFire =934050;
		
		double skattFire=0.1452;
		double skattTre=0.1152;
		double skattTo=0.0241;
		double skattEn =0.0093;
		
		if (lønn>lønnFire) {
			totSkatt = 	((lønn - lønnFire)* skattFire)+
						((lønnFire- lønnTre)* skattTre)+
						((lønnTre - lønnTo)*skattTo)+
						((lønnTo - lønnEn)*skattEn);
			
		} else if(lønn<lønnFire && lønn > lønnTre) {
			totSkatt=   ((lønn - lønnTre)* skattTre)+
						((lønnTre-lønnTo)*skattTo)+
						((lønnTo-lønnEn)*skattEn);
			
		}else if(lønn<=lønnTre && lønn >= lønnTo){
			totSkatt = 	((lønn-lønnTo)*skattTo)+
						((lønnTo-lønnEn)*skattEn);
				
		}else if (lønn<=lønnTo && lønn>=lønnEn) {
			totSkatt = 	((lønn-lønnEn)*skattEn);
		}
		
		showMessageDialog(null,totSkatt + "kr skal betales i skatt");
	}
}
