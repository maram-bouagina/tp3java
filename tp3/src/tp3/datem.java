package tp3;
import java.util.Scanner;
public class datem{
	public static void main(String[] args) {
		/*Scanner s=new Scanner(System.in);
		System.out.println("donner une annee");
		int n=s.nextint();
		//float or double x=s.nextdouble();
		//String l=s.nextint();*/
		 Madate d1=new Madate(5);
		 d1.setjour(2);
		 d1.setmois(5);
		 d1.setannee(2004);
		 d1.setjour(7);
		 d1.setmois(1);
		 d1.setannee(2004);
		 
		/* d1.getjour();
		 d1.getmois();
		 d1.getannee();
		 d1.getjour();
		 d1.getmois();
		 d1.getannee);*/
		 Madate d2=new Madate(9,7,2);
		 d2.setjour(2);
		 d2.setmois(5);
		 d2.setannee(2004);
		 d2.setjour(7);
		 d2.setmois(1);
		 d2.setannee(2004);
		 
		 Madate d3=new Madate(1,5,6);
		 System.out.println(d1);
		 System.out.println(d2);
		 System.out.println(d3);
		 
		 System.out.println("choisissez un nombre");
		 System.out.println("1:Ajout d’un jour");
		 System.out.println("2:ajout de plusieurs jours");
		 System.out.println("3:Ajout d’un mois ");
		 System.out.println("4:Ajout d’une année");
		 Scanner s=new Scanner(System.in);
		 int b=s.nextInt();
		 switch (b) {
		 case 1:System.out.println("Ajout d’un jour");
		 d1.ajouterUnJour();
		 d2.ajouterUnJour();
		 d3.ajouterUnJour();
		 System.out.println(d1);
		 System.out.println(d2);
		 System.out.println(d3);
		 
		 break;
		 case 2:System.out.println(" ajout de plusieurs");
		 System.out.println("donner le nombre d'annee");
		 int n=s.nextInt();
			d1.ajouterPluseursJours(n);
			 d2.ajouterPluseursJours(n);
			 d3.ajouterPluseursJours(n);
			 System.out.println(d1);
			 System.out.println(d2);
			 System.out.println(d3);
			 break;
		 case 3:System.out.println("Ajout d’un mois");
		 d1.ajouterUnMoi();
		 d2.ajouterUnMoi();
		 d3.ajouterUnMoi();
		 System.out.println(d1);
		 System.out.println(d2);
		 System.out.println(d3);
		 
		 break;
		 case 4:System.out.println("Ajout d’une année");
		 d1.ajouterUnAn();
		 d2.ajouterUnAn();
		 d3.ajouterUnAn();
		 System.out.println(d1);
		 System.out.println(d2);
		 System.out.println(d3);
		 
		 break;
		 }
		
			 
			 
	}
}



